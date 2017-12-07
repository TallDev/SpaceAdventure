package SpaceAdventure.Main;

import java.util.Timer;
import java.util.TimerTask;

public class test {

    Timer a;

    public test() {
        a = new Timer();

        a.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                if(Var.debugMode) {
                    System.out.println("adifshu");
                }

            }
        }, 0, 10);

    }
}
