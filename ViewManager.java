
import javax.swing.JFrame;


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

  
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private int gameStyle; // 0 for regular style, 1 for fancy style..
    private DrawView curr_View;
    private final static int WIDTH = 500;
    private final static int HEIGHT = 200;


    public ViewManager(int gameStyle){
        setTitle("Mancala Game");
        setSize(WIDTH+20,HEIGHT+50);

        this.gameStyle = gameStyle;
        
        curr_View = new DrawView(gameStyle, WIDTH, HEIGHT);
        add(curr_View);
    }

    public void updateView() {
        
    }



}