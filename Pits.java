
import java.awt.geom.*;
import javax.swing.*;

public class Pits extends JPanel{
    
    
    private int gameStyle;
    private int x;
    
	private int y; 
    private double radius;

    public Pits(int gameStyle, int x, int y, double radius){
        this.gameStyle = gameStyle;
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Ellipse2D.Double drawPit(int x_offset, int y_offset){
        return (new Ellipse2D.Double (x+x_offset,y+y_offset,radius,radius));
    }


    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public double getRadius(){
        return radius;
    }

    public void stoneInPit(){
        //how many stones in the pit
    }

}