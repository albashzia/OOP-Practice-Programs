import java.util.ArrayList;
import java.util.Random;

class RandomBox<T> {

    private ArrayList<T> items;
    private Random random;

    // Constructor
    public RandomBox() {
        items = new ArrayList<>();
        random = new Random();
    }

    // Add item to box
    public void add(T item) {
        items.add(item);
    }

    // Check if box is empty
    public boolean isEmpty() {
        return items.isEmpty();
    }

    // Draw random item
    public T drawItem() {

        if (isEmpty()) {
            System.out.println("The box is empty.");
            return null;
        }

        int randomIndex = random.nextInt(items.size());

        return items.remove(randomIndex);
    }
}

public class GenericBoxDemo {

    public static void main(String[] args) {

        // String Example
        RandomBox<String> nameBox = new RandomBox<>();

        nameBox.add("Ali");
        nameBox.add("Ahmed");
        nameBox.add("Usman");

        System.out.println("Random Name: " + nameBox.drawItem());

        // Integer Example
        RandomBox<Integer> lotteryBox = new RandomBox<>();

        lotteryBox.add(7);
        lotteryBox.add(14);
        lotteryBox.add(21);
        lotteryBox.add(35);

        System.out.println("Lottery Pick: " + lotteryBox.drawItem());

        // Empty box test
        RandomBox<Double> emptyBox = new RandomBox<>();

        System.out.println("Draw from empty box: " + emptyBox.drawItem());
    }
}