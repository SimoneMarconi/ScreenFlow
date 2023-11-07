import java.awt.BorderLayout;
import javax.swing.JFrame;
import components.*;

public class FirstFrame extends JFrame{

    private static Slider slider;

    public FirstFrame(){
        
        this.setSize(600, 300);

        Label label = new Label();
        this.add(label, BorderLayout.PAGE_START);

        slider = new Slider();
        this.add(slider, BorderLayout.LINE_START);

        Center center = new Center(ImageFrame.class);
        this.add(center, BorderLayout.CENTER);

        // Button secondButton = new Button("DRAG");
        // this.add(secondButton, BorderLayout.LINE_END);

        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }    

    public static Slider getSlider(){
        return slider;
    }
}
