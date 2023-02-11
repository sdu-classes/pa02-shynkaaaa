import java.sql.SQLOutput;

public class Dog extends Mammal{
    Dog(String name) {
        super(name);
    }
    void greets() {
        System.out.println("Woof");
    }
    void greets(Dog another) {
        System.out.println("Woooof");
    }
    @Override
    public String toString() {
        return "Dog[" + super.toString() + "]";
    }
}
