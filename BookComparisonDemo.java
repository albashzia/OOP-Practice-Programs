class Book{
    private String author;
    private String[] chapterNames = new String[100];

    Book(){
        author = "null";
    }

    Book(String name, String[] chapters){
        author = name;
        chapterNames = chapters;
    }

    void setAuthor(String name){
        author = name;
    }

    String getAuthor(){
        return author;
    }

    void setChapterNames(String[] names){
        chapterNames = names;
    }

    String[] getChapterNames(){
        return chapterNames;
    }

    public int getChapterCount() {
        return chapterNames.length;
    }

    public static boolean compareBooks(Book b1, Book b2) {
        return b1.author.equals(b2.author);
    }

    public static Book compareChapterNames(Book b1, Book b2) {
        if (b1.getChapterCount() >= b2.getChapterCount()) {
            return b1;
        } else {
            return b2;
        }
    }
}
public class BookComparisonDemo {
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.setAuthor("Ali");

        String[] chapters1 = {"Intro", "Basics", "Advanced"};
        book1.setChapterNames(chapters1);

        String[] chapters2 = {"Start", "Middle"};
        Book book2 = new Book("Ali", chapters2);

        boolean sameAuthor = Book.compareBooks(book1, book2);
        System.out.println("Same author: " + sameAuthor);

        Book largerBook = Book.compareChapterNames(book1, book2);
        System.out.println("Author with more chapters: " + largerBook.getAuthor());
    }
}
