package components;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Radio extends JPanel{

    private ButtonGroup group;
    private JRadioButton local;
    private JRadioButton online;
    private JRadioButton base;

    public Radio(){
        local = new JRadioButton("Local"); 
        online = new JRadioButton("Online");
        base = new JRadioButton("Default");
        base.setSelected(true);
        local.setFocusPainted(false);
        online.setFocusPainted(false);
        base.setFocusPainted(false);

        group = new ButtonGroup();
        group.add(local);
        group.add(online);
        group.add(base);

        this.add(local);
        this.add(online);
        this.add(base);
    }

    public String getSelected(){
        if(local.isSelected()){
            return "local";
        }else if(online.isSelected()){
            return "online";
        }else if(base.isSelected()){
            return "default";
        }
        return null;
    }
}
