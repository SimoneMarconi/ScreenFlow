package components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;

public class Button extends JButton implements ActionListener{

    private Class c;
    private Radio radio;

    public <T> Button(String text, Class<T> c, Radio radio){
        this.radio = radio;
        this.c = c;
        this.setText(text);
        this.setSize(30, 20);
        this.setFocusPainted(false);
        this.addActionListener(this);
    } 

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.getModel().isArmed()){
            try{
                if(radio.getSelected().equals("imported")){//controlla se la modalità è local
                    if(DropButton.importedFolder == null){
                        System.out.println("Images not loaded");
                    }else{
                        DropButton.imported = DropButton.importedFolder;
                        c.getDeclaredConstructor().newInstance();
                    }
                }else if(radio.getSelected().equals("online")){
                    System.out.println("database fetch");
                }else if(radio.getSelected().equals("default")){
                    File localDir = new File("../public");
                    if(localDir.listFiles() == null){
                        System.out.println("Images not loaded");
                        return;
                    }
                    DropButton.imported = localDir;
                    c.getDeclaredConstructor().newInstance();
                }
            }catch(Exception err){
                System.err.println(err);
            }
        }
    }
}
