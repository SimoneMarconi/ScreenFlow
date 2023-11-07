import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import handlers.*;

public class ImagePanel extends JPanel{

    Image image;

    public ImagePanel(Image img){
        this.image = img;
    }

    public void updateImage(){
        Image rImage = Handle.getRandomImage();
        this.image = rImage;
        this.revalidate();
        this.repaint();
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }
}
