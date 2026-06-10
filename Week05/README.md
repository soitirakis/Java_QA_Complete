# Week 05 — Collections, Exceptions, and Unit Testing

Working with Java collections (arrays, ArrayList, HashSet, HashMap), throwing and catching exceptions, and writing unit tests with JUnit 4.

## Topics Covered

- Arrays, `ArrayList`, `HashSet`, and `HashMap`
- Iterating collections with enhanced for-each loops
- Custom `enum` types
- Throwing `IllegalArgumentException` and using try/catch
- JUnit 4 unit tests (`@Test`, `@Before`)
- Modelling domain data with `Map<Enum, List<T>>`

## Contents

| File / Folder | Description |
| ------------- | ----------- |
| `src/main/java/org/example/arrays/Arrays.java` | Demonstrates arrays, `HashSet`, and `HashMap` with a custom `Browser` enum |
| `src/main/java/org/example/exercitii/Exercitii.java` | Utility with `Calculate()` to sum an integer array |
| `src/main/java/org/example/exercitii/Exceptions.java` | `circleArea()` that throws `IllegalArgumentException` for a negative radius |
| `src/main/java/org/example/exercitii/Main.java` | Exercises `Calculate()` and `getMax()` on integer arrays |
| `src/main/java/org/example/faculty/Faculty.java` | Faculty class managing students grouped by a `Specialization` enum |
| `src/main/java/org/example/faculty/Student.java` | Student record with name, ID, and specialization |
| `src/main/java/org/example/faculty/Main.java` | Demo: add students to a faculty and exercise print/remove methods |

## Exercises

1. Implement a `Calculate()` method that sums the elements of an integer array.
2. Write a `circleArea()` method that throws `IllegalArgumentException` when the radius is negative.
3. Model a `Faculty` as a `Map<Specialization, List<Student>>` supporting add, print by specialization, print by ID, remove, and list-all operations. Use the `Specialization` enum: `INFORMATICS`, `MATHEMATICS`, `BIOLOGY`, `CHEMISTRY`.

## How to Run

```bash
mvn test
```

---

[← Week04](../Week04) | [Back to root](../README.md) | [Week06 →](../Week06)
