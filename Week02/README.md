# Week 02 — Java Methods

Introduction to writing and calling static methods in Java — loops, accumulation patterns, and a simple CLI calculator.

## Topics Covered

- Defining and calling static methods
- `for` loops and accumulation patterns
- Command-line argument parsing with `args[]`
- Basic arithmetic and formatted console output
- Division-by-zero handling

## Contents

| File | Description |
| ---- | ----------- |
| `src/Hello.java` | Introduction to variables, loops, and console output |
| `src/Week2.java` | Calculates the sum of the first 1000 positive integers |
| `src/Calculator.java` | CLI calculator — accepts two numbers and an operator as arguments |
| `src/Tema2.java` | Homework solution: methods to draw shapes and count February days |

## Exercises

1. Write a method that prints a filled rectangle of `*` characters.
2. Write a method `drawShapeOutline()` that prints only the border of the rectangle.
3. Write a method `drawShapeCorners()` that prints only the four corner asterisks.
4. Write a method that displays the number of days in February for each year in a given range, accounting for leap years.

## How to Run

```bash
javac src/Tema2.java
java -cp src Tema2
```

To run the calculator:

```bash
javac src/Calculator.java
java -cp src Calculator 10 + 5
```

---

[← Week01](../Week01) | [Back to root](../README.md) | [Week03 →](../Week03)
