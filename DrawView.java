import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;

import javax.swing.*;

public class DrawView extends JPanel{
    
    
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;    //??

    private int gameStyle;
    private int x;
    private int y;
    private int board_width;
    private int board_height;
    private int gap;
    
    private final double PIT_RADIUS = 40;
    private final int PITS_PER_PLAYER = 6;
    
    Pits createPit;
    Pool createPool;


    public DrawView(int gameStyle, int board_width, int board_height){
        this.gameStyle = gameStyle;
        this.board_height = board_height;
        this.board_width = board_width;
    }

    public void paintComponent(Graphics g) {
        //super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.black);

        
        // Draw Boundary
        x=5;
        y=5;
        RoundRectangle2D.Double boundary = new RoundRectangle2D.Double(x,y,board_width,board_height, 50,50);
        g2.draw(boundary);
        
        
        //Draw pits with stone
        x += 105;
        y += 55;
        gap = 0;
        createPit = new Pits(gameStyle, x, y, PIT_RADIUS);
     
        for(int i=0; i<PITS_PER_PLAYER; i++){
            gap = i * 50;
            g2.draw(createPit.drawPit(gap,0));
            
        }
        gap = 0;
        for(int i=0; i<PITS_PER_PLAYER; i++){
            gap = i * 50;
            g2.draw(createPit.drawPit(gap,50));
            
        }


        //Draw Pool with point
        x = 5;
        y = 5;
        createPool = new Pool(gameStyle, x, y);
        //Pool B:
        g2.draw(createPool.drawPool(25, 50, PIT_RADIUS + 10, board_height - 100, 65, 65));
        //Pool A:
        g2.draw(createPool.drawPool(425, 50, PIT_RADIUS + 10, board_height - 100, 65, 65));

        
    }
}