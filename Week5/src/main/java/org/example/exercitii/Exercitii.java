package org.example.exercitii;

public class Exercitii {
    //Write a method that calcultates the sum of all elements in an integer.

    public static int Calculate(int [] numbers){
        int sum = 0;
        for (int n : numbers) {
            sum +=n;
        }
        return sum;
    }

}
