import java.awt.Image;
import javax.swing.JFrame;

import handlers.*;

public class ImageFrame extends JFrame{
    public ImageFrame(){

        Handle.loadFiles();
        Image image = Handle.getRandomImage();

        this.setExtendedState(JFrame.MAXIMIZED_BOTH);//fa in modo che le dimensioni della finestra siano grandi come tutto lo schermo
        this.setUndecorated(true);//questo toglie la barra per le azioni in alto

        ImagePanel panel = new ImagePanel(image);
        this.add(panel);
        
        this.addKeyListener(new Listener(panel, this));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
