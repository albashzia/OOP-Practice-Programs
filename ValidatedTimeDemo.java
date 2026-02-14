//creating Time class
class TimeClass {

    //defining private attributes
    private int hour;
    private int minutes;
    private int second;

    //non-parameterized constructor
    TimeClass() {
        hour = 0;
        minutes = 0;
        second = 0;
    }

    //parameterized constructor with validation
    TimeClass(int hour, int minutes, int second) {

        //validation for Hour (0-23)
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            this.hour = 0;
            System.out.println("Invalid Hour.");
        }

        //validation for Minutes (0-59)
        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        } else {
            this.minutes = 0;
            System.out.println("Invalid Minutes.");
        }

        //validation for Seconds (0-59)
        if (second >= 0 && second < 60) {
            this.second = second;
        } else {
            this.second = 0;
            System.out.println("Invalid Seconds!.");
        }
    }

    //method to display time in formatted form
    public void displayTime() {
        System.out.printf("Time: %02d:%02d:%02d%n", hour, minutes, second);
    }
}

//main class
public class ValidatedTimeDemo {

    //main method
    public static void main(String[] args) {

        //creating object with valid values
        TimeClass t1 = new TimeClass(14,30,05);
        t1.displayTime();

        //creating object with invalid values to test validation
        TimeClass t2 = new TimeClass(25,75,40);
        t2.displayTime();
    }
}
