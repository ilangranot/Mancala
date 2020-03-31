import java.awt.geom.*;
import javax.swing.*;

public class Pool extends JPanel {

    private int gameStyle;
    private int x;
    private int y;
    

    public Pool (int gameStyle, int x, int y){
        this.gameStyle = gameStyle;
        this.x = x;
        this.y = y;
    }

    public RoundRectangle2D.Double drawPool(int x_offset, int y_offset, double width, double height, double radius, double nradius){
        return (new RoundRectangle2D.Double(x+x_offset, y+y_offset, width, height,radius,nradius));
    }

}