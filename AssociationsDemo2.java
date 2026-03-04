class Address1 {
    private int streetNo;
    private int houseNo;
    private String city;
    private int code;

    public Address1(int streetNo, int houseNo, String city, int code) {
        this.streetNo = streetNo;
        this.houseNo = houseNo;
        this.city = city;
        this.code = code;
    }

    public int getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(int streetNo) {
        this.streetNo = streetNo;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void display() {
        System.out.println("Street#: " + streetNo +
                ", House#: " + houseNo +
                ", City: " + city +
                ", Code: " + code);
    }
}

class Person1 {
    private String name;
    private int age;
    private Address1 address;

    public Person1(String name, int age, Address1 address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address1 getAddress() {
        return address;
    }

    public void setAddress(Address1 address) {
        this.address = address;
    }

    public void display() {
        System.out.println("Author: " + name + ", Age: " + age);
        address.display();
    }
}

class Book1 {
    private String bookName;
    private String publisher;
    private Person1 author;

    public Book1(String bookName, String publisher, Person1 author) {
        this.bookName = bookName;
        this.publisher = publisher;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public String getPublisher() {
        return publisher;
    }

    public Person1 getAuthor() {
        return author;
    }

    public void display() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Publisher: " + publisher);
        author.display();
    }
}

public class AssociationsDemo2 {
}
