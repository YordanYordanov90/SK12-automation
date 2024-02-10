package Lecture4;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        String adviseBulgaria = "Advisable destination:Bulgaria";
        String adviseOoutside = "Advisable destination:Outside Bulgaria";

        System.out.println("Please enter destination here: (Beach || Mountain): ");
        Scanner scanner = new Scanner(System.in);
        String typeOfVacation = scanner.nextLine();

        System.out.println("Please enter number of days: ");
        int days = scanner.nextInt();

        System.out.println("Please enter number of people: ");
        int numberOfPeople = scanner.nextInt();

        System.out.println("Please enter budget: ");
        double budget = scanner.nextInt();

        double dailyBudget = budget /(days * numberOfPeople);

        switch (typeOfVacation){
            case "Beach":
                if (dailyBudget < 50){
                    System.out.println(adviseBulgaria);
                }else {
                    System.out.println(adviseOoutside);
                }
                break;
            case "Mountain":
                if (dailyBudget < 30){
                    System.out.println(adviseBulgaria);
                }else {
                    System.out.println(adviseOoutside);
                }
                break;
            default:
                System.out.println("No information about the type of vacation:" + typeOfVacation);
        }
    }
}
