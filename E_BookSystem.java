/*
E-Book System
A publishing company wants to manage different types of books in its catalog.
All books share basic information such as title, author, and price,
but some books are digital and include extra details like file size and format (PDF, EPUB, etc.).
Design a program in Java where a general Book class stores the common attributes,
while an EBook class extends it with its own specific properties.
Both types should allow creating objects with default
values or with complete information, and the system should provide a way to display all
relevant details for each book.
*/
class Book2{
    private String title;
    private String author;
    private double price;

    Book2(){
        title = "Undefined";
        author = "Unknown";
        price = 0.00;
    }

    Book2(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    String getTitle(){
        return title;
    }

    String getAuthor(){
        return author;
    }

    double getPrice(){
        return price;
    }

    void display(){
        System.out.println("Book Name : "+getTitle());
        System.out.println("Author Name : "+getAuthor());
        System.out.println("Price : "+getPrice());
    }
}

class Ebook extends Book2{
    private String fileSize;
    private String format;

    Ebook(){
        fileSize = "0 MB";
        format = "Not specified";
    }

    Ebook(String title,String author,double price,String fileSize,String format){
        super(title,author,price);
        this.fileSize = fileSize;
        this.format = format;
    }

    String getFileSize(){
        return fileSize;
    }

    String getFormat(){
        return format;
    }

    void display(){
        super.display();
        System.out.println("File Size : "+getFileSize());
        System.out.println("Format : "+getFormat());
    }
}
public class E_BookSystem {
    public static void main(String[] args){
        Ebook eB1 = new Ebook();
        eB1.display();
    }
}
