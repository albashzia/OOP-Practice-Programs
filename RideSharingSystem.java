/*
Ride Sharing System
A transportation company develops a ride-sharing system to connect passengers
with drivers in real time. Each user in the system follows a common structure but has
different roles and information depending on whether they are a driver or a passenger.
Drivers store details such as vehicle type, license number, and rating,
while passengers provide their pickup location and destination. The system tracks
rides by combining driver and passenger information, calculates fares based on
distance and vehicle type, and displays relevant details for each participant.
The application can also show customized information for drivers and passengers,
 ensuring that each type of user sees the data relevant to their role.
 Design and implement this system in Java, making use of a
common user structure while allowing specialized behavior for drivers and passengers.
*/
class User{
    private int id;
    private String name;
    private String phoneNumber;
    User(){
        id = 0;
        name = "Null";
        phoneNumber = "000000000";
    }

    User(int id, String name, String phoneNumber){
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    String getPhoneNumber(){
        return phoneNumber;
    }

    void display(){
        System.out.println("User Id : "+getId());
        System.out.println("Name : "+getName());
        System.out.println("Phone Number : "+getPhoneNumber());
    }
}

class Driver extends User{
    private String vehicleType;
    private int licenseNumber;
    private double rating;

    Driver(){
        vehicleType = "Undefined";
        licenseNumber = 0000;
        rating = 0.0;
    }

    Driver(int id, String name, String phoneNumber,String vehicleType,int licenseNumber,double rating){
        super(id, name, phoneNumber);
        this.vehicleType = vehicleType;
        this.licenseNumber = licenseNumber;
        this.rating=rating;
    }

    String getVehicleType(){
        return vehicleType;
    }
    int getLicenseNumber(){
        return licenseNumber;
    }
    double getRating(){
        return rating;
    }

    double calculateFare(double distance){
        if(vehicleType.equalsIgnoreCase("Car")){
            return distance * 10;
        }
        if (vehicleType.equalsIgnoreCase("Bike")){
            return distance * 5;
        }
        return 0;
    }

    void display(){
        super.display();
        System.out.println("User Status : Driver");
        System.out.println("Vehicle Type : "+getVehicleType());
        System.out.println("License Number : "+getLicenseNumber());
        System.out.println("Rating : "+getRating());
    }
}

class Passenger extends User{
    private String pickupLocation;
    private String destination;

    Passenger(){
        pickupLocation = "Not specified";
        destination = "Not specified";
    }

    Passenger(int id,String name, String phoneNumber, String pickupLocation, String destination){
        super(id, name, phoneNumber);
        this.pickupLocation = pickupLocation;
        this.destination = destination;
    }

    String getPickupLocation(){
        return pickupLocation;
    }

    String getDestination(){
        return destination;
    }

    void display(){
        super.display();
        System.out.println("User Status : Passenger");
        System.out.println("Pickup Location : "+getPickupLocation());
        System.out.println("Destination : "+getDestination());
    }
}

class Ride{
    private int rideId;
    private Driver driver;
    private Passenger passenger;
    private double distance;
    private double fare;

    Ride(int rideId, Driver driver, Passenger passenger, double distance){
        this.rideId = rideId;
        this.driver = driver;
        this.passenger = passenger;
        this.distance = distance;
        this.fare = driver.calculateFare(distance);
    }

    int getRideId(){
        return rideId;
    }

    double getDistance(){
        return distance;
    }

    double getFare(){
        return fare;
    }

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

public class RideSharingSystem {
}
