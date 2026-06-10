# Week 04 — Java OOP II

Extending classes with inheritance, calling parent constructors with `super`, and implementing multiple interfaces in the same class.

## Topics Covered

- Inheritance and class hierarchies
- Method overriding with `@Override`
- The `super` keyword for parent constructors and method calls
- Abstract methods and concrete interface implementations
- Default and static interface methods
- Polymorphism through a common base type

## Contents

| File / Folder | Description |
| ------------- | ----------- |
| `src/Person/Person.java` | Base class with `name` and `age` fields and `displayDetails()` |
| `src/Person/Student.java` | Extends `Person`; adds `school`, overrides `displayDetails()` |
| `src/Person/Teacher.java` | Extends `Person`; adds `school` and `catedra`, overrides `displayDetails()` |
| `src/Person/Main.java` | Demo: polymorphic calls on Person, Student, and Teacher instances |
| `src/Super/Parent.java` | Parent class demonstrating parameterised constructor |
| `src/Super/Child.java` | Extends `Parent` using `super()` to chain constructors |
| `src/Interfaces/Movable.java` | Interface: abstract `move()`, default `rest()`, static `showMovementInfo()` |
| `src/Interfaces/Soundable.java` | Interface: abstract `makeSound()` and `sleep()` |
| `src/Interfaces/Bird.java` | Implements both `Movable` and `Soundable` |
| `src/Interfaces/Main.java` | Demo: create a Bird and exercise all interface methods |

## Exercises

1. Create a `Person` base class and extend it with `Student` and `Teacher` subclasses, each overriding `displayDetails()` to include their additional fields.
2. Demonstrate the `super` keyword by building a `Parent`/`Child` pair where the child chains to the parent constructor and overrides `displayInfo()`.
3. Define `Movable` and `Soundable` interfaces, then implement both in a single `Bird` class and call all interface methods.

## How to Run

```bash
# Inheritance (Person hierarchy)
javac src/Person/*.java
java -cp src Person.Main

# super keyword
javac src/Super/*.java
java -cp src Super.Main

# Interfaces
javac src/Interfaces/*.java
java -cp src Interfaces.Main
```

---

[← Week03](../Week03) | [Back to root](../README.md) | [Week05 →](../Week05)
