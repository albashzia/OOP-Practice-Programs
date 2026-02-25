
class PointClass {

    private int X;
    private int Y;

    public PointClass() {
        X = 5;
        Y = 6;
    }

    public PointClass(int a, int c) {
        X = a;
        Y = c;
    }

    public void setX(int a) {
        X = a;
    }

    public void setY(int c) {
        Y = c;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public PointClass Add(PointClass Pa, PointClass Pb) {
        PointClass p_new = new PointClass(X + Pa.X + Pb.X, Y + Pa.Y + Pb.Y);
        return p_new;
    }

    public void display() {
        System.out.println(X);
        System.out.println(Y);
    }
}

public class PointAdditionDemo {

    public static void main(String[] args) {
        PointClass p1 = new PointClass(10, 20);
        PointClass p2 = new PointClass(30, 40);
        PointClass p3 = new PointClass();
        PointClass p4 = p1.Add(p2, p3);
        p4.display();
    }
}
