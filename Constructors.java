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
