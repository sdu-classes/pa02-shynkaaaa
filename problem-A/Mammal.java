public class Mammal extends Animal{
    Mammal(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return "Mammal[" + super.toString() + "]";
    }
}
