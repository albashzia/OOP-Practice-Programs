class RectangleClass{
    public int length;
    public int width;

    public int calculateArea(){
        return (length*width);
    }
}
public class Runner {
    public static void main(String[] args)
    {
        RectangleClass rect = new RectangleClass();
        rect.length = 10;
        rect.width = 5;
        System.out.println(rect.calculateArea());
    }
}

