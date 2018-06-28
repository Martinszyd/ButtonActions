package ButtonActions;

import java.awt.*;

public class ActionTest {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ButtonFrame();
            }
        });
    }
}
