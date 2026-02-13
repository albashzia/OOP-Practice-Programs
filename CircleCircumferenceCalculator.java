//creating Circle class
class Circle{

    //defining attribute
    int radius;

    //non-parameterized constructor
    Circle(){
        radius = 5;
    }

    //parameterized constructor
    Circle(int radius){
        this.radius = radius;
    }

    //method to calculate circumference of circle
    double calculateCircumference(){
        return (2*3.14*radius);
    }
}

//main class
public class CircleCircumferenceCalculator {

    //main method
    public static void main(String[] args) {

        //creating object using default constructor
        Circle c1 = new Circle();

        //calling calculateCircumference() for first object
        System.out.println(c1.calculateCircumference());

        System.out.println("");

        //creating object using parameterized constructor
        Circle c2 = new Circle(10);

        //calling calculateCircumference() for second object
        System.out.println(c2.calculateCircumference());
    }
}
