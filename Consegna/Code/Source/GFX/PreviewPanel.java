package GFX;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import javax.swing.JPanel;

/**
 *
 * @author julian
 */
public class PreviewPanel extends JPanel {

    private Shape[] shapes = new Shape[6];

    private Shape[] reversedShape = new Shape[6];

    /**
     * Creates new form PreviewPanelModel
     *
     * @param shapes
     * @param reversedShape
     */
    public PreviewPanel(Shape[] shapes, Shape[] reversedShape) {
        super();
        this.setSize(134, 124);
        this.reversedShape = reversedShape;
        this.shapes = shapes;
    }

    /**
     * Creates new form PreviewPanelModel
     *
     * @param shapes
     * @param reversedShape
     */
    public PreviewPanel() {
        super();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.clearRect(0, 0, this.getWidth(), this.getHeight());
        Graphics2D g1 = (Graphics2D) g;

        //g.fillOval(0, 0, this.getWidth(), this.getHeight());
        //g1.fillRect(0, 0, this.getWidth(), this.getHeight());
        for (int i = 0; i < 6; i++) {
            g1.setColor(Color.black);
            g1.draw(this.shapes[i]);
            g1.setColor(Color.red);
            g1.fill(this.shapes[i]);
        }
        for (int i = 0; i < 6; i++) {
            g1.setColor(Color.black);
            g1.draw(this.reversedShape[i]);
            g1.setColor(Color.red);
            g1.fill(this.reversedShape[i]);
        }

    }
}
