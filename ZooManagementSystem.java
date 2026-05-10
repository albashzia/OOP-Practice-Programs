/***Consider a scenario where you are designing a soŌware system for a zoo. The zoo has various
 types of animals, such as mammals, birds, and repƟles. Each type of animal has common
 aƩributes and behaviors, but also unique ones. Design a class hierarchy using abstract classes
 and inheritance to represent this scenario.
 a) Create an abstract class called Animal that has the following aƩributes:
 i) A String variable named name to store the name of the animal.
 ii) An integer variable named age to store the age of the animal.
 The Animal class should also have the following methods:
 An abstract method called eat() that represents the eaƟng behavior of the animal.
 A non-abstract method called sleep() that prints "The animal is sleeping."
 b) Create two concrete classes, Mammal and Bird, that extend the Animal class. These classes
 should define their own unique aƩributes and behaviors. For example, the Mammal class
 could have an addiƟonal aƩribute furColor and a method run(), while the Bird class could
 have an addiƟonal aƩribute wingSpan and a method fly().
 Implement the eat() method in both the Mammal and Bird classes. The implementaƟon
 should print "The [animal name] is eaƟng." where [animal name] is the name of the specific
 animal.
 Your task is to implement the classes according to the given requirements and demonstrate their
 usage in a separate Main class.***/
abstract class Animal{
    String name;
    int age;

    abstract public void eat();
    public void sleep(){
        System.out.println("The animal is sleeping");
    }
}
public class ZooManagementSystem {
}
