import Animal.Dog;
// !ERROR Small is only accessible to its peers
import Animal.Greetings;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        // !ERROR, not imported
        Cat cat = new Cat();
        System.out.print(dog.printClass());
        // !ERROR property category is private
        System.out.print(dog.category);
    }
}