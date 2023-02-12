public class Person {
    protected String name;
    protected String address;
    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    String getName() {
        return name;
    }
    String getAddress() {
        return address;
    }
    void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }
}
