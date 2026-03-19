/*
Ride Sharing System
A transportation company develops a ride-sharing system to connect passengers
with drivers in real time. Each user in the system follows a common structure but has
different roles and information depending on whether they are a driver or a passenger.
Drivers store details such as vehicle type, license number, and rating,
while passengers provide their pickup location and destination. The system tracks
rides by combining driver and passenger information, calculates fares based on
*/
class User{
    private int id;
    private String name;
    private String phoneNumber;
}

class Driver extends User{
    private String vehicleType;
    private int licenseNumber;
    private double rating;
}
public class RideSharingSystem {
}
