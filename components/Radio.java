package components;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Radio extends JPanel{

    private ButtonGroup group;
    private JRadioButton local;
    private JRadioButton online;

    public Radio(){
        local = new JRadioButton("Local"); 
        online = new JRadioButton("Online");
        local.setSelected(true);
        local.setFocusPainted(false);
        online.setFocusPainted(false);

        group = new ButtonGroup();
        group.add(local);
        group.add(online);

        this.add(local);
        this.add(online);
    }

    public String getSelected(){
        if(local.isSelected()){
            return "local";
        }else if(online.isSelected()){
            return "online";
        }
        return null;
    }
}
