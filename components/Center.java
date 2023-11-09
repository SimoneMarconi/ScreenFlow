package components;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class Center extends JPanel{

    public CheckBox check;

    public <T> Center(Class<T> c){
        this.setLayout(new BorderLayout());
        Radio b = new Radio();
        check = new CheckBox();
        TopCenter a = new TopCenter(c, b, check);
        this.add(a, BorderLayout.NORTH);
        this.add(b, BorderLayout.SOUTH);
    }
}
