/***A software company is developing a simple library management system.
 * To manage different types of collections in a uniform way, they design an interface called IterableCollection,
 which provides methods for sequentially accessing elements of a collection.
 The interface defines two methods: hasNext(int index), which checks whether there is another
 element available at the given position, and getNext(int index), which returns the element stored
 at that position.
 To implement this interface, a class called BookCollection is created. This class stores book titles
 in a simple string array. The constructor of the class initializes the array with a set of sample book
 titles.
 The class implements the methods of the interface to allow iteration through the collection. Finally,
 a main method is written to create an object of BookCollection, initialize it with sample data, and
 iterate through all the book titles using the hasNext() and getNext() methods, printing each title on
 the screen.***/
interface IterableCollection {

    boolean hasNext(int index);

    String getNext(int index);
}

class BookCollection implements IterableCollection {

    String[] titles;

    BookCollection() {
        titles = new String[]{
                "Java Programming",
                "Data Structures",
                "Operating Systems",
                "Database Systems",
                "Software Engineering"
        };
    }

    @Override
    public boolean hasNext(int index) {
        return index < titles.length;
    }

    @Override
    public String getNext(int index) {
        return titles[index];
    }
}

public class LMSInterface {

    public static void main(String[] args) {

        BookCollection books = new BookCollection();

        int index = 0;

        while (books.hasNext(index)) {
            System.out.println(books.getNext(index));
            index++;
        }
    }
}