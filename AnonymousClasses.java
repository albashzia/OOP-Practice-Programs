class AnimalClass{
    void makeSound(){

    }
}


public class AnonymousClasses {
    public static void main(String[] args) {
        AnimalClass animal = new AnimalClass(){
            public void makeSound(){
                System.out.println("Woof Woof");
            }
        };
        animal.makeSound();
    }
}
