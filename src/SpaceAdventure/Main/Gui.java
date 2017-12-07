package SpaceAdventure.Main;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;

public class Gui {

    public Gui() {
        Var.jf1 = new JFrame();

        Var.jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Size
        Var.jf1.setSize(Var.screenWith, Var.screenHeight);
        Var.jf1.setResizable(Var.gameResizable);

        Var.jf1.setLocationRelativeTo(null);
        Var.jf1.setLayout(null);



        // Label
        Var.lbl1 = new Label();
        Var.lbl1.setBounds(0, 0, Var.screenWith, Var.screenHeight);
        Var.jf1.addKeyListener(new KeyHandler());
        Var.jf1.add(Var.lbl1);
        Var.lbl1.setVisible(true);

        // JLabel NameLabel = new JLabel(Var.gameTitle);
        // NameLabel.setBounds(90, 0, Var.screenWith, Var.screenHeight);
        // NameLabel.setVisible(true);

        //Var.jf1.add(NameLabel);


        /*
        Var.jf1.add(MainMenue.MainText);
        MainMenue.MainText.setVisible(true);
        */

        Var.jf1.setTitle(Var.gameTitle);

        Var.jf1.requestFocus();

        // Var.jf1.setIconImage(setIconImage(ImageIO.read(new File("resources/favicon.png"))));

        // TODO: Add Icon

        Var.jf1.setVisible(true);
    }

}
