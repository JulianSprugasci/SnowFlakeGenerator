package GFX;
import Class.MyPolygon;
import Class.Triangle;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.PathIterator;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Julian Sprugasci
 * @version last_release
 */
public class SnowFlakePanel extends JPanel implements MouseListener, MouseMotionListener, ComponentListener {

    private final int POINT_SIZE = 10;

    private int xMouse;

    private int yMouse;

    private boolean isPressed = false;

    private List<MyPolygon> myPolygons = new ArrayList<>();

    private Point lastPoint;

    private boolean clearArea = false;

    private Triangle triangle;

    private Area triangleArea;

    private boolean drawFinalPolygon = false;

    Polygon finalPolygon = new Polygon();

    private BufferedImage imgFinalPolygon;

    private int lastWidth = 1024;

    private int lastHeight = 748;

    private boolean isReset = false;

    private Color backgroundColor = new Color(189, 195, 199);

    private Color areaColor = new Color(0, 255, 0, 80);

    private Color pointsColor = Color.red;

    private int xCoord = 0;

    private int yCoord = 0;

    private boolean isNull = false;

    private Shape[] shapes = new Shape[6];

    private Shape[] reversedRotate = new Shape[6];

    private ArrayList<Shape> shapesList = new ArrayList<>();

    public SnowFlakePanel() {
        init();
        this.setSize(1024, 748);
        this.setDoubleBuffered(true);
        this.setLayout(null);
        //this.setBackground(backgroundColor);
        addMouseListener(this);
        addMouseMotionListener(this);
        addComponentListener(this);
        System.err.println(this.getWidth());
        System.err.println(this.getHeight());
        //startTriangle();
        //triangleArea = new Area(triangle.getPolygon());
    }

    public void init() {
        triangle = new Triangle();
        triangleArea = new Area(triangle.getPolygon());
        myPolygons.add(new MyPolygon());
        xMouse = 0;
        yMouse = 0;
        lastPoint = new Point();
    }

    public void calculatePolygon(MouseEvent e) {
        MyPolygon lastPolygon = myPolygons.get(myPolygons.size() - 1);
        if (!lastPolygon.getIsClosed()) {
            lastPolygon.addPoint(new Point(e.getX(), e.getY()));
        } else {
            myPolygons.add(new MyPolygon());
            lastPolygon = myPolygons.get(myPolygons.size() - 1);
            lastPolygon.addPoint(new Point(e.getX(), e.getY()));
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        //super.paintComponent(g);
        Toolkit.getDefaultToolkit().sync();
        g.setColor(backgroundColor);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        Graphics2D g2 = (Graphics2D) g;
        g.setColor(Color.red);

        if (this.getWidth() != this.lastWidth || this.getHeight() != this.lastHeight) {

            this.lastWidth = this.getWidth();
            this.lastHeight = this.getHeight();
            triangle.createTriangle();
        }

        triangle.paintComponent(g);

        for (int i = 0; i < myPolygons.size(); i++) {

            myPolygons.get(i).paint(g, areaColor, pointsColor);
        }

        if (this.isReset) {
            g.clearRect(0, 0, this.getWidth(), this.getHeight());
            g.setColor(Color.cyan);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            triangle.paintComponent(g);
        }
        /*if (this.drawFinalPolygon && !this.isReset) {
            g.setColor(Color.white);
            int count = 0;
            for (int i = 0; i < shapes.length; i++) {
                shapes[i] = rotatePointMatrix(count, this.finalPolygon);
                g2.fill(shapes[i]);
                //System.err.println(shapes[i]);
                shapesList.add(shapes[i]);
                count += 60;
            }
            Polygon reserved = reversePolygon();
            count = 0;
            for (int i = 0; i < 6; i++) {
                reversedRotate[i] = rotatePointMatrix(count, reserved);
                g2.fill(reversedRotate[i]);
                count += 60;
            }
        }*/

    }

    public void calculateShape() {
        int count = 0;
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = rotatePointMatrix(count, this.finalPolygon);
            shapesList.add(shapes[i]);
            count += 60;
        }
        Polygon reserved = reversePolygon();
        count = 0;
        for (int i = 0; i < 6; i++) {
            reversedRotate[i] = rotatePointMatrix(count, reserved);
            count += 60;
        }
    }

    public boolean containsPoints(int x, int y) {
        return lastPoint.distance(new Point(x, y)) <= POINT_SIZE / 2;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.xMouse = e.getX();
        this.yMouse = e.getY();
        this.lastPoint = new Point(xMouse, yMouse);
        try {
            if (e.getButton() == MouseEvent.BUTTON1) {
                calculatePolygon(e);
                repaint();
            }
            if (e.getButton() == MouseEvent.BUTTON3) {
                myPolygons.get(myPolygons.size() - 1).removePointAt(lastPoint);
                repaint();
            }
        } catch (ConcurrentModificationException cme) {
            System.err.println("Cancelled!");
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        lastPoint = new Point(e.getPoint());
        for (int i = 0; i < myPolygons.size(); i++) {
            myPolygons.get(i).movePoint(lastPoint, e.getPoint());
            myPolygons.get(i).recalculatePolygon();
            repaint();
        }

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        xCoord = e.getX();
        yCoord = e.getY();
    }

    public void savePoints() throws FileNotFoundException, UnsupportedEncodingException {
        try {
            String name = JOptionPane.showInputDialog(null, "Insert the file name with .txt");
            char[] controlName = name.toCharArray();
            if (!controlFileName(controlName, name)) {
                JOptionPane.showMessageDialog(null, "Please, insert a .txt file!");
            } else if (myPolygons.get(0).getPoints().size() < 1) {
                JOptionPane.showMessageDialog(null, "Please, insert a least one point!");
            } else {
                String finalPath = "Files/" + name;
                PrintWriter writer = new PrintWriter(finalPath, "UTF-8");
                for (MyPolygon polygon : myPolygons) {
                    for (Point point : polygon.getPoints()) {
                        writer.print(point.getX() + "," + point.getY());
                        writer.println();
                    }
                    writer.println("endpolygon,endpolygon");
                }
                writer.close();
            }
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(null, "Please, insert a valid name!");
        }

    }

    public void importPoints() {
        JFileChooser fc = new JFileChooser("./");
        fc.setDialogTitle("Import Points");
        int status = fc.showOpenDialog(null);
        if (status == JFileChooser.APPROVE_OPTION) {
            try {
                File file = fc.getSelectedFile();
                Path path = Paths.get(file.getPath());
                List<String> points = Files.readAllLines(path);
                ArrayList<Integer> x = new ArrayList<>();
                ArrayList<Integer> y = new ArrayList<>();
                List<Integer> index = new ArrayList<>();
                int count = 0;
                for (int i = 0; i < points.size(); i++) {
                    if (points.get(i).equals("endpolygon,endpolygon")) {
                        MyPolygon polygon = new MyPolygon();
                        for (int j = 0; j < x.size(); j++) {
                            System.err.println(x.get(j) + "," + y.get(j));
                            polygon.addPoint(new Point(x.get(j), y.get(j)));
                            myPolygons.add(polygon);
                            repaint();

                        }
                    } else {
                        String[] coords = points.get(i).split(",");
                        //System.err.println(coords[0] + "," + coords[1]);
                        x.add((int) Double.parseDouble(coords[0]));
                        y.add((int) Double.parseDouble(coords[1]));

                    }
                }
            } catch (IOException ex) {
                //Logger.getLogger(SnowFlakePanel.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            System.err.println("Error!");
        }

    }

    public void saveImage(String name, int width, int height, int type) throws FileNotFoundException, IOException {
        //int widthResult = width - 124;
        //int heightResult = height - 28;
        int widthResult = width;
        int heightResult = height;
        switch (type) {
            case 1:
                if (widthResult == 500 && heightResult == 500 || widthResult == 1000 && heightResult == 1000 || widthResult == this.getWidth() && heightResult == this.getHeight()) {
                    imgFinalPolygon = new BufferedImage(widthResult, heightResult, BufferedImage.TYPE_3BYTE_BGR);
                    //this.setSize(this.getWidth(), this.getHeight());
                    this.paintComponent(imgFinalPolygon.getGraphics());
                    File outputfile = new File("Img/" + name + ".jpg");
                    ImageIO.write(imgFinalPolygon, "jpg", outputfile);
                    System.err.println("SHISH");
                }
                break;
            case 2:
                if (widthResult == 500 && heightResult == 500 || widthResult == 1000 && heightResult == 1000 || widthResult == this.getWidth() && heightResult == this.getHeight()) {
                    imgFinalPolygon = new BufferedImage(widthResult, heightResult, BufferedImage.TYPE_3BYTE_BGR);
                    //this.setSize(this.getWidth(), this.getHeight());
                    this.paintComponent(imgFinalPolygon.getGraphics());
                    File outputfile = new File("Img/" + name + ".png");
                    ImageIO.write(imgFinalPolygon, "png", outputfile);
                    System.err.println("SHISH");
                }
                break;
            case 3:
                if (widthResult == 500 && heightResult == 500 || widthResult == 1000 && heightResult == 1000 || widthResult == this.getWidth() && heightResult == this.getHeight()) {
                    imgFinalPolygon = new BufferedImage(widthResult, heightResult, BufferedImage.TYPE_3BYTE_BGR);
                    //this.setSize(this.getWidth(), this.getHeight());
                    this.paintComponent(imgFinalPolygon.getGraphics());
                    File outputfile = new File("Img/" + name + ".png");
                    ImageIO.write(imgFinalPolygon, "png", outputfile);
                    System.err.println("SHISH");
                }
                break;
            default:
                break;
        }
    }

    public void resetAll() {
        this.isReset = true;
        myPolygons.removeAll(myPolygons);
        myPolygons.add(new MyPolygon());
        this.isReset = false;
    }

    public boolean controlFileName(char[] chars, String name) {
        if (name != null && !name.equals("") && !name.equals(" ")) {
            return chars[chars.length - 1] == 't' && chars[chars.length - 2] == 'x'
                    && chars[chars.length - 3] == 't'
                    && chars[chars.length - 4] == '.';
        }
        return false;
    }

    public void subtractArea() {
        if (this.finalPolygon != null) {
            for (int i = 0; i < this.myPolygons.size(); i++) {
                triangleArea.subtract(this.myPolygons.get(i).getArea());
            }
        }
    }

    public void convertAreaToPolygon() {
        PathIterator iterator = triangleArea.getPathIterator(null);
        float[] floats = new float[6];
        this.finalPolygon = new Polygon();
        ArrayList<Point> startPoints = new ArrayList<>();
        while (!iterator.isDone()) {
            int type = iterator.currentSegment(floats);
            int x = (int) floats[0];
            int y = (int) floats[1];
            if (type == 0) {
                startPoints.add(new Point(x, y));
            }
            this.finalPolygon.addPoint(x, y);
            if (type == 4) {
                x = startPoints.get(startPoints.size() - 1).x;
                y = startPoints.get(startPoints.size() - 1).y;
                this.finalPolygon.addPoint(x, y);
            }
            iterator.next();
        }
        for (int i = 0; i < startPoints.size(); i++) {
            this.finalPolygon.addPoint(startPoints.get(i).x, startPoints.get(i).y);

        }

    }

    public void generate() {
        try {
            this.resize(this.getWidth() + 1, this.getHeight() + 1);
            this.subtractArea();
            this.convertAreaToPolygon();
            this.drawFinalPolygon = true;
            scaleFinalPolygon();
            calculateShape();
            this.resize(this.getWidth() - 1, this.getHeight() - 1);
            repaint();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Please, insert at least one polygon!");
            this.isNull = true;
        }

    }

    public Polygon getFinalPolygon() {
        return this.finalPolygon;
    }

    @Override
    public void componentResized(ComponentEvent arg0) {
        triangleArea = new Area(triangle.getPolygon());
        triangle.resize(this.getHeight(), this.getWidth());
    }

    @Override
    public void componentMoved(ComponentEvent arg0) {

    }

    @Override
    public void componentShown(ComponentEvent arg0) {

    }

    @Override
    public void componentHidden(ComponentEvent arg0) {

    }

    public Shape rotatePointMatrix(double angle, Polygon polygon) {

        AffineTransform tx = new AffineTransform();
        tx.scale(0.20, 0.20);
        tx.rotate(Math.toRadians(angle), this.getWidth() / 2, this.getHeight() / 2);
        //tx.translate(angle, angle);
        //Shape s = tx.createTransformedShape(this.finalPolygon);
        Shape s = tx.createTransformedShape(polygon);
        return s;

    }

    public void scaleFinalPolygon() {
        int maxPointY = 0;
        for (int i = 0; i < this.finalPolygon.ypoints.length; i++) {
            if (this.finalPolygon.ypoints[i] > maxPointY) {
                maxPointY = this.finalPolygon.ypoints[i];
            }
        }
        int difference = Math.abs(maxPointY - (this.getHeight() / 2));
        //System.err.println("Difference: " + difference);
        for (int i = 0; i < this.finalPolygon.ypoints.length; i++) {
            this.finalPolygon.ypoints[i] -= difference;
        }

        int maxPointX = 0;
        for (int i = 0; i < this.finalPolygon.xpoints.length; i++) {
            if (this.finalPolygon.xpoints[i] > maxPointX) {
                maxPointX = this.finalPolygon.xpoints[i];
            }
        }
        int differenceX = Math.abs(maxPointX - (this.getWidth() / 2));
        //System.err.println("Difference: " + difference);
        for (int i = 0; i < this.finalPolygon.xpoints.length; i++) {
            this.finalPolygon.xpoints[i] -= differenceX;
        }

    }

    public Polygon reversePolygon() {
        int difference = 0;
        int centerX = this.getWidth() / 2;
        int[] xPos = new int[this.finalPolygon.xpoints.length];
        for (int i = 0; i < this.finalPolygon.xpoints.length; i++) {
            difference = Math.abs(this.finalPolygon.xpoints[i] - centerX);
            xPos[i] = centerX + difference;
        }
        Polygon reversedPolygon = new Polygon(xPos, this.finalPolygon.ypoints, this.finalPolygon.npoints);
        return reversedPolygon;

    }

    public Triangle getTriangle() {
        return this.triangle;
    }

    public void setPointsColor(Color color) {
        this.pointsColor = color;
    }

    public void setAreaColor(Color color) {
        this.areaColor = color;
    }

    public void setBackgroundColor(Color color) {
        this.backgroundColor = color;
    }

    /**
     * Ritorna se c'è una NullPointerException
     *
     * @return isNull
     */
    public boolean getIsNull() {
        return this.isNull;
    }

    /**
     * Ritorna se c'è un reset
     *
     * @return isNull
     */
    public void setIsreset() {
        this.isReset = true;
    }

    public Shape[] getShape() {
        for (int i = 0; i < 6; i++) {
            //System.err.println(this.shapes[i]);
        }
        return this.shapes;
    }

    public Shape[] getReversedShape() {
        return this.reversedRotate;
    }

    public List getShapesList() {
        return this.shapesList;
    }

}
