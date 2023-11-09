package components;


import javax.swing.JPanel;

public class TopCenter extends JPanel{

    
    public <T> TopCenter(Class<T> c, Radio radio, CheckBox check){

        Button button = new Button("START", c, radio);
        this.add(check);
        this.add(button);
    }
}
