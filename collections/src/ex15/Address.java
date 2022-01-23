package ex15;

public class Address {
    private String name;
    private String street;
    private String city;
    private String code;

    public Address(String name, String street, String city, String code) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
