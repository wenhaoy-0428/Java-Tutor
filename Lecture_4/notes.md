## Java

### Method overloading

In order to write overcome the pain of coming up with new names for nearly the same functions with different parameter types, Java allows us to overload the function name with different parameters.


```java
int myMethod(int x)
float myMethod(float x)
string myMethod(float x)
double myMethod(double x, double y)

int add(int x, int y) {
  
}

float add(float x, int y) {
  
}

float add(float x, float y, float z) {
  return x + y + z;
}

add(1.1, 2.2, 3.3)
add(1, 2, 3) // ERROR
```



```java
static int plusMethod(int x, int y) {
  return x + y;
}

plusMethod(1, 2) // 3

plusMethod(1.2, 2.3) // ERROR

static double plusMethod(double x, double y) {
  return x + y;
}

public static void main(String[] args) {
  int myNum1 = plusMethod(8, 5);
  double myNum2 = plusMethod(4.3, 6.26);
  System.out.println("int: " + myNum1);
  System.out.println("double: " + myNum2);
}
```

### [Static keyword in Java](https://www.geeksforgeeks.org/static-keyword-java/)

The users can apply static keywords with variables, methods, blocks, and nested classes. **The static keyword belongs to the class than an instance of the class.**


The static keyword is a non-access modifier in Java that is applicable for the following: 

1. Blocks
2. Variables
3. Methods
4. Classes


Shared memory allocation: Static variables and methods are allocated memory space **only once** during the execution of the program. This memory space is shared among all instances of the class, which makes static members useful for maintaining global state or shared functionality.

> When a member is declared static, it can be accessed before any objects of its class are created, and without reference to any object.

## Problem Assistance


## External