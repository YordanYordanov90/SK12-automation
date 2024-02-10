package Lecture4;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 6, 10, 20};

        int sum = calculateSum(numbers);

        System.out.println("The sum of the array is: " + sum);
    }

    private static int calculateSum(int[]  arr) {
        int sum = 0;

        for (int num : arr ) {
            sum+= num;
        }
        return sum;
    }
}
