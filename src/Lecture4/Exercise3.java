package Lecture4;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter unit price: ");
        double unitPrice = scanner.nextDouble();

        System.out.println("Enter quantity: ");
        int quantity = scanner.nextInt();

        double revenue = calculateRevenue(unitPrice, quantity);

        double discount = calculateDiscount(unitPrice, quantity, revenue);

        System.out.println("Revenue from sales: $" + revenue);
        System.out.println("Dsicount: $" + discount + "(" + calculateDiscountPercentage(quantity) + "%");

        scanner.close();
    }

    private static double calculateRevenue(double unitPrice, int quantity) {
        return unitPrice * quantity;
    }

    private static double calculateDiscount(double unitPrice, int quantity, double revenue) {
        double discountPercentage = calculateDiscountPercentage(quantity);
        return (discountPercentage / 100) * revenue;
    }

    private static double calculateDiscountPercentage(int quantity) {
        if (quantity < 100) {
            return 0.0;
        } else if (quantity >= 100 && quantity <= 120) {
            return 15.0;
        } else {
            return 20.0;
        }
    }
}
