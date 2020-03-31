import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class RegularStyle implements Icon {

    private int pit_radius;
    private int mancala_width;
    // private int stone_size;

    public RegularStyle (int frame_width, int frame_height) {
        // calculate pit_radues and other variables according to frame size.
        pit_radius = frame_width / 10;
        mancala_width = pit_radius;
    }

    public int getIconWidth(){
        return pit_radius * 10;
    }
    public int getIconHeight() {
        return pit_radius * 4;
    }

    public void paintIcon (Component c, Graphics g, int x, int y) {
        
        Graphics2D g2 = (Graphics2D) g;
        double cum_x = x + pit_radius*2;
        double gap = 52;
        Ellipse2D.Double pitsB6 = new Ellipse2D.Double (cum_x, y + pit_radius*0.5, pit_radius,pit_radius);
        Ellipse2D.Double pitsB5 = new Ellipse2D.Double ( cum_x+=gap, y + pit_radius*0.5, pit_radius,pit_radius);
        Ellipse2D.Double pitsB4 = new Ellipse2D.Double ( cum_x+=gap, y + pit_radius*0.5, pit_radius,pit_radius);
        Ellipse2D.Double pitsB3 = new Ellipse2D.Double ( cum_x+=gap, y + pit_radius*0.5, pit_radius,pit_radius);
        Ellipse2D.Double pitsB2 = new Ellipse2D.Double ( cum_x+=gap, y + pit_radius*0.5, pit_radius,pit_radius);
        Ellipse2D.Double pitsB1 = new Ellipse2D.Double ( cum_x+=gap, y + pit_radius*0.5, pit_radius,pit_radius);

        cum_x = x + pit_radius*2;
        double temHeight = getIconHeight()-pit_radius*2.25;
        Ellipse2D.Double pitsA6 = new Ellipse2D.Double (cum_x, temHeight, pit_radius,pit_radius);
        Ellipse2D.Double pitsA5 = new Ellipse2D.Double (cum_x+=gap, temHeight, pit_radius,pit_radius);
        Ellipse2D.Double pitsA4 = new Ellipse2D.Double (cum_x+=gap, temHeight, pit_radius,pit_radius);
        Ellipse2D.Double pitsA3 = new Ellipse2D.Double (cum_x+=gap, temHeight, pit_radius,pit_radius);
        Ellipse2D.Double pitsA2 = new Ellipse2D.Double (cum_x+=gap, temHeight, pit_radius,pit_radius);
        Ellipse2D.Double pitsA1 = new Ellipse2D.Double (cum_x+=gap, temHeight, pit_radius,pit_radius);


        g2.setColor(Color.gray);
        g2.fill(pitsB6);
        g2.fill(pitsB5);
        g2.fill(pitsB4);
        g2.fill(pitsB3);
        g2.fill(pitsB2);
        g2.fill(pitsB1);

        g2.setColor(Color.cyan);
        g2.fill(pitsA6);
        g2.fill(pitsA5);
        g2.fill(pitsA4);
        g2.fill(pitsA3);
        g2.fill(pitsA2);
        g2.fill(pitsA1);

    }

}