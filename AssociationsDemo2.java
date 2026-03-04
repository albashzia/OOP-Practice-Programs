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

public class AssociationsDemo2 {
}
