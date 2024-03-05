# RoadMap

0. Intro to background
1. Basics
2. Classes I
3. Modifiers
4. Packages
5. Classes II
   1. Inheritance
   2. Polymorphism
6. DataStructure



## Object Oriented Programming Language

Real-world objects share two characteristics: They all have **state** and **behavior**. Dogs have state (name, color, breed, hungry) and behavior (barking, fetching, wagging tail). Bicycles also have state (current gear, current pedal cadence, current speed) and behavior (changing gear, changing pedal cadence, applying brakes). Identifying the state and behavior for real-world objects is a great way to begin thinking in terms of object-oriented programming.

> a class is a template for objects, and an object is an instance of a class.


## DataTypes


The main difference between primitive and non-primitive data types are:

1. Primitive types are **predefined** (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for `String`).
2. Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
3. **A primitive type has always a value, while non-primitive types can be `null`.**
A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.

```java
// Variable
int a = 10;

a = 20;

int b = 20;

Char cc = 'a';

int c = a + b;

// TODO: Bool

// function

// argument, parameter
boolean isEqual(int a, int b) {
   return a == b;
}

// Class
// object-oriented-programming


class Human() {
   int x = 0;
   int y = 0;
   int z = 0;

   int forward() {
      // .....
      return x,y,z
   }

   int backward() {

   }
}

class Box() {
   String color = "Blue";
}

Box.color





// instantiate, 

// An object is an instance of a class.

// Constructor


public class Human {
   private String name;
   private boolean gender;
   private int height = 10;
   private int age;

    // Constructor
    public Human(String newName, boolean newGender, int newAge) {
        name = newName;
        gender = newGender;
        age = newAge;
        height = age * 0.01;

        
    }

    public addOne() {
      self.myNumber++;
    }

    // Other methods and members of the class...
}

```