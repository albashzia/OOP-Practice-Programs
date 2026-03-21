//Creating User Class - Parent Class
class User{

    //Attributes
    private int id;
    private String name;
    private String phoneNumber;
    //Non-Parameterized Constructor
    User(){
        id = 0;
        name = "Null";
        phoneNumber = "000000000";
    }
    //Parameterized Constructor
    User(int id, String name, String phoneNumber){
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    //Getter Methods

    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    String getPhoneNumber(){
        return phoneNumber;
    }
    //Display Method
    void display(){
        System.out.println("User Id : "+getId());
        System.out.println("Name : "+getName());
        System.out.println("Phone Number : "+getPhoneNumber());
    }
}
// Creating Driver Class, inherits from User Class - Child Class
class Driver extends User{

    //Attributes
    private String vehicleType;
    private int licenseNumber;
    private double rating;
    //Non-Parameterized Constructor
    Driver(){
        vehicleType = "Undefined";
        licenseNumber = 0000;
        rating = 0.0;
    }
    //Parameterized Constructor
    Driver(int id, String name, String phoneNumber,String vehicleType,int licenseNumber,double rating){
        super(id, name, phoneNumber);
        this.vehicleType = vehicleType;
        this.licenseNumber = licenseNumber;
        this.rating=rating;
    }

    //Getter Methods

    String getVehicleType(){
        return vehicleType;
    }
    int getLicenseNumber(){
        return licenseNumber;
    }
    double getRating(){
        return rating;
    }
    // method to calculate fare
    double calculateFare(double distance){
        if(vehicleType.equalsIgnoreCase("Car")){
            return distance * 10;
        }
        if (vehicleType.equalsIgnoreCase("Bike")){
            return distance * 5;
        }
        return 0;
    }
    //display method
    void display(){
        super.display();
        System.out.println("User Status : Driver");
        System.out.println("Vehicle Type : "+getVehicleType());
        System.out.println("License Number : "+getLicenseNumber());
        System.out.println("Rating : "+getRating());
    }
}
// Creating Passenger Class, inherits from User Class - Child Class
class Passenger extends User{

    //Attributes
    private String pickupLocation;
    private String destination;
    //Non-Parameterized Constructor
    Passenger(){
        pickupLocation = "Not specified";
        destination = "Not specified";
    }
    //Parameterized Constructor
    Passenger(int id,String name, String phoneNumber, String pickupLocation, String destination){
        super(id, name, phoneNumber);
        this.pickupLocation = pickupLocation;
        this.destination = destination;
    }

    //Getter Methods

    String getPickupLocation(){
        return pickupLocation;
    }

    String getDestination(){
        return destination;
    }
    //display method
    void display(){
        super.display();
        System.out.println("User Status : Passenger");
        System.out.println("Pickup Location : "+getPickupLocation());
        System.out.println("Destination : "+getDestination());
    }
}

// Creating Ride class to handle the system
class Ride{
    //Attributes
    private int rideId;
    private Driver driver;
    private Passenger passenger;
    private double distance;
    private double fare;

    //Parameterized Constructor
    Ride(int rideId, Driver driver, Passenger passenger, double distance){
        this.rideId = rideId;
        this.driver = driver;
        this.passenger = passenger;
        this.distance = distance;
        this.fare = driver.calculateFare(distance);
    }

    //Getter Methods

    int getRideId(){
        return rideId;
    }

    double getDistance(){
        return distance;
    }

    double getFare(){
        return fare;
    }

    // Display method
    void displayRideDetails(){
        System.out.println("------------------------------------");
        System.out.println("Ride Details\n");
        System.out.println("Ride ID : "+getRideId());
        System.out.println("Distance : "+getDistance());
        System.out.println("Fare : "+getFare());
        System.out.println("------------------------------------");
        System.out.println("Driver Details\n");
        driver.display();
        System.out.println("------------------------------------");
        System.out.println("Passenger Details\n");
        passenger.display();
        System.out.println("------------------------------------");

    }
}

// Main class to run the system
public class RideSharingSystem {
    //main method
    public static void main() {
        //Creating object of Driver class
        Driver driver = new Driver(100,"Ali","03001234567","Car",1234,4.5);
        //Creating object of Passenger class
        Passenger passenger = new Passenger(001,"Umar","0995123456","E-11","H-12");

        //Creating object of Ride class
        Ride ride = new Ride(11,driver,passenger,32);
        ride.displayRideDetails();//calling display method
    }
}
