package handlers;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;
import javax.imageio.ImageIO;

public class Handle {

    private static File[] fileList;
    private static Queue q = new Queue(3);

    private static Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
    final private static int screenHeight = (int) size.getHeight();
    final private static int screenWidth = (int) size.getWidth();

    public static File[] loadFiles(){
        File folder = new File("C:\\Users\\Simone\\Projects\\Java\\ScreenFlow\\public");
        fileList = folder.listFiles();

        for(File file : fileList){
            System.out.println(file.getAbsolutePath());
        }
        return fileList;
    }

    public static Image getRandomImage(){
        BufferedImage image = null;
        int r; 
        do{
            r = new Random().nextInt(fileList.length);
        }while(q.search(r));
        q.add(r);
        File path = fileList[r];
        try {
            image = ImageIO.read(path);
        }catch(Exception e){
            e.printStackTrace();
        }
        return resize(image);
    }

    private static Image resize(Image img){

        Image image = img.getScaledInstance(screenWidth, screenHeight, Image.SCALE_SMOOTH);
        return image;
    }
}
