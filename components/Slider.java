package components;

import java.util.Hashtable;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class Slider extends JSlider{

    final int maxs = 300;
    final int mins = 5;
    final int base = 10;
    
    public Slider(){

        Hashtable<Integer, JLabel> table = new Hashtable<Integer, JLabel>();
        table.put(5, new JLabel("5 sec"));
        table.put(maxs/2, new JLabel("2.30 min"));
        table.put(maxs, new JLabel("5 min"));

        this.setMaximum(maxs);
        this.setMinimum(mins);
        this.setOrientation(JSlider.VERTICAL);
        this.setPaintTrack(true);
        this.setPaintTicks(true);
        this.setMajorTickSpacing(25);
        this.setMinorTickSpacing(5);
        this.setSnapToTicks(true);
        this.setLabelTable(table);
        this.setPaintLabels(true);
    }
}
