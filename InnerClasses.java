class OuterClass{
    int x = 10;

    class InnerClass{
        int y = 5;
    }
}


public class InnerClasses {
    public static void main(String[] args) {
        OuterClass myOuterObject = new OuterClass();
        OuterClass.InnerClass myInnerObject = myOuterObject. new InnerClass();
        System.out.println(myOuterObject.x + myInnerObject.y);
    }
}
