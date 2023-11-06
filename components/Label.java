package components;

import java.awt.Font;

import javax.swing.JLabel;

public class Label extends JLabel{
    public Label(){
        this.setText("MENU");
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setFont(new Font("Arial", Font.BOLD, 16));
    }
}
