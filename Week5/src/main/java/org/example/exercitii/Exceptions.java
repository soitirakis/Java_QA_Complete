package org.example.exercitii;

public class Exceptions {
    public static void main(String[] args) {
        System.out.println(circleArea(-5));
    }

    public static double circleArea(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("radius cannot be negative");
        }
        return Math.PI * radius * radius;
    }
}
