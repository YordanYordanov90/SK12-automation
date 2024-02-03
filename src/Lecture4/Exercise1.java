package Lecture4;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter digit (1-7): ");
        int userDigit = scanner.nextInt();

        switch (userDigit) {
            case 1:
                System.out.println("The " + userDigit + "-st day of the week is Monday");
                break;
            case 2:
                System.out.println("The " + userDigit + "-nd day of the week is Tuesday");
                break;
            case 3:
                System.out.println("The " + userDigit + "-rd day of the week is Wednesday");
                break;
            case 4:
                System.out.println("The " + userDigit + "-th day of the week is Thursday");
                break;
            case 5:
                System.out.println("The " + userDigit + "-th day of the week is Friday");
                break;
            case 6:
                System.out.println("The " + userDigit + "-th day of the week is Saturday");
                break;
            case 7:
                System.out.println("The " + userDigit + "-th day of the week is Sunday");
                break;
            default:
                System.out.println("Invalid input. Please enter a digit between 1 and 7.");
        }
        scanner.close();
    }
}
