package GFX;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import javax.swing.JFrame;

/**
 *
 * @author julian
 */
public class PreviewModel extends JFrame{
    
    private Shape[] shapes = new Shape[6];
    
    private Shape[] reversedShape = new Shape[6];
    
    
    
    public PreviewModel(Shape [] shapes, Shape[] reversedShape){
        this.setTitle("Preview");
        this.setSize(900,900);
        this.setBounds(1100, 500, 900, 720);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //this.setResizable(false);
        this.setVisible(true);
        this.shapes = shapes;
        this.reversedShape = reversedShape;
    }

    @Override
    public void paint(Graphics g) {
        g.clearRect(0, 0, this.getWidth(), this.getHeight());
        Graphics2D g1 = (Graphics2D) g; 
        g1.setColor(Color.black);
        //g1.fillRect(0, 0, this.getWidth(), this.getHeight());
        for (int i = 0; i < 6; i++) {
            g1.fill(this.shapes[i]);
            
        }
        for (int i = 0; i < 6; i++) {
            g1.fill(this.reversedShape[i]);
        }
        
    }
    
}
