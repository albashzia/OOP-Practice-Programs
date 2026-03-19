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

    Book2(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

}

public class E_BookSystem {
}
