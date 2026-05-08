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