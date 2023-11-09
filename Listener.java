import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Listener implements KeyListener{

    private ImagePanel panel;
    private ImageFrame frame;

    public Listener(ImagePanel p, ImageFrame f){
        this.frame = f;
        this.panel = p;
    }

    public void keyPressed(KeyEvent e){
        //aggiorna l'immagine quando viene premuto spazio
        if(e.getKeyCode() == KeyEvent.VK_SPACE){
            if(!FirstFrame.check()){
                return;
            }
            System.out.println("ok");
            panel.updateImage();
            return;
        }
        if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
            System.out.println("closing");
            frame.dispose();
            frame.stopCycle();
            return;
        }

    }
    
    public void keyReleased(KeyEvent e){
    }

    public void keyTyped(KeyEvent e ){
    }
}
