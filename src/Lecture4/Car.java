package Lecture4;

public class Car {

    public String name ;
   public  String color = "N/A";
    public int releaseYear = -1;
    public int horsePower = -1;
   public boolean secondHand = false;

    public Car(String name, String color, int releaseYear, int horsePower, boolean secondHand) {

       this.name = name;
       this.color = color;
       this.releaseYear = releaseYear;
       this.horsePower = horsePower;
       this.secondHand = secondHand;

    }

    public Car(String name, String color, boolean secondHand){

        this.name = name;
        this.color = color;
        this.secondHand = secondHand;

    }

    public Car(String name, String color, int releaseYear, int horsePower){

        this.name = name;
        this.color = color;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;

    }

    public Car(String name, int releaseYear, int horsePower, boolean secondHand) {
        this(name,"N/A", releaseYear, horsePower, secondHand);
    }

    public Car(){

    }


}

