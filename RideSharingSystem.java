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
}

class Passenger extends User{
    private String pickupLocation;
    private String destination;
}

public class RideSharingSystem {
}
