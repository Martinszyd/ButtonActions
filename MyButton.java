package ButtonActions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButton  extends JButton implements ActionListener {

    private JPanel buttonPanel;
    private boolean pushed = false;

    MyButton(){
        super("Grey");
        setBackground(Color.RED);
        addActionListener(this);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(pushed)
        setBackground(Color.gray);
        else
            setBackground(Color.RED);
        pushed =!pushed;
            }

}
