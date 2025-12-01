import audio.SFXPlayer;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;


public class FlappyBird extends JPanel implements ActionListener, KeyListener {

    int boardWidth = 360;
    int boardHeight = 640;

    //image
    Image backgroundImg;
    Image birdImg;
    Image topPipeImg;
    Image bottomPipeImg;

     //Bird position
    int birdX = boardWidth / 8;
    int birdY = boardHeight / 2;
    int birdWidth = 34;
    int birdHeight = 24;

    class Bird {
        int x = birdX;
        int y = birdY;
        int width = birdWidth;
        int height = birdHeight;
        Image img;

        Bird(Image img) {
            this.img = img;
        }
    }

    //Pipes
    int pipeX = boardWidth;
    int pipeY = 0;
    int pipeWidth = 64; //scale pipe image to 64px width, scalled by 1/6
    int pipeHeight = 512;

    class Pipe {
        int x = pipeX;
        int y = pipeY;
        int width = pipeWidth;
        int height = pipeHeight;
        Image img;
        boolean passed = false;

        Pipe(Image img) {
            this.img = img;
        }
    }

    //Game logic
    Bird bird;
    ArrayList<Pipe> pipes = new ArrayList<>();
    Random random = new Random();

    Timer gameLoop;
    Timer placePipesTimer;

    int velocityX = -4; //move pipe to the left speed (simulates bird moving right)
    int velocityY = 0; //if (-) initial upward velocity, if 0 bird will fall immediately
    int gravity = 1; //gravity effect

    boolean gameOver = false;
    boolean gameStarted = false;   // Tambahan: permainan belum dimulai

    double score = 0;

    // Constructor
    FlappyBird() {
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setFocusable(true);
        addKeyListener(this);

        //load images
        backgroundImg = new ImageIcon(getClass().getResource("./flappybirdbg.png")).getImage();
        birdImg = new ImageIcon(getClass().getResource("./flappybird.png")).getImage();
        topPipeImg = new ImageIcon(getClass().getResource("./toppipe.png")).getImage();
        bottomPipeImg = new ImageIcon(getClass().getResource("./bottompipe.png")).getImage();

        bird = new Bird(birdImg);

        gameLoop = new Timer(1000 / 60, this); //1000/60 ms = 60 FPS =16.6
        placePipesTimer = new Timer(1500, e -> placePipes());
    }

    // Tempat pipes baru
    public void placePipes() {
        //(0-1)* pipeHeight/2 -> (0-256)
        //128
        //0 - 128 - (0-256) --> 1/4 to 3/4 of pipe height
        int randomY = (int) (pipeY - pipeHeight / 4 - Math.random() * (pipeHeight / 2));
        int openingSpace = boardHeight / 4;

        Pipe topPipe = new Pipe(topPipeImg);
        topPipe.y = randomY;

        Pipe bottomPipe = new Pipe(bottomPipeImg);
        bottomPipe.y = randomY + pipeHeight + openingSpace;

        pipes.add(topPipe);
        pipes.add(bottomPipe);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        g.drawImage(backgroundImg, 0, 0, boardWidth, boardHeight, null); //background

        // Jika game BELUM DIMULAI
        if (!gameStarted) {
            g.setColor(Color.white);
            g.setFont(new Font("Arial", Font.BOLD, 32));
            g.drawString("Press SPACE to Start", 30, boardHeight / 2);
            return;
        }

        // Bird
        g.drawImage(bird.img, bird.x, bird.y, bird.width, bird.height, null);

        // Pipes
        for (Pipe p : pipes) {
            g.drawImage(p.img, p.x, p.y, p.width, p.height, null);
        }

        // Score
        g.setColor(Color.white);
        g.setFont(new Font("Arial", Font.PLAIN, 32));

        if (gameOver) {
            g.drawString("Game Over! Score: " + (int) score, 10, 35);
        } else {
            g.drawString(String.valueOf((int) score), 10, 35);
        }
    }

    public void move() {
        if (!gameStarted) return;
        //bird movement
        velocityY += gravity;
        bird.y += velocityY;
        bird.y = Math.max(bird.y, 0); //prevent going above the screen

        //pipes movement
        for (Pipe p : pipes) {
            p.x += velocityX;

            //score
            if (!p.passed && bird.x > p.x + p.width) {
                score += 0.5; //each pair of pipes gives 1 point, there,s two pipes (top and bottom)
                p.passed = true;
                SFXPlayer.play("sfx_point.wav");
            }

            //check for collision
            if (collision(bird, p)) {
                SFXPlayer.play("sfx_die.wav");
                gameOver = true;
            }
        }

        if (bird.y > boardHeight) {
            SFXPlayer.play("sfx_die.wav");
            gameOver = true;
        }
    }

    public boolean collision(Bird a, Pipe b) {
        return a.x < b.x + b.width && //a's top left corner doesn't reach b's top right corner
                a.x + a.width > b.x && //a's top right corner passes b's top left corner
                a.y < b.y + b.height && //a's top left corner doesn't reach b's bottom left corner
                a.y + a.height > b.y; //a's bottom left corner passes b's top left corner
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        move();
        repaint();

        if (gameOver) {
            gameLoop.stop();
            placePipesTimer.stop();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_SPACE) {

            // START GAME
            if (!gameStarted) {
                gameStarted = true;
                gameLoop.start();
                placePipesTimer.start();
            }

            // BIRD JUMP
            velocityY = -9; //flap upwards
            SFXPlayer.play("sfx_wing.wav");

            //restart game
            if (gameOver) {
                bird.y = birdY;
                velocityY = 0;
                score = 0;
                pipes.clear();
                gameOver = false;

                gameStarted = true;
                gameLoop.start();
                placePipesTimer.start();
            }
        }
    }

    @Override public void keyTyped(KeyEvent e) {}
    @Override public void keyReleased(KeyEvent e) {}
}
