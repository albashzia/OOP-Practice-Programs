class MarksClass{
    private int maths;
    private int english;
    private int physics;

    MarksClass(){
        maths = 0;
        english = 0;
        physics = 0;
    }

    void setMaths(int m){
        maths = m;
    }

    void setEnglish(int e){
        english = e;
    }

    void setPhysics(int p){
        physics = p;
    }

    int getMaths(){
        return maths;
    }

    int getEnglish(){
        return english;
    }

    int getPhysics(){
        return physics;
    }
}
public class MarksDisplay{
    public static void main(String[] args) {
        MarksClass m = new MarksClass();
        m.setMaths(71);
        m.setEnglish(68);
        m.setPhysics(65);
        System.out.println(m.getMaths());
        System.out.println(m.getEnglish());
        System.out.println(m.getPhysics());
    }
}