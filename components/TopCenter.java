package components;

import javax.swing.JPanel;

public class TopCenter extends JPanel{
    
    public <T> TopCenter(Class<T> c){

        Button button = new Button("START", c);
        this.add(button);
    }
}
