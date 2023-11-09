package components;

import java.io.File;

import javax.swing.JFileChooser;

public class FileChooser extends JFileChooser {
    
    public FileChooser(){
        this.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        this.setCurrentDirectory(new File("C:\\Users"));
    }
}
