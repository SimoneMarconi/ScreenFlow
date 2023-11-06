package components;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class Center extends JPanel{

    public <T> Center(Class<T> c){
        this.setLayout(new BorderLayout());
        TopCenter a = new TopCenter(c);
        Radio b = new Radio();
        this.add(a, BorderLayout.NORTH);
        this.add(b, BorderLayout.SOUTH);
    }
}
