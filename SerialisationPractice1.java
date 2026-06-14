import java.io.*;

class Student2 implements Serializable{
    int id;
    String name;

    Student2(){
        id = 0;
        name = null;
    }

    Student2(int id, String name){
        this.id = id;
        this.name = name;
    }

    void display(){
        System.out.println("Id: "+this.id);
        System.out.println("Name: "+this.name);
    }
}


public class SerialisationPractice1 {
    public static void main(String[] args) throws IOException {
        Student2 s1 = new Student2();
        Student2 s2 = new Student2(101,"Max");

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.ser"));
            oos.writeObject(s1);
            oos.writeObject(s2);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.ser"));
            Student2 s3 = (Student2) ois.readObject();
            Student2 s4 = (Student2) ois.readObject();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
