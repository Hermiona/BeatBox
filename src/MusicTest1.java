import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.midi.*;

public class MusicTest1 {
    
    public void play(){
        try {
            Sequencer sequencer=MidiSystem.getSequencer();
            System.out.println("We got a sequencer");
        } catch (MidiUnavailableException ex) {
            Logger.getLogger(MusicTest1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        MusicTest1 mt=new MusicTest1();
        mt.play();
    }
}
