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

System.out.println(dog.weight)
System.out.println(dog.getWeightKG())
System.out.println(dog.getWeightG())
```

TODO: What are other modifiers?


### [Architecture of Java](https://docs.oracle.com/javase/tutorial/getStarted/intro/definition.html)

![jdk_jre_jvm](./assets/JDK.png)

1. JDK: Java Development Kit
2. JRE: Java Runtime Environment
3. JVM: Java Virtual Machine


Architecture Layer

* JAVA -> JVM -> MAC/PC

* C++ -> MAC/PC

JAVA -> bytecodes (only JVM understands) -> 01 (Computer understands)
C++ -> 01


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
} else if (a >= 4) {
    // Not special case
} else if (a % 2 == 0) {

}
...
```


### Switch

Switch can be a replacement for if-else in some programming languages. The difference is that without the keyword `break`, all branches that are compatible will be run, which is not the case for if-else.

```java
switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
}
```


```java
switch (a) {
    case a % 3 == 0 && a >= 53:
        system.out.println(a);
        break;
    case a % 2 != 0:
        system.out.println(a);
        break;
    default:
        .....  
}
```


### Arithmetics


## External


### [WSL](https://learn.microsoft.com/en-us/windows/wsl/install)

Windows Subsystem for Linux (WSL) is a feature of Windows that allows you to run a Linux environment on your Windows machine, without the need for a separate virtual machine or dual booting. WSL is designed to provide a seamless and productive experience for developers who want to use both Windows and Linux at the same time.


### Common commands

```bash
# update all the libraries
apt update
```

### Shell_Kernel

GUI: Graphical User Interface

CLI: Command Line Interface

![shell_kernel](./assets/LinuxShell-1118x1054.png)

Powershell

### [Git](https://git-scm.com)

Git is a free and open source distributed version control system designed to handle everything from small to very large projects with speed and efficiency.

#### Common Commands

1. Create a git directory

```bash
# . means current directory
git init .
```

2. Add the link current git directory to a remote repository.

```bash
git remote add <repo-name> <repo-url> 
```

3. Add current changes to Stage (record the current changes)

```bash
git add <file-name>

# add all changes in the current directory
git add .

# add all changes.
git add -A
```

4. Save all the changes to local repo

```bash
git commit
```

5. Push the current repo to remote


```bash
git push
```


![how_git_works](./assets/how_git_works.jpg)


### GitHub

Github 

![github_flow](./assets/git_arch.png)


#### Common Actions

1. Fork: To get a self-owned duplication of the current repository
2. Pull Request: A request to merge the new updates into the codebase