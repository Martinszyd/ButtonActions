package ButtonActions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabelButton extends JButton implements ActionListener {

    private boolean pushed = false;

    LabelButton() {

        super("Not pushed");
        addActionListener(this);
    }
    @Override
            public void actionPerformed(ActionEvent e) {
        if(pushed)
            setText("Pushed");

        else
            setText("Not pushed");
        pushed =!pushed;
        //setText("ON");
    }
}
