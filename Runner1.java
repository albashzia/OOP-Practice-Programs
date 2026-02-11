class RectangleClass1{
    public int length;
    public int width;

    RectangleClass1(){
        length = 5;
        width = 2;
    }

    RectangleClass1(int l, int w){
        length = l;
        width = w;
    }

    public int calculateArea(){
        return (length*width);
    }
}

public class Runner1 {
    public static void main(String[] args)
    {
        RectangleClass1 rect = new RectangleClass1();
        System.out.println(rect.calculateArea());
        RectangleClass1 rect1 = new RectangleClass1(10,20);
        System.out.println(rect1.calculateArea());
    }
}
