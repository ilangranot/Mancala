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
    
    private final int PITS_PER_PLAYER = 6;
    
    Pits createPit;
    Pool createPool;


    public DrawView(int gameStyle, int frame_board_width, int frame_board_height){
        this.gameStyle = gameStyle;
        this.board_height = (int)(frame_board_height*0.55);
        this.board_width = (int)(frame_board_width*0.75);
        x = 0;
        y = 0;
    }

    public void paintComponent(Graphics g) {
        //super.paintComponent(g);
        double pit_radius = board_width / 10;

        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.black);
        
        //set coordinates according to the board
        x = (int)((board_width*4/3 - board_width)/2); 
        y = (int)((board_height*4/3 - board_height)/2 + 30);
        
        // Draw Boundary
        RoundRectangle2D.Double boundary = new RoundRectangle2D.Double(x,y,board_width,board_height, 50,50);
        g2.draw(boundary);
        
        double centerX = boundary.getCenterX();
        double centerY = boundary.getCenterY();

        //Draw Pool with point on the board
        x = (int)(centerX - board_width/2 + pit_radius/4);
        y = (int)(centerY - board_height/2 + pit_radius*0.6);

        createPool = new Pool(gameStyle, x, y);
        //Pool B:
        g2.draw(createPool.drawPool(0, 0, pit_radius*0.85, board_height*0.65, 40, 40));
        //Pool A:
        g2.draw(createPool.drawPool((int)(board_width - pit_radius/2 - pit_radius*0.85), 0, pit_radius*0.85, board_height*0.65, 40, 40));

        
        //Draw pits with stone on the board
        x = (int)(centerX - board_width/2 + (board_width-(6*pit_radius+pit_radius*1.25))/2);
        y = (int)(centerY - board_height/2 + (board_height-(2*pit_radius+pit_radius*0.25))/2);
        gap = 0;
       
        createPit = new Pits(gameStyle, x, y, pit_radius);
        //Pits for player B
        for(int i=0; i<PITS_PER_PLAYER; i++){
            gap = (int)(i * pit_radius * 1.25);
            g2.draw(createPit.drawPit(gap,0));
            
        }
        //Pits for player A
        gap = 0;
        for(int i=0; i<PITS_PER_PLAYER; i++){
            gap = (int)(i * pit_radius * 1.25);
            g2.draw(createPit.drawPit(gap,(int)(pit_radius * 1.25)));
            
        }


        

        
    }
}