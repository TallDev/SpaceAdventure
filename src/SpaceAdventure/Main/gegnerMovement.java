package SpaceAdventure.Main;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;


public class gegnerMovement {

    Timer movement;
    private int temp = 0;
    Random r = new Random();
    private int randomiseSystem = r.nextInt();
    public gegnerMovement() {

        for(int i=0;i <= Var.gegnerCount - 1;i++) {
            Var.gegnerx[i] = 20 + temp;
            Var.gegnery[i] = -100 - temp;
            if(Var.debugMode) {
                System.out.println(randomiseSystem);
            }

            if(randomiseSystem < 23) {
                temp += 160;
                randomiseSystem += 58;
            } else {
                temp += 160;
                randomiseSystem -= r.nextInt();
            }



        }

        movement = new Timer();
        movement.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {


            if(Var.gameStarted) {

                for(int i=0;i <= Var.gegnerCount - 1;i++) {
                    Var.gegnery[i] += Var.gegnerspeed[i];

                    if(Var.gegnery[i] >= Var.screenHeight) {
                        Var.gegnery[i] = -100;
                    }
                }

            }



            }
        }, 0, 9);

    }
}
