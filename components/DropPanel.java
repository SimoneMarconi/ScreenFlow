package components;

import java.io.File;

import javax.swing.JButton;

public class DropPanel extends JButton{

    public static File dropped = null;

    public DropPanel(){
        this.setText("DROP");
        this.setDropTarget(new DragDrop());
        this.setFocusPainted(false);
    }
}
