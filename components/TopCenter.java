package components;

import javax.swing.JPanel;

public class TopCenter extends JPanel{
    
    public <T> TopCenter(Class<T> c, Radio radio){

        Button button = new Button("START", c, radio);
        this.add(button);
    }
}
