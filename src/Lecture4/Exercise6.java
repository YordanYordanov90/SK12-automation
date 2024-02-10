package Lecture4;

public class Exercise6 {
    public static int findSmallestNumber(int num1, int num2, int num3) {
        int smallest = (num1 > num2) ? (num1 < num3 ? num1 : num3) : (num2 <num3 ? num2 : num3);
        return smallest;
    }

    public static void main(String[] args) {
        int result = findSmallestNumber(15,20,4);
        System.out.println("The smallest number is: " + result);
    }
}
