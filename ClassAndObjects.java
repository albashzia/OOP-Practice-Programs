class Pen
{
    String color;
    String type;

    public void printColor()
    {
        System.out.println(this.color);
    }
    
    public void printType()
    {
        System.out.println(this.type);
    }
    
}
public class ClassAndObjects {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        Pen p2 = new Pen();
        Pen p3 = new Pen();

        p1.color = "black";
        p2.color = "blue";
        p3.color = "red";
        
        p1.type = "gel";
        p2.type = "ballpoint";
        p3.type = "pointer";

        System.out.println(p1.color);
        p1.printColor();
        System.out.println(p1.type);
        p1.printType();
        
        System.out.println(p2.color);
        p2.printColor();
        System.out.println(p2.type);
        p2.printType();
        
        System.out.println(p3.color);
        p3.printColor();
        System.out.println(p3.type);
        p3.printType();
    }
    
}
