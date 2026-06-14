import java.io.Serializable;

class Student2{
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
}


public class SerialisationPractice1 {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        Student2 s2 = new Student2(101,"Max");
    }
}
