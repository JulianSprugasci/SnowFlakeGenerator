package Class;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.geom.Area;
import java.util.ArrayList;
import javax.swing.text.Position;

/**
 *
 * @author julian
 */
public class MyPolygon {

    /**
     * List containing all the points of the polygons.
     */
    private ArrayList<Point> points = new ArrayList<>();

    /**
     * Check if the polygon is closed.
     */
    private boolean isClosed = false;

    /**
     * The radius of points.
     */
    private final int RADIUS = 5;

    /**
     * Standard polygon.
     */
    private Polygon polygon = new Polygon();

    /**
     * The area of the polygon.
     */
    private Area polygonArea;

    /**
     * Allows you to instantiate the class.
     */
    public MyPolygon() {

    }

    /**
     * Checks if the first point of the polygon coincides with the last one.
     * If true, it closes the polygon.
     * @param point Current point.
     */
    public void addPoint(Point point) {
        if (this.points.size() > 0) {
            if (point.distance(this.points.get(0).x, this.points.get(0).y) <= 5 && this.points.size() > 2) {
                this.isClosed = true;
                polygonArea = new Area(polygon);
            }
        }
        points.add(point);
        polygon.addPoint(point.x, point.y);
    }
    
    /**
     * Recalculate the area of the polygon.
     */
    public void recalculatePolygon() {
        polygon.reset();
        for (Point point : this.points) {
            polygon.addPoint(point.x, point.y);
        }
        polygonArea = new Area(polygon);
    }
    
    /**
     * Removes a point from the ArrayList.
     * @param ciccio Current point.
     */
    public void removePointAt(Point ciccio) {
        for (Point point : this.points) {
            if (ciccio.distance(point.x, point.y) <= RADIUS) {
                points.remove(point);
                recalculatePolygon();
            }
        }
    }
    
    /**
     * Moves the selected point
     * @param selectedPoint
     * @param newPosition 
     */
    public void movePoint(Point selectedPoint, Point newPosition) {
        for (int i = 0; i < this.points.size(); i++) {
            if (selectedPoint.distance(this.points.get(i)) <= RADIUS) {
                this.points.set(i, newPosition);
            }
        }

    }
    
    /**
     * Checks the distance between two points.
     * @param p First selected Point.
     * @param p1 Second selected Point.
     * @return Distance.
     */
    public boolean distanceOfPoints(Point p, Point p1) {
        for (int i = 0; i < this.polygon.npoints; i++) {
            if (polygon.npoints > 1) {
                return p.distance(p1) <= RADIUS * 2;
            }
        }
        return false;
    }
    
    /**
     * Paint method
     * @param g Graphics component
     * @param areaColor Area color
     * @param pointsColor Points color
     */
    public void paint(Graphics g, Color areaColor, Color pointsColor){
        if (isClosed) {
            g.setColor(areaColor);
            g.fillPolygon(this.polygon);
        } else {
            Point lastPoint = null;
            for (Point point : this.points) {
                g.setColor(pointsColor);
                g.fillOval(point.x - RADIUS, point.y - RADIUS, RADIUS * 2, RADIUS * 2);
                g.setColor(Color.BLACK);
                if (lastPoint != null) {
                    g.drawLine(point.x, point.y, lastPoint.x, lastPoint.y);
                }
                lastPoint = point;
            }
            if (this.points.size() >= 1) {
                g.setColor(pointsColor);
                g.fillOval(this.points.get(this.points.size() - 1).x - RADIUS, this.points.get(this.points.size() - 1).y - RADIUS, RADIUS * 2, RADIUS * 2);
            }

        }

    }

    public boolean getIsClosed() {
        return this.isClosed;
    }

    public ArrayList<Point> getPoints() {
        System.err.println(points.size());
        return this.points;
    }

    public Area getArea() {
        return this.polygonArea;
    }

}
