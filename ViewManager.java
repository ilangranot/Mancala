import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
    to choose Style, init view
    to create view
    to update view
    
    comtains a templete with:
        -layout of pits and mancala
        -12 pits
        -texts
        -stone in each pit

*/
public class ViewManager extends JFrame {

  
    private int gameStyle;  //0 for regular style, 1 for fancy style..
    private ArrayList<DrawPits> pitsA;
    private ArrayList<DrawPits> pitsB;

    private int x;
    private int y;
    private final static int WIDTH = 500;
    private final static int HEIGHT = 200;

    private final static int PITS_PER_PLAYER = 6;
    private final static int PIT_RADIUS = 50;
    private final static int PIT_SPACING = 10;


    public ViewManager(int style){
        setTitle("Mancala Game");
        setSize(WIDTH,HEIGHT);
        gameStyle = style;
        DrawPits p1 = new DrawPits(gameStyle, 20, 20, PIT_RADIUS);
        DrawPits p2 = new DrawPits(gameStyle, 20, 40, PIT_RADIUS);
        add(p1);
        add(p2);
    }




    public void newGame(int gStyle){
        gameStyle = gStyle;
    }



}