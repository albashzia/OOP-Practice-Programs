//Creating Book class - Parent Class
class Book2{
    //defining attributes
    private String title;
    private String author;
    private double price;

    //default constructor
    Book2(){
        title = "Undefined";
        author = "Unknown";
        price = 0.00;
    }

    //parameterized constructor
    Book2(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //Getter Methods
    String getTitle(){
        return title;
    }

    String getAuthor(){
        return author;
    }

    double getPrice(){
        return price;
    }

    // display method
    void display(){
        System.out.println("Book Name : "+getTitle());
        System.out.println("Author Name : "+getAuthor());
        System.out.println("Price : "+getPrice());
    }
}

// EBook class inherits Book2 class
class Ebook extends Book2{
    //defining attributes
    private String fileSize;
    private String format;

    //default constructor
    Ebook(){
        fileSize = "0 MB";
        format = "Not specified";
    }

    //parameterized constructor
    Ebook(String title,String author,double price,String fileSize,String format){
        super(title,author,price);
        this.fileSize = fileSize;
        this.format = format;
    }

    //getter methods
    String getFileSize(){
        return fileSize;
    }

    String getFormat(){
        return format;
    }

    //display method
    void display(){
        super.display(); // calls display method of parent class
        System.out.println("File Size : "+getFileSize());
        System.out.println("Format : "+getFormat());
    }
}
// Main class
public class E_BookSystem {
    public static void main(String[] args){

        System.out.println("-----------------------------------");
        Book2 b1 = new Book2(); // creating Book object using default constructor
        b1.display();
        System.out.println("-----------------------------------");
        Ebook eB1 = new Ebook(); // creating Ebook object using default constructor
        eB1.display();
        System.out.println("-----------------------------------");

        // creating Book object using parameterized constructor
        Book2 b2 = new Book2("Programming Basics", "Dietel and Dietel",60.99);
        b2.display();
        System.out.println("-----------------------------------");

        // creating Ebook object using parameterized constructor
        Ebook eB2 = new Ebook(b2.getTitle(), b2.getAuthor(),b2.getPrice(),"12 MB","PDF");
        eB2.display();
        System.out.println("-----------------------------------");
    }
}
