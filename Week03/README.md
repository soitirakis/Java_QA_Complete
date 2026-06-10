# Week 03 — Java OOP I

First look at object-oriented design — building classes with fields, constructors, getters/setters, and encapsulation across three independent exercises.

## Topics Covered

- Classes, fields, and constructors
- Getters and setters
- Encapsulation and access control
- Object instantiation and method calls
- Composing objects (a `Book` that holds an `Author` reference)
- Boundary enforcement in methods (max speed, brightness limits)

## Contents

| File / Folder | Description |
| ------------- | ----------- |
| `src/Author/Author.java` | Author class with `name` and `email` fields |
| `src/Author/Book.java` | Book class with title, year, price, and an `Author` reference |
| `src/Author/Main.java` | Demo: create Author and Book instances and print their details |
| `src/Car/Car.java` | Car class with speed, direction, and start/stop behaviour (max speed 100) |
| `src/Car/Main.java` | Demo: test acceleration and turning on a Car instance |
| `src/Light/Light.java` | Light class with a `float` status representing brightness (0 = off, 1 = full) |
| `src/Light/Main.java` | Demo: turn a Light on, off, dim, and brighten |

## Exercises

1. Create `Author` and `Book` classes with appropriate fields, constructors, and accessor methods. Instantiate objects and print their details. Expected output: `"Book <name> <price> RON by <author> published in <year>."`
2. Implement a `Light` class with `turnOn()`, `turnOff()`, `dim()`, and `brighten()` behaviours that enforce boundary values (status must stay between 0 and 1).
3. Implement a `Car` class with `accelerate()`, `start()`, `stop()`, `turnLeft()`, and `turnRight()` behaviours, enforcing a maximum speed of 100.

## How to Run

```bash
# Author / Book exercise
javac src/Author/*.java
java -cp src Author.Main

# Car exercise
javac src/Car/*.java
java -cp src Car.Main

# Light exercise
javac src/Light/*.java
java -cp src Light.Main
```

---

[← Week02](../Week02) | [Back to root](../README.md) | [Week04 →](../Week04)
