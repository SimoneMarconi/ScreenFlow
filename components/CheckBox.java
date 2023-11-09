package components;

import javax.swing.JCheckBox;

public class CheckBox extends JCheckBox {

    public CheckBox(){
        this.setText("Manual");
        this.setSelected(false);
        this.setFocusPainted(false);
    }
    
}
