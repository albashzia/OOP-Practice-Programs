class Address {
    private int streetNo;
    private int houseNo;
    private String city;
    private int code;

    public Address(int streetNo, int houseNo, String city, int code) {
        this.streetNo = streetNo;
        this.houseNo = houseNo;
        this.city = city;
        this.code = code;
    }

    public int getStreetNo() {
        return streetNo;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public String getCity() {
        return city;
    }

    public int getCode() {
        return code;
    }

    public void setStreetNo(int streetNo) {
        this.streetNo = streetNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public void setCity(String city) {
        this.city = city;
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

class Person {
    private String name;
    private int age;
    private Address a;

    public Person(String name, int age, Address a) {
        this.name = name;
        this.age = age;
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return a;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(Address a) {
        this.a = a;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
        a.display();
    }
}

public class AssociationsDemo1 {
    public static void main(String[] args) {

        Address addr = new Address(12, 45, "Haripur", 22620);

        Person p1 = new Person("Ali", 22, addr);

        p1.display();
    }
}
