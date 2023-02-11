public class Animal {
    protected String name;
    Animal(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Animal[name=" + name + "]";
    }
}
