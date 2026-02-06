// Student class
class Students{
    int rollNo;
    String name;
    double cgpa;

    //non-parameterized constructor
    Students()
    {
        System.out.println("Object Created.");
    }

    // parameterized constructor - 3 parameters
    Students(int rno, String n, double c)
    {
        rollNo = rno;
        name = n;
        cgpa = c;
    }

    // parameterized constructor - 2 parameters
    Students(int rollNo, String name)
    {
        this.rollNo = rollNo;
        this.name = name;

    }
}

//main class - Constructors
public class Constructors {
    public static void main(String[] args) {
        Students s1 = new Students(); // constructor 1
        Students s2 = new Students(1001, "Ali", 3.4); // constructor 2
        Students s3 = new Students(1002, "Ehsan"); // constructor 3

        System.out.println("Details of Object s1");
        s1.rollNo = 1000;
        s1.name = "Amir";
        s1.cgpa = 3.2;
        System.out.println(s1.rollNo);
        System.out.println(s1.name);
        System.out.println(s1.cgpa);
        System.out.println();
        System.out.println("Details of Object s2");
        System.out.println(s2.rollNo);
        System.out.println(s2.name);
        System.out.println(s2.cgpa);
        System.out.println();
        System.out.println("Details of object s3");
        System.out.println(s3.rollNo);
        System.out.println(s3.name);
    }
}
