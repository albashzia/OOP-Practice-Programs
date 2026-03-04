class Point1 {

    private double x;
    private double y;

    public Point1(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void display() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

class Line {

    private Point1 startPoint;
    private Point1 endPoint;

    public Line(Point1 startPoint, Point1 endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Point1 getStartPoint() {
        return startPoint;
    }

    public Point1 getEndPoint() {
        return endPoint;
    }

    public void setStartPoint(Point1 startPoint) {
        this.startPoint = startPoint;
    }

    public void setEndPoint(Point1 endPoint) {
        this.endPoint = endPoint;
    }

    public double length() {
        double dx = endPoint.getX() - startPoint.getX();
        double dy = endPoint.getY() - startPoint.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public void display() {
        System.out.print("Line from ");
        startPoint.display();
        System.out.print(" to ");
        endPoint.display();
        System.out.println(" has length: " + length());
    }
}

public class PointsDistanceCalculator {
    public static void main(String[] args) {

        Point1 p1 = new Point1(0, 0);
        Point1 p2 = new Point1(3, 4);
        Line line1 = new Line(p1, p2);

        Point1 p3 = new Point1(1, 1);
        Point1 p4 = new Point1(4, 5);
        Line line2 = new Line(p3, p4);

        line1.display();
        line2.display();
    }
}
