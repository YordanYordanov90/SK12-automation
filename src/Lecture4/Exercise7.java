package Lecture4;

public class Exercise7 {
    public static double findAverageNumber(double num1, double num2, double num3){
        double average = (num1 + num2 + num3) / 3.0;
        return average;
    }

    public static void main(String[] args) {
        double result = findAverageNumber(3.5,4.5,5.6);
        System.out.println("The average is: " + result);
    }
}
