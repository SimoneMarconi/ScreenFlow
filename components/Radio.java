package components;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Radio extends JPanel{

    public Radio(){
        JRadioButton local = new JRadioButton("Local"); 
        JRadioButton online = new JRadioButton("Online");
        local.setSelected(true);
        local.setFocusPainted(false);
        online.setFocusPainted(false);

        ButtonGroup group = new ButtonGroup();
        group.add(local);
        group.add(online);

        this.add(local);
        this.add(online);
    }
}
