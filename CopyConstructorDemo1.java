class StudentClass{
    String name;
    int age;

    StudentClass(){
        this.name = "Null";
        this.age = 0;
    }

    StudentClass(String name, int age){
        this.name = name;
        this.age = age;
    }

    StudentClass(StudentClass s){
        this.name = s.name;
        this.age = s.age;
    }

    void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}

public class CopyConstructorDemo1 {
    public static void main(){
        StudentClass s1 = new StudentClass();
        s1.display();
        StudentClass s2 = new StudentClass("Ali",18);
        s2.display();
        StudentClass s3 = new StudentClass(s1);
        s3.display();
        s3 = s2;
        s3.display();
    }
}
