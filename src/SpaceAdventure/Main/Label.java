package SpaceAdventure.Main;

import javax.swing.*;
import java.awt.*;

public class Label extends JLabel{

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);


        // Background
        g.drawImage(Var.ib1, 0, Var.backgroundY1,800, 600, null);
        g.drawImage(Var.ib1, 0, Var.backgroundY2,800, 600, null);

        // Flamme
        if(Var.flammeAnimation == 0) {
            g.drawImage(Var.iflamme1, Var.x, Var.y + 60, 50, 50, null);
        } else if(Var.flammeAnimation == 1) {
            g.drawImage(Var.iflamme2, Var.x, Var.y + 60, 50, 50, null);
        }

        // Rakete
        g.drawImage(Var.irakete, Var.x, Var.y, 50, 70, null);


        // Schrott
        for(int i = 0; i <= 4; i++) {
            g.drawImage(Var.ischrott1, Var.schrottx1[i], Var.schrotty1[i], 48, 38, null);
        }
        for(int i = 0; i <= 1; i++) {
            g.drawImage(Var.ischrott2, Var.schrottx2[i], Var.schrotty2[i], 48, 38, null);
        }
        g.drawImage(Var.ischrott3, Var.schrottx3, Var.schrotty3, 48, 38, null);


        // Gegner
        for(int i = 0;i <= Var.gegnerCount - 1;i++) {
            g.drawImage(Var.igegner1, Var.gegnerx[i], Var.gegnery[i], 80, 60, null);
        }


        repaint();
    }

}
