package SpaceAdventure.Main;

import java.util.Timer;
import java.util.TimerTask;

public class SchrottKollision {

    public SchrottKollision() {
        Timer timer;
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

            }
        }, 0, 10);
    }



}