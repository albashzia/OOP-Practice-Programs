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
        
    }
    
}
