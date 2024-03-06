package Animal;

public class Dog {
    private String category = "Dog";

    private Greetings g;

    public String printClass() {
        return this.category;
    }

    public void sayHi() {
        System.out.println(g.sayHi(category));
    }
}
