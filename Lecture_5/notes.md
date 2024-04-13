## Java

### ArrayList

The ArrayList class is a **resizable** array, which can be found in the java.util package.

The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). 


```java
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    String[] cars = {"Volvo"};
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
  }
}
```

> The ArrayList class has a regular array inside it. When an element is added, it is placed into the array. If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed.

### LinkedList

The LinkedList stores its items in "containers." The list has a link to the first container and each container has a link to the next container in the list. To add an element to the list, the element is placed into a new container and that container is linked to one of the other containers in the list.

```java
// Import the LinkedList class
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
  }
}
```

One possible implementation of LinkedList can be the following:

```java
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
   
    Node head; // head of list 
   
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
   
        int data; 
        Node next; 
   
        // Constructor 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
   
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node new_node = new Node(data); 
         
   
        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null) { 
            list.head = new_node; 
        } 
        else { 
            // Else traverse till the last node 
            // and insert the new_node there 
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
   
            // Insert the new_node at last node 
            last.next = new_node; 
        } 
   
        // Return the list by head 
        return list; 
    } 
```



## Problem Assistance




## External