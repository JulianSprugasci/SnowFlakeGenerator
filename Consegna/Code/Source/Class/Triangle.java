package Class;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Toolkit;
import java.awt.geom.Area;

/**
 *
 * @author julian
 */

public class Triangle {
    
    /**
     * Horizontal coordinates of the triangle.
     */
    private int resultX[] = new int[3];
    
    /**
     * Vertical coordinates of the triangle.
     */
    private int resultY[] = new int[3];
    
    /**
     * The polygon triangle.
     */
    private Polygon triangle;
    
    /**
     * The area of the triangle
     */
    private Area triangleArea = new Area();
    
    /**
     * The default width of the window.
     */
    private int windowWidth = 1024;
    
    /**
     * The default height of the window.
     */
    private int windowHeight = 748;
    
    /**
     * The color of the triangle.
     */
    private Color triangleColor = new Color(236, 240, 241);
    
    /**
     * Allows you to instantiate the class.
     */
    public Triangle() {
        createTriangle();
        triangle = new Polygon(this.resultX, this.resultY, 3);
        triangleArea.add(new Area(triangle));
    }
    
    /**
     * Print inside the window.
     * @param g Graphic component.
     */
    public void paintComponent(Graphics g) {
        
        Color rectColor = new Color(255, 50, 0, 80);
        Toolkit.getDefaultToolkit().sync();
        g.setColor(triangleColor);
        g.fillPolygon(triangle);

    }

    /**
     * Allows you to center and resize the triangle
     */
    public void createTriangle() {
        int width;
        int height;
        if (this.windowWidth == this.windowHeight) {
            height = this.windowHeight / 2;
            width = (int) (height / Math.sqrt(3));
        } else if ((this.windowWidth * Math.sqrt(3)) < (this.windowHeight / Math.sqrt(3))) {
            width = this.windowWidth / 2;
            height = (int) (width * Math.sqrt(3));
        } else {
            height = this.windowHeight / 2;
            width = (int) (height / Math.sqrt(3));
        }
        int heightSpace = (this.windowHeight - height) / 2;
        int widthSpace = (this.windowWidth - width) / 2;
        int spazioFinLar = widthSpace + width;
        int spazioFinAlt = heightSpace + height;
        int resultX[] = {widthSpace, spazioFinLar, spazioFinLar};
        int resultY[] = {heightSpace, heightSpace, spazioFinAlt};
        this.resultX = resultX;
        this.resultY = resultY;
        triangle = new Polygon(this.resultX, this.resultY, 3);
    }
    
    /**
     * Allows you to return the polygon triangle.
     * @return The triangle.
     */
    public Polygon getPolygon() {
        return triangle;
    }

    /**
     * Allows you to return the area of the triangle.
     * @return Area of the triangle.
     */
    public Area getArea() {

        return triangleArea;
    }
    
    /**
     * Allows you to return an array with horizontal coordinates.
     * @return horizontal coordinates.
     */
    public int[] getResultX() {

        return this.resultX;
    }

    /**
     * Allows you to return an array with vertical coordinates.
     * @return vertical coordinates.
     */
    public int[] getResultY() {

        return this.resultY;
    }

    /**
     * Allows to resize the triangle on the window.
     * @param windowHeight Window height.
     * @param windowWidth Window width.
     */
    public void resize(int windowHeight, int windowWidth) {
        this.windowHeight = windowHeight;
        this.windowWidth = windowWidth;
    }
    
    /**
     * Allows to return the width of the window.
     * @return Window width.
     */
    public int getWindowWidth() {
        return this.windowWidth;
    }
    
    /**
     * Allows to set the color of the triangle.
     * @param color Triangle color.
     */
    public void setColor(Color color){
        this.triangleColor = color;
    }
}
