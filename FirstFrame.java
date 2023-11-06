import java.awt.BorderLayout;
import java.util.Hashtable;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class FirstFrame extends JFrame{


    final int maxs = 300;
    final int mins = 5;
    final int base = 10;

    public FirstFrame(){

        Hashtable<Integer, JLabel> table = new Hashtable<Integer, JLabel>();
        table.put(5, new JLabel("5 sec"));
        table.put(maxs/2, new JLabel("2.30 min"));
        table.put(maxs, new JLabel("5 min"));

        this.setSize(600, 300);

        //slider handler
        JSlider slider = new JSlider(JSlider.VERTICAL, mins, maxs, base);
        slider.setPaintTrack(true);
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(50);
        slider.setMinorTickSpacing(10);
        slider.setSnapToTicks(true);
        slider.setLabelTable(table);
        slider.setPaintLabels(true);
        this.add(slider, BorderLayout.LINE_START);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }    
}
