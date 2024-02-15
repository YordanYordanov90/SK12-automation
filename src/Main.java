import Lecture4.Car;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Ford", "Red", 2015, 100, true);
        Car car2 = new Car("N/A", "Blue", -1, -1, true);
        Car car3 = new Car("BMW", "Black", 2010, 200);
        Car car4 = new Car("Opel", "N/A", 2017,125, false);
        Car car5 = new Car();


        System.out.println(car1.name);
        System.out.println(car2.color);
    }
}