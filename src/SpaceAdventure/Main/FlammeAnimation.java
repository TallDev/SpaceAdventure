package SpaceAdventure.Main;

import java.util.Timer;
import java.util.TimerTask;

public class FlammeAnimation {

    Timer flamme;
    private int temp = 0;

    public FlammeAnimation() {
        flamme = new Timer();
        flamme.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                if(Var.gameStarted) {

                    if(temp == 0) {
                        Var.flammeAnimation = 0;
                        temp++;
                    } else if(temp == 1) {
                        Var.flammeAnimation = 1;
                        temp--;
                    }

                }



            }
        }, 0, 100);
    }
    }
