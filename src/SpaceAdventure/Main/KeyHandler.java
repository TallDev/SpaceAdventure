package SpaceAdventure.Main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class KeyHandler implements KeyListener{

    public static void print(String s) {
        System.out.println(s);
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if(e.getKeyCode() == Var.goUp) {
            if(Var.debugMode) {
                print("Pressed Key UP");
            }
            if(!Var.gameStarted) {
                print("  -->   Das Spiel beginnt");
                Var.gameStarted = true;
                Var.life = true;
                Var.verloren = false;
            }
            Var.moveUp = true;
        }
        if(e.getKeyCode() == Var.goDown) {
            if(Var.debugMode) {
                print("Pressed Key DOWN");
            }
            if(!Var.gameStarted) {
                print("  -->   Das Spiel beginnt");
                Var.gameStarted = true;
                Var.life = true;
                Var.verloren = false;
            }
            Var.moveDown = true;
        }
        if(e.getKeyCode() == Var.goLeft) {
            if(Var.debugMode) {
                print("Pressed Key LEFT");
            }
            if(!Var.gameStarted) {
                print("  -->   Das Spiel beginnt");
                Var.gameStarted = true;
                Var.life = true;
                Var.verloren = false;
            }
            Var.moveLeft = true;
        }
        if(e.getKeyCode() == Var.goRight) {
            if(Var.debugMode) {
                print("Pressed Key RIGHT");
            }
            if(!Var.gameStarted) {
                print("  -->   Das Spiel beginnt");
                Var.gameStarted = true;
                Var.life = true;
                Var.verloren = false;
            }
            Var.moveRight = true;
        }
        if(e.getKeyCode() == KeyEvent.VK_SPACE) {
            if(Var.debugMode) {
                print("Pressed Key SPACE");
            }
            if(!Var.gameStarted) {
                print("  -->   Das Spiel beginnt");
                Var.gameStarted = true;
                Var.life = true;
                Var.verloren = false;
            }

        }
        if(e.getKeyCode() == KeyEvent.VK_F1) {
            if(Var.debugMode) {
                print("Pressed Key F1");
            }
            Var.optionsWindow.setVisible(true);
        }
        if(e.getKeyCode() == KeyEvent.VK_L) {
            if(Var.debugMode) {
                print("Pressed Key L");
            }
                print("[KILL]");
                System.exit(1);

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

        if(e.getKeyCode() == Var.goUp) {
            Var.moveUp = false;
        }
        if(e.getKeyCode() == Var.goDown) {
            Var.moveDown = false;
        }
        if(e.getKeyCode() == Var.goLeft) {
            Var.moveLeft = false;
        }
        if(e.getKeyCode() == Var.goRight) {
            Var.moveRight = false;
        }
    }




}
