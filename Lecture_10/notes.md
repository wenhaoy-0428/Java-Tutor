## Java


### Lambda

A lambda expression is a short block of code which takes in parameters and returns a value. 

Lambda expressions are similar to methods, but they **do not need a name** and they can be implemented right in the body of a method.

> Lambda functions are anonymous functions.

If there's only one statement, it can be written directly, and will be marked as the return statement directly.

```
(parameter1, parameter2) -> expression
```


```
(parameter1, parameter2) -> { code block }

(a, b) -> {
  if (a > b) {
    return 1;
  } else {
    return 2;
  }
}
```





Example:

```java
import java.util.ArrayList;

class ArrayListInteger {
  int list = int[];

  public ArrayListInteger() {
    .... 
  }

  ...
  public forEach() {
    ...
  }
}

int a = 10;
a.toString() => "a";

class ArrayListStudent {
  ? list = ?[];

  public ArrayListStudent() {
    ....
  }



  ...
  public forEach() {
    ...
  }
}








public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> number = new ArrayList();
    
    void function(Integer number) {
      System.out.println(number);
    }

    for (Integer number : numbers) {
      function(number);
    }

    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);
    numbers.forEach( (n) -> { System.out.println(n); } );
  }
}
```

Also lambda expression can be stored into a variable if the variable's **type is an interface which has only one method**

只有当声明的变量类型是一个只有一个属性的interface时，lambda可以被保存于该变量。

```java
interface StringFunction {
  String run(String str);
}

public class Main {
  public static void main(String[] args) {
    StringFunction exclaim = (s) -> s + "!";
    StringFunction ask = (s) -> s + "?";
    printFormatted("Hello", exclaim);
    printFormatted("Hello", ask);
  }
  public static void printFormatted(String str, StringFunction format) {
    String result = format.run(str);
    System.out.println(result);
  }
}
```


### Generics

**Angle Bracket** in Java is used to define Generics. It means that the angle bracket takes a generic type, say `T`, in the definition and any class as a parameter during the calling. The idea is to allow type (Integer, String, … etc and user-defined types) to be a parameter to methods, classes, and interfaces. For example, classes like HashSet, ArrayList, HashMap, etc use generics very well. We can use them for any type.

```java
class Test<T> { 
  
    // An object of type T is declared 
    T obj; 
  
    // constructor 
    Test(T obj) 
    { 
        this.obj = obj; 
    } 
  
    public T getObject() 
    { 
        return this.obj; 
    } 
} 
  
// Driver class to test above 
class Main { 
    public static void main(String[] args) 
    { 
        // instance of Integer type 
        Test<Integer> iObj 
            = new Test<Integer>(15); 
        System.out.println(iObj.getObject()); 
  
        // instance of String type 
        Test<String> sObj 
            = new Test<String>("GeeksForGeeks"); 
        System.out.println(sObj.getObject()); 
    } 
}
```

### Exercise

1. Create a variable named maxSpeed and assign the value `120` to it.

```java
int maxSpeed  =  120;
```


2. Create a variable called z, assign x + y to it, and display the result.

```java
int x = 5;
int y = 10;
int z  = x + y;
System.out.println(z);
```


3. Type casting - convert the following double type (myDouble) to an int type:

```java
double myDouble = 9.78d;
int myInt = (int) myDouble;
```

4. Use the correct method to print the length of the txt string.

```java
String txt = "Hello";
System.out.println(txt.length());
```

5. Use the correct operator to concatenate two strings:

```java
String firstName = "John ";
String lastName = "Doe";
System.out.println(firstName + lastName);

a || b
if (a && b) {

}



```

## Problem Assistance




## External