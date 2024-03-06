# Lecture 1

## Java

### Package

A package in Java is used to group related classes, it is managed by directory.

1. Java has some built-in packages and multiple packages together forms a **library**. 

Function > Class > Package > Library / Application

```java
import package.name.Class;   // Import a single class
import package.name.*;   // Import the whole package
```

We have a Animal Package
```
Animal
    |__ Cat.java
    |__ Dog.java
    |__ Greetings.java
Main.java
```



### Class Modifiers

There're 2 groups of modifiers

1. **Access Modifiers** - controls the access level
2. **Non-Access Modifiers** - do not control access level, but provides other functionality

```java
public class Main
```

For a class

| Modifier   | Description                                                  |
| ---------- | ------------------------------------------------------------ |
| default    | The class is only accessible by classes in the same package. |
| **public** | The class is accessible by any other class                   |

For Attributes


e.g
```java

class Dog {
    
    private int weight = 10;

    int getWeightKG() {
        return weight;
    }

    int getWeightG() {
        return weight * 100;
    }
}

Dog dog;

// 10
System.out.println(dog.weight)
System.out.println(dog.getWeightKG())
System.out.println(dog.getWeightG())


```
---

TODO: What are other modifiers?


### [Architecture of Java](https://docs.oracle.com/javase/tutorial/getStarted/intro/definition.html)

![jdk_jre_jvm](./assets/JDK.png)

## Problem Assistance

### if_else branching
1. and: `&&`
    > equal to multiplication
1. or: `||`
    > equal to addition

```java
...
if ((a % 3 == 0 && a >= 53) || (a % 2 != 0 && a < 12)) {
    ...
    // Special case
} else {
    // Not special case
}
...
```

### Arithmetics


## External


### [WSL](https://learn.microsoft.com/en-us/windows/wsl/install)

Windows Subsystem for Linux (WSL) is a feature of Windows that allows you to run a Linux environment on your Windows machine, without the need for a separate virtual machine or dual booting. WSL is designed to provide a seamless and productive experience for developers who want to use both Windows and Linux at the same time.

### Shell_Kernel

![shell_kernel](./assets/LinuxShell-1118x1054.png)

Powershell

### [Git](https://git-scm.com)

Git is a free and open source distributed version control system designed to handle everything from small to very large projects with speed and efficiency.

### GitHub

Github 

![github_flow](./assets/git_arch.png)

