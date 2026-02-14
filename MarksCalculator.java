//creating Marks class
class Marks{

    //defining attributes
    int a;
    int b;
    int c;

    //non-parameterized constructor
    Marks(){
        a = 0;
        b = 0;
        c = 0;
    }

    //parameterized constructor
    Marks(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //method to calculate sum of marks
    int calculateSum(){
        int sum = a + b + c;
        return sum;
    }
}

//main class
public class MarksCalculator {

    //main method
    public static void main(String[] args) {

        //creating object using parameterized constructor
        Marks m1 = new Marks(34,32,33);

        //calling calculateSum() method
        System.out.println("Marks : "+m1.calculateSum());
    }
}
