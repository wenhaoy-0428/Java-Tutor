## Java


### Inheritance

Inheritance is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.

```java
class Vehicle {
  protected String brand = "Ford";        // Vehicle attribute
  public void honk() {                    // Vehicle method
    System.out.println("Tuut, tuut!");
  }
}

final class Car extends Vehicle {
  private String modelName = "Mustang";    // Car attribute

  public static void main(String[] args) {

    // Create a myCar object
    Car myCar = new Car();

    // Call the honk() method (from the Vehicle class) on the myCar object
    myCar.honk();
    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
    System.out.println(myCar.brand + " " + myCar.modelName);
  }
}

void main() {
    Car myCar = new Car();
    myCar.honk();
    // ERROR: myCar.modelName;
    // ERROR: myCar.brand
}
```

The `protected` modifier means this attribute is only available for subclasses, while not available for the outside world. If it was set to `private`, the Car class would not be able to access it.

> If you don't want other classes to inherit from a class, use the `final` keyword

`@Override` is optional, but it provides several benefits:
* Clarity: The `@Override` annotation makes it clear that the method is intended to override a method from a superclass or an implemented interface. This makes the code more readable and easier to understand.
* Compiler Checks: When you include the `@Override` annotation, the compiler will perform additional checks to ensure that the method you are defining is indeed overriding a method from a superclass or an implemented interface. This can help catch common mistakes, such as misspelling the method name or using the wrong parameter types.
* Documentation: The `@Override` annotation serves as a form of documentation, making it clear that the method is intended to override a method from a superclass or an implemented interface.

```java
// Without @Override
class SubClass extends SuperClass {
    public void myMethod() {
        // Override the myMethod() from SuperClass
    }
}

// With @Override
class SubClass extends SuperClass {
    @Override
    public void myMethod() {
        // Override the myMethod() from SuperClass
    }
}
```

### Interface

In Java, an interface is a programming construct that defines a contract or a set of methods, properties, and events that a class must implement. Interfaces are used to achieve abstraction and to define a common set of behaviors that multiple classes can share.


```java
public interface Vehicle {
    void start();
    void stop();
    double getFuelLevel();
    default void honk() {
        System.out.println("Honk!");
    }
    static int getNumWheels() {
        return 4;
    }
}

class Car implements Vehicle {
    ...
}

```

### Polymorphism

Inheritance lets us inherit attributes and methods from another class. Polymorphism uses those methods to perform different tasks. This allows us to perform a single action **in different ways**.

```java
class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class Main {
    public void func(Animal a) {
        a.animalSound();
    }

    public void funcA(Pig p) {
        p.animalSound();
    }

  public static void main(String[] args) {
    Animal myAnimal = new Animal();  // Create a Animal object
    
    // ERROR: Pig myPig = new Animal();
    Animal myPig = new Pig();  // Create a Pig object
    Animal myDog = new Dog();  // Create a Dog object
    func(myPig);
    func(myDog);

    funcA(myPig);
    // ERROR: funcA(myDog);

    myAnimal.animalSound();

    myPig.animalSound();
    myDog.animalSound();
  }
}
```

![interface](./assets/interface.png)

```java

class Production {
    int randomInt() {
        return ?;
    };
}

class Mock {
    int randomInt() {
        return 10;
    };
}

// Production code
public int func(Production in) {
    int a = in.randomInt();
    return a + 1;    
}

Mock m = new Mock();
// ERROR: func(m)

// Test code: a copy of production code with little modification
public int func(Mock in) {
    int a = in.randomInt();
    return a + 1;    
}
```


## Problem Assistance




## External