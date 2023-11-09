import java.awt.BorderLayout;

import javax.swing.JFrame;

import components.*;

public class FirstFrame extends JFrame{

    private static Slider slider;
    private static Center center;

    public FirstFrame(){
        
        this.setSize(600, 300);

        Label label = new Label();
        this.add(label, BorderLayout.PAGE_START);

        slider = new Slider();
        this.add(slider, BorderLayout.LINE_START);

        center = new Center(ImageFrame.class);
        this.add(center, BorderLayout.CENTER);

        DropPanel drop = new DropPanel();
        this.add(drop, BorderLayout.LINE_END);

        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }    

    public static Slider getSlider(){
        return slider;
    }

    public static Boolean check(){
        return center.check.isSelected();
    }
}
