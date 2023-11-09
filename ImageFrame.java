import java.awt.Image;
import javax.swing.JFrame;
import components.DropButton;
import components.Slider;
import handlers.*;

public class ImageFrame extends JFrame{

    private ImagePanel panel;
    private Clock c;

    public ImageFrame(){

        if(Handle.loadFiles(DropButton.imported) != null){
            Image image = Handle.getRandomImage();

            this.setExtendedState(JFrame.MAXIMIZED_BOTH);//fa in modo che le dimensioni della finestra siano grandi come tutto lo schermo
            this.setUndecorated(true);//questo toglie la barra per le azioni in alto

            panel = new ImagePanel(image);
            this.add(panel);
            
            this.addKeyListener(new Listener(panel, this));

            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
            cycle();

        }
        
    }

    private void cycle(){
        if(FirstFrame.check()){
            return;
        }
        Slider slider = FirstFrame.getSlider();
        int val = slider.getValue();
        c = new Clock(panel, val);
    }

    public void stopCycle(){
        if(c != null){
            c.stop();
        }
    }
}
