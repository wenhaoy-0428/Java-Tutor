## Java

### Recursion

Recursion is the technique of making a function call itself. This technique provides a way to break complicated problems down into simple problems which are easier to solve.

```java
public class Main {
  public static void main(String[] args) {
    int result = sum(10);
    System.out.println(result);
  }
  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }
}
```

```
Problem:
  Sum(1 - 10)
    10 + Sum(1 - 9)
        9 + Sum(1-8)
          8 + Sum(1-7)
            ...
            1 + Sum(1-1)
```

```java
// Iteration / loop
public class Main {
  public static void main(String[] args) {
    int result = sum(10);
    System.out.println(result);
  }
  public static int sum(int k) {
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum += i;
    }
    return sum;
  }
}
```

### Fibonacci Series

The Fibonacci series is the sequence where each number is the sum of the previous two numbers of the sequence. The first two numbers of the Fibonacci series are 0 and 1 and are used to generate the Fibonacci series.

![fib](./assets/FIBONACCI-SERIES.png)

```
Fn = Fn-1 + Fn-2

where F0 = 0; F1 = 1
```


```java
// 0 1 1 2 / 4
int fib(n) {
  if (n == 1) {
    return 0;
  }
  if (n == 2) {
    return 1;
  }       
  n = fib(n - 1) + fib(n - 2);
  System.out.println(n);
  return n;
}
```

1. Recursion requires a terminate condition (`if`)
2. Create a smaller problem on existing problem.
3. Each step the outcome of the function is the same type.


### HashMap


In the ArrayList chapter, you learned that Arrays store items as an ordered collection, and you have to access them with an index number (int type). A HashMap however, store items in **"key/value"** pairs, and you can access them by an index of another type (e.g. a String).

One object is used as a key (index) to another object (value). It can store different types: String keys and Integer values, or the same type, like: String keys and String values:


```java
// Import the HashMap class
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    capitalCities.put("USA", "New York");
    capitalCities.put("USA", "Florida");
    System.out.println(capitalCities);


    // Print keys
    for (String i : capitalCities.keySet()) {
      System.out.println(i);
    }
  }
}
```

## Implementation

Hash
   1. A hash function can generate number based on whatever input.
   2. The same input will always generate the same output.
   3. Different input will normally generate different output.

```java
Hash(key) => hashValue; 

["London", "Berlin", "Oslo", "Washington DC", "New York"];

// England => London
// Hash("England") => 0
// USA => New York
// Hash("USA") => 0

["London", "Berlin", "New York", "", ""];
[{England: London}, {German: Berlin}, {USA: New York}]
```

## Question Left

1. How to solve collision during hashing the key.



## Problem Assistance




## External