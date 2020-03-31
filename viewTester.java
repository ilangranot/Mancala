import java.awt.*;
import javax.swing.*;

public class viewTester {

    public static void main(String[] args) {
       
        ViewManager frame = new ViewManager(1);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.pack();
        frame.setVisible(true);
    }
}