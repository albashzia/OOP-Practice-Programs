class Student{
    String name;
    int age;

    void printInfo(String name){
        System.out.println("Name : "+this.name);
    }

    void printInfo(int age){
        System.out.println("Age : "+this.age);
    }

    void printInfo(String name, int age){
        System.out.println("Name : "+this.name+"\n"+"Age : "+this.age);
    }
}

public class Polymorphism {

}
