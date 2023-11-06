package components;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Button extends JButton implements ActionListener{

    private Class c;

    public <T> Button(String text, Class<T> c){
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
            c.getDeclaredConstructor().newInstance();
            }catch(Exception err){
                System.err.println(err);
            }
        // ImageFrame frame = new ImageFrame();
        }
    }
}
