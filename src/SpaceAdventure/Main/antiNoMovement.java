package SpaceAdventure.Main;

import java.util.Timer;
import java.util.TimerTask;

public class antiNoMovement {

    Timer timer;

    long startTime, stopTime, secs/*, startSaveTime = -1, stopSaveTime*/;


    public antiNoMovement() {

        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                if(Var.gameStarted) {
                /*    if(startSaveTime != -1) {
                        if()
                    } else {
                        startSaveTime = System.currentTimeMillis();
                    }*/

                    if(!Var.moveUp && !Var.moveDown && !Var.moveLeft && !Var.moveRight) {

                        if(startTime == -1) {

                            startTime = System.currentTimeMillis();

                        } else {

                            stopTime = System.currentTimeMillis();

                            // System.out.println("Start: " + startTime);
                            // System.out.println("Stop: " + stopTime);
                            secs = (stopTime - startTime) / 1000;

                            if(secs >= Var.noMovementTime && Var.life) {
                                Var.killPlayer("You stay longer as " + Var.noMovementTime + " seconds at the same position");

                            }

                        }

                    } else {
                        startTime = -1;
                        stopTime = -1;
                    }


                }



            }
        }, 0, 10);
    }

}
