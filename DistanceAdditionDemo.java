class DistanceCl{
    private int feet;
    private int inches;

    DistanceCl(){
        feet = 0;
        inches = 0;
    }

    DistanceCl(int x, int y){
        feet = x;
        inches = y;
    }

    void setFeet(int x){
        feet = x;
    }

    void setInches(int y){
        inches = y;
    }

    int getFeet(){
        return feet;
    }

    int getInches(){
        return inches;
    }

    void display(){
        System.out.println(feet);
        System.out.println(inches);
    }

    DistanceCl Add(DistanceCl b){
        DistanceCl c = new DistanceCl(feet + b.getFeet(), inches +b.getInches());
        return c;
    }
}
public class DistanceAdditionDemo{
    public static void main(String[] args) {
        DistanceCl d1 = new DistanceCl(12,14);
        DistanceCl d2 = new DistanceCl(19,21);
        DistanceCl d3 = new DistanceCl();
        d3 = d1.Add(d2);
        d3.display();
    }
}
