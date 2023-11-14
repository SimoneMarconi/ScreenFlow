package handlers;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Random;
import javax.imageio.ImageIO;

public class Handle {

    private static File[] fileList;
    private static File folder;
    private static Queue q;

    private static Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
    final private static int screenHeight = (int) size.getHeight();
    final private static int screenWidth = (int) size.getWidth();

    public static File[] loadFiles(File dpath){
        if(dpath != null){
            folder = dpath;
        }else{
            Path path = FileSystems.getDefault().getPath("public").toAbsolutePath();
            folder = new File(path.toString()); 
            System.out.println("eccolo "+folder);
            // folder = new File("../public");
        }
        System.out.println("eccomi" + folder);
        fileList = folder.listFiles();
        if(fileList.length == 0){
            System.out.println("empty folder inserted");
            return null;
        }

        int idx = fileList.length;
        if(idx == 1){
            idx = 0;
        }else{
            idx = fileList.length/2;
        }
        q = new Queue(idx);

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

