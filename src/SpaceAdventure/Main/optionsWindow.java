package SpaceAdventure.Main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class optionsWindow {

    public optionsWindow() {


        // Resizeable Radio
        JRadioButton ResizeableRadioButtonTrue = new JRadioButton("True");
        ResizeableRadioButtonTrue.setMnemonic(KeyEvent.VK_B);
        ResizeableRadioButtonTrue.setActionCommand("True");
        ResizeableRadioButtonTrue.setSelected(false);

        JRadioButton ResizeableRadioButtonFalse = new JRadioButton("False");
        ResizeableRadioButtonFalse.setMnemonic(KeyEvent.VK_C);
        ResizeableRadioButtonFalse.setActionCommand("False");
        ResizeableRadioButtonFalse.setSelected(true);

        ButtonGroup ResizeableRadioButtons = new ButtonGroup();
        ResizeableRadioButtons.add(ResizeableRadioButtonTrue);
        ResizeableRadioButtons.add(ResizeableRadioButtonFalse);

        if(Var.jf1.isResizable()) {
            ResizeableRadioButtonFalse.setVisible(true);
            ResizeableRadioButtonTrue.setVisible(false);
        } else {
            ResizeableRadioButtonFalse.setVisible(false);
            ResizeableRadioButtonTrue.setVisible(true);
        }

        ActionListener RadioResizeableTrueAL = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Var.jf1.setResizable(true);
                ResizeableRadioButtonFalse.setVisible(true);
                ResizeableRadioButtonTrue.setVisible(false);
            }
        };
        ActionListener RadioResizeableFalseAL = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResizeableRadioButtonFalse.setVisible(false);
                ResizeableRadioButtonTrue.setVisible(true);
                Var.jf1.setResizable(false);
            }
        };


        ResizeableRadioButtonTrue.addActionListener(RadioResizeableTrueAL);
        ResizeableRadioButtonFalse.addActionListener(RadioResizeableFalseAL);

        ResizeableRadioButtonTrue.setBounds(90, 0, Var.optionsScreenWith, Var.optionsScreenHeight);
        ResizeableRadioButtonFalse.setBounds(90, 0, Var.optionsScreenWith, Var.optionsScreenHeight);

        // ResizeableRadioButtonTrue.setBackground(Color.BLUE);   Help to find best Size
        // ResizeableRadioButtonFalse.setBackground(Color.BLUE);  Help to find best Size
        ResizeableRadioButtonFalse.setSize(60,20);
        ResizeableRadioButtonTrue.setSize(60,20);








        // DebugMode Radio
        JRadioButton DebugModeRadioButtonTrue = new JRadioButton("True");
        ResizeableRadioButtonTrue.setMnemonic(KeyEvent.VK_B);
        ResizeableRadioButtonTrue.setActionCommand("True");
        ResizeableRadioButtonTrue.setSelected(false);

        JRadioButton DebugModeRadioButtonFalse = new JRadioButton("False");
        ResizeableRadioButtonFalse.setMnemonic(KeyEvent.VK_C);
        ResizeableRadioButtonFalse.setActionCommand("False");
        ResizeableRadioButtonFalse.setSelected(true);

        ButtonGroup DebugModeRadioButtons = new ButtonGroup();
        DebugModeRadioButtons.add(DebugModeRadioButtonTrue);
        DebugModeRadioButtons.add(DebugModeRadioButtonFalse);

        if(Var.debugMode) {
            DebugModeRadioButtonFalse.setVisible(true);
            DebugModeRadioButtonTrue.setVisible(false);
        } else {
            ResizeableRadioButtonFalse.setVisible(false);
            ResizeableRadioButtonTrue.setVisible(true);
        }

        ActionListener RadioDebugModeTrueAL = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Var.debugMode = true;
                DebugModeRadioButtonFalse.setVisible(true);
                DebugModeRadioButtonTrue.setVisible(false);
            }
        };
        ActionListener RadioDebugModeFalseAL = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DebugModeRadioButtonFalse.setVisible(false);
                DebugModeRadioButtonTrue.setVisible(true);
                Var.debugMode = false;
            }
        };


        DebugModeRadioButtonTrue.addActionListener(RadioDebugModeTrueAL);
        DebugModeRadioButtonFalse.addActionListener(RadioDebugModeFalseAL);

        DebugModeRadioButtonTrue.setBounds(250, 0, Var.optionsScreenWith, Var.optionsScreenHeight);
        DebugModeRadioButtonFalse.setBounds(250, 0, Var.optionsScreenWith, Var.optionsScreenHeight);

        // DebugModeRadioButtonTrue.setBackground(Color.BLUE);   Help to find best Size
        // DebugModeRadioButtonFalse.setBackground(Color.BLUE);  Help to find best Size
        DebugModeRadioButtonFalse.setSize(60,20);
        DebugModeRadioButtonTrue.setSize(60,20);





        // GameTitle

        Var.GameTitleLabel = new JLabel("GameTitle: ");
        Var.GameTitle = new JTextField(Var.gameTitle, 20);
        Var.GameTitleChange = new JButton("Set GameTitle");

        Var.GameTitleLabel.setVisible(true);
        Var.GameTitle.setVisible(true);
        Var.GameTitleChange.setVisible(true);

        Var.GameTitleLabel.setBounds(0, 30, Var.optionsScreenWith, Var.optionsScreenHeight);
        Var.GameTitle.setBounds(80, 30, Var.optionsScreenWith, Var.optionsScreenHeight);
        Var.GameTitleChange.setBounds(200, 30, Var.optionsScreenWith, Var.optionsScreenHeight);

        Var.GameTitleLabel.setSize(80, 20);
        Var.GameTitle.setSize(110, 20);
        Var.GameTitleChange.setSize(120, 20);

        Var.GameTitleChange.setBackground(Color.green);


        ActionListener GameTitleButtonChange = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Var.gameTitle = Var.GameTitle.getText();
                Var.optionsTitle = Var.gameTitle + " -> Optionen";
                Var.jf1.setTitle(Var.gameTitle);
                Var.optionsWindow.setTitle(Var.optionsTitle);
                if(Var.debugMode) {
                    KeyHandler.print(Var.gameTitle);
                }

                /* Var.jf1.setVisible(false);
                Var.jf1.setVisible(true); */

            }
        };

        Var.GameTitleChange.addActionListener(GameTitleButtonChange);


        // Quit Button

        ActionListener QuitButtonAL = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int n = JOptionPane.showConfirmDialog(
                        Var.optionsWindow,
                        "Are you sure?",
                        "Really?",
                        JOptionPane.YES_NO_OPTION);
                if(Var.debugMode) {
                    System.out.println(n);
                }

                if(n == 0) {
                    System.exit(1);
                }

            }
        };


        JButton quitButton = new JButton("Spiel Beenden");
        quitButton.addActionListener(QuitButtonAL);
        quitButton.setBackground(Color.red);
        quitButton.setBounds(0, 250, Var.optionsScreenWith, Var.optionsScreenHeight);
        quitButton.setSize(120, 20);
        quitButton.setVisible(true);





        Var.optionsWindow = new JFrame();

        Var.optionsWindow.setTitle(Var.optionsTitle);

        // Size
        Var.optionsWindow.setSize(Var.optionsScreenWith, Var.optionsScreenHeight);
        Var.optionsWindow.setResizable(Var.optionsResizable);

        Var.optionsWindow.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        Var.optionsWindow.setLocationRelativeTo(null);
        Var.optionsWindow.setLayout(null);

        Var.label1 = new JLabel("Resizeable: ");
        Var.label1.setVisible(true);
        Var.label1.setBounds(0, -140, Var.optionsScreenWith, Var.optionsScreenHeight);

        JLabel DebugModeLabel = new JLabel("DebugMode: ");
        DebugModeLabel.setVisible(true);
        DebugModeLabel.setBounds(170, -140, Var.optionsScreenWith, Var.optionsScreenHeight);


        Var.optionsWindow.addKeyListener(new optionsKeyHandler());
        Var.optionsWindow.add(Var.label1);
        Var.optionsWindow.add(ResizeableRadioButtonFalse);
        Var.optionsWindow.add(ResizeableRadioButtonTrue);
        Var.optionsWindow.add(Var.GameTitle);
        Var.optionsWindow.add(Var.GameTitleLabel);
        Var.optionsWindow.add(Var.GameTitleChange);
        Var.optionsWindow.add(quitButton);
        Var.optionsWindow.add(DebugModeLabel);
        Var.optionsWindow.add(DebugModeRadioButtonFalse);
        Var.optionsWindow.add(DebugModeRadioButtonTrue);
    }

}
