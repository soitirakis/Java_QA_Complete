package org.example.exercitii;

public class Main {
    public static void main(String[] args) {
        int [] numbers = {2 ,3 ,4};
        int total = Calculate(numbers);
        System.out.println("Sum: " + total);

        //max of an array
        int [] maxNumbers = {3 ,4, 1, 9, 0, 11, 5};
        int max = getMax(maxNumbers);
        System.out.println("Max: " + max);
    }


    //sum of an array
    public static int Calculate(int[] numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }

    //max int from an array
    public static int getMax(int[] numbers) {
        int max = 0;
        for (int n : numbers) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }
}
