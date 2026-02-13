//creating Time class
class Time{

    //defining attributes
    int hours;
    int minutes;
    int seconds;

    //non-parameterized constructor
    Time(){
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    //method to set time values
    void setTime(int hours, int minutes, int seconds)
    {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    //method to display time
    void displayTime()
    {
        System.out.println("The time is : "+hours+" : "+minutes+" : "+seconds);
    }

}

//main class
public class TimeSetterDemo {

    //main method
    public static void main(String[] args) {

        //creating object of Time class
        Time t1 = new Time();

        //calling displayTime() for default time
        t1.displayTime();

        System.out.println("");

        //calling setTime() to update time
        t1.setTime(1,8,23);

        //calling displayTime() again after updating time
        t1.displayTime();
    }
}
