package Lecture4;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age here: ");
        int age = scanner.nextInt();

        if (age >= 18 ) {
            System.out.println("You are eligible to work!");
        } else {
            System.out.println("You are not eligible to work");
        }

    }
}
