package audio;

import java.io.InputStream;
import javax.sound.sampled.*;

public class SFXPlayer {

    public static void play(String soundFile) {
        try {
            InputStream audioSrc = SFXPlayer.class.getResourceAsStream("/sound/" + soundFile);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioSrc);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (Exception e) {
            System.out.println("SFX error: " + e.getMessage());
        }
    }
}


