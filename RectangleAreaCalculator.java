//creating Rectangle class
class RectangleClass2 {

    //defining attributes
    int length;
    int width;

    //non-parameterized constructor
    RectangleClass2() {
        length = 5;
        width = 5;
    }

    //parameterized constructor
    RectangleClass2(int x, int y) {
        this.length = x;
        this.width = y;
    }

    //method to calculate area of rectangle
    public int calculateArea() {
        return (length * width);
    }
}

//main class
public class RectangleAreaCalculator {

    //main method
    public static void main(String[] args) {

        //creating object using default constructor
        RectangleClass2 rect = new RectangleClass2();

        //calling calculateArea() for first object
        System.out.println(rect.calculateArea());

        //creating object using parameterized constructor
        RectangleClass2 rect1 = new RectangleClass2(10, 10);

        //calling calculateArea() for second object
        System.out.println(rect1.calculateArea());
    }
}
