//creating Distance class
class Distance{

    //defining attributes
    int feet;
    int inches;

    //non-parameterized constructor
    Distance(){
        feet = 1;
        inches = 12;
    }

    //parameterized constructor
    Distance(int feet, int inches){
        this.feet = feet;
        this.inches = inches;
    }

    //method to display distance values
    void display(){
        System.out.println(feet);
        System.out.println(inches);
    }
}

//main class
public class DistanceMeasurementDemo {

    //main method
    public static void main(String[] args) {

        //creating object using default constructor
        Distance d1 = new Distance();
        d1.display();

        System.out.println("");

        //creating object using parameterized constructor
        Distance d2 = new Distance(2,24);
        d2.display();
    }
}
