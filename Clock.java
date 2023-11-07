

import java.util.Timer;
import java.util.TimerTask;

public class Clock{

    private Timer timer;

    public Clock(ImagePanel panel, int sec){
        timer = new Timer();
        timer.schedule(new Task(panel), sec * 1000, sec * 1000);
    }

    public void stop(){
        timer.cancel();
    }
}

class Task extends TimerTask{

    private ImagePanel panel;

    Task(ImagePanel panel){
        this.panel = panel;
    }

    @Override
    public void run(){
        System.out.println("cambio");
        panel.updateImage();
    }
}


