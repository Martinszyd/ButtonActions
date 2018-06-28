package ButtonActions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RandomButton extends JButton implements ActionListener {

    private JPanel buttonPanel;
    private Color[] colors = { Color.GREEN, Color.BLUE, Color.RED };

    RandomButton(JPanel buttonPanel) {
        super("Random");
        this.buttonPanel = buttonPanel;
        addActionListener(this);
    }
        @Override
        public void actionPerformed(ActionEvent e){
            int index = new Random().nextInt(colors.length);
            buttonPanel.setBackground(colors[index]);
        }
}
