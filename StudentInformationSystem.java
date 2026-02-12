//creating Student class
class Std{
    //defining attributes
    int rollNo;
    String name;
    double cgpa;
    int semester;

    //parameterized constructor
    Std(int rollNo, String name, double cgpa, int semester)
    {
        this.rollNo = rollNo;
        this.name = name;
        this.cgpa = cgpa;
        this.semester = semester;
    }

    //method to display details
    void displayInfo()
    {
        System.out.println("Roll No: "+rollNo);
        System.out.println("Name : "+name);
        System.out.println("CGPA : "+cgpa);
        System.out.println("Semester :"+semester);
    }

    //method to display CGPA
    public void displayCGPA()
    {
        System.out.println("CGPA is :"+cgpa);
    }

    //method to update the value of CGPA for the object
    public void updateCGPA(double y)
    {
        cgpa = y;
    }

    //method to change the semester for the object
    public void changeSemester(int x){
        semester = x;
    }
}
public class StudentInformationSystem {
    public static void main(String[] args)
    {
        //creating object of Student class.
        Std s1 = new Std(101, "Ali", 3.72, 2);

        s1.displayInfo(); //calling displayInfo() for the Student object
        s1.changeSemester(3); //calling changeSemester() for the Student object
        s1.updateCGPA(3.84); //calling updateCGPA() for the Student object
        s1.displayInfo(); //calling displayInfo() method again for the Student object
    }
}
