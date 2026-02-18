class HotDogStand{
    int id;
    private int hotDogsSold;

    HotDogStand(int id, int sales){
        this.id = id;
        this.hotDogsSold = sales;
    }

    void justSold(){
        hotDogsSold+=1;
    }

    int getSales(){
        return hotDogsSold;
    }
}

public class StandsRecordManager{
    public static void main(String[] args) {
        HotDogStand hds1 = new HotDogStand(101, 50);
        HotDogStand hds2 = new HotDogStand(102, 40);
        HotDogStand hds3 = new HotDogStand(103, 30);

        hds1.justSold();
        hds1.justSold();

        hds2.justSold();
        hds2.justSold();
        hds2.justSold();
        hds2.justSold();

        hds3.justSold();
        hds3.justSold();

        System.out.println("The sales by stall with id "+hds1.id+" are "+hds1.getSales());
        System.out.println("The sales by stall with id "+hds2.id+" are "+hds2.getSales());
        System.out.println("The sales by stall with id "+hds3.id+" are "+hds3.getSales());
    }
}