class Shape{

}

class Rectangle extends Shape{
    static double area(int l, int w)
    {
        double areaRect = l * w;
        return areaRect;
    }
}

class Triangle extends Shape{
    static double area(int base, int height)
    {
        double areaTri = (0.5)*base*height;
        return areaTri;
    }
}

public class Inheritance {
    public static void main(String[] args) {

    }
}
