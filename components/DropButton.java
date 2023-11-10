package components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class DropButton extends JButton implements ActionListener{

    public static File imported = null;
    public static File importedFolder = null;

    public DropButton(){
        this.setText("IMPORT");
        this.setDropTarget(new DragDrop());
        this.setFocusPainted(false);
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(this.getModel().isArmed()){
            FileChooser chooser = new FileChooser();
            int returnVal = chooser.showOpenDialog(new JFrame());
            if(returnVal == JFileChooser.APPROVE_OPTION){
                File file = chooser.getSelectedFile();
                if(file != null){
                    importedFolder = file;
                }
            }
            System.out.println(importedFolder);
        }
    }
}
