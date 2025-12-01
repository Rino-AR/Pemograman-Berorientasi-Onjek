package audio;

import java.io.File;
import javax.sound.sampled.*;

public class SFXPlayer {

    public static void play(String soundPath) {
        try {
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(new File(soundPath));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
        } catch (Exception e) {
            System.out.println("SFX error: " + e.getMessage());
        }
    }
}

