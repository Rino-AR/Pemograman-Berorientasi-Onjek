import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {

        int jawab = JOptionPane.showConfirmDialog(
            null,
            "Ready to play?",
            "Flappy Bird",
            JOptionPane.YES_NO_OPTION
        );

        // Jika pengguna pilih NO → aplikasi ditutup
        if (jawab != JOptionPane.YES_OPTION) {
            System.exit(0);
        }

        int boardWidth = 360;
        int boardHeight = 640;

        JFrame frame = new JFrame("Flappy Bird");
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack();
        flappyBird.requestFocus();
        frame.setVisible(true);
    }
}
