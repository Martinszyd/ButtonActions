package ButtonActions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ButtonPanel extends JPanel {

    public static final int HEIGHT = 100;
    public static final int WIDTH = 300;
    private JButton randomButton;
    private JButton myButton;
    private JButton labelButton;

    private JPanel buttonPanel;

    public ButtonPanel(){

        randomButton = new RandomButton(this);
        myButton = new MyButton();
        labelButton = new LabelButton();

        buttonPanel = this;

        setLayout(new FlowLayout(FlowLayout.CENTER));
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        add(randomButton);
        add(myButton);
        add(labelButton);

    }

}
