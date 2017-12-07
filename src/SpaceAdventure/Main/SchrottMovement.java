package SpaceAdventure.Main;

import java.util.Timer;
import java.util.TimerTask;

public class SchrottMovement {

    Timer movement;

    private int temp = 0;

    public SchrottMovement() {

        for(int i = 0; i < 4; i++) {

            Var.schrottx1[i] = 20 + temp;
            Var.schrotty1[i] = -200 - temp;

            temp += 160;
        }

        Var.schrotty2[0] = 266;
        Var.schrotty2[1] = 532;

        Var.schrotty2[0] = -1000;
        Var.schrotty2[1] = -1500;

        Var.schrottx3 = 375;
        Var.schrotty3 = -4000;


        movement = new Timer();

        movement.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                if (Var.gameStarted) {

                    for (int i = 0; i <= 4; i++) {
                        Var.schrotty1[i] += Var.schrottSpeed1[i];

                        if (Var.schrotty1[i] >= Var.screenHeight) {
                            Var.schrotty1[i] = -350;
                        }
                    }

                    for (int i = 0; i <= 1; i++) {
                        Var.schrotty2[i] += Var.schrottSpeed2[i];

                        if (Var.schrotty2[i] >= Var.screenHeight) {
                            Var.schrotty2[i] = -1500;
                        }
                    }

                    Var.schrotty3 += Var.schrottSpeed3;
                    if (Var.schrotty3 >= Var.screenHeight) {
                        Var.schrotty3 = -4000;
                    }

                }
            }
        }, 0,9);

    }

}
