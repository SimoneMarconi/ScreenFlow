import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Listener implements KeyListener{

    private MyPanel panel;
    private JFrame frame;

    public Listener(MyPanel p, JFrame f){
        this.frame = f;
        this.panel = p;
    }

    public void keyPressed(KeyEvent e){
        //aggiorna l'immagine quando viene premuto spazio
        if(e.getKeyCode() == KeyEvent.VK_SPACE){
            System.out.println("ok");
            panel.updateImage();
            return;
        }
        if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
            System.out.println("closing");
            frame.dispose();
            return;
        }

    }
    
    public void keyReleased(KeyEvent e){
    }

    public void keyTyped(KeyEvent e ){
    }
}
