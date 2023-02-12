public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Sandwich");
        Mammal mammal = new Mammal("Hamburger");
        Cat cat = new Cat("Cheeseburger");
        Dog dog = new Dog("Aktos");
        System.out.println(animal);
        System.out.println(mammal);
        cat.greets();
        System.out.println(cat);
        dog.greets();
        dog.greets(dog);
        System.out.println(dog);
    }
}
