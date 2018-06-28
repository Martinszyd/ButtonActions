package ButtonActions;

import javax.swing.*;

public class ButtonFrame extends JFrame {

    ButtonFrame(){

        super("Buttons test");

        JPanel buttonPanel = new ButtonPanel();
        add(buttonPanel);

        setLocation(250, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
