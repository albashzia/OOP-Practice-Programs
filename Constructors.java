class Students{
    int rollNo;
    String name;
    double cgpa;

    Students()
    {
        System.out.println("Object Created.");
    }

    Students(int rno, String n, double c)
    {
        rollNo = rno;
        name = n;
        cgpa = c;
    }

    Students(int rollNo, String name)
    {
        this.rollNo = rollNo;
        this.name = name;

    }
}
public class Constructors {
    public static void main(String[] args) {
        Students s1 = new Students();
        Students s2 = new Students(1001, "Ali", 3.4);
        Students s3 = new Students(1002, "Ehsan");
    }
}
