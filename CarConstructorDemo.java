//creating Car class
class Car{

    //defining attributes
    String color;
    String type;
    int enginePower;
    boolean automatic;
    int doors;

    //non-parameterized constructor
    Car()
    {
        color = "Black";
        type = "Sedan";
        enginePower = 1300;
        automatic = true;
        doors = 4;
    }

    //method to display car details
    void displayDetails(){
        System.out.println("Color : "+color);
        System.out.println("Type : "+type);
        System.out.println("Engine Power : "+enginePower);
        System.out.println("Drive Type: "+(automatic? "Automatic":"Manual"));
        System.out.println("Doors : "+doors);
        System.out.println("");
    }

    //parameterized constructor
    Car(String color, String type,int enginePower,boolean automatic,int doors){
        this.color = color;
        this.type = type;
        this.enginePower = enginePower;
        this.automatic = automatic;
        this.doors = doors;
    }
}

//main class
public class CarConstructorDemo {

    //main method
    public static void main(String[] args) {

        //creating object using default constructor
        Car c1 = new Car();
        c1.displayDetails();

        //creating object using parameterized constructor
        Car c2 = new Car("White", "SUV", 4000, true, 4);
        c2.displayDetails();
    }
}
