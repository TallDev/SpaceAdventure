package SpaceAdventure.Main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class optionsKeyHandler implements KeyListener {

    public void print(String s) {
        System.out.println(s);
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            if(Var.debugMode) {
                print("Pressed Key ESCAPE  [OptionKeyHandler]");
            }
            Var.optionsWindow.setVisible(false);
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
