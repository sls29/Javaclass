package februarie.feb13;

public class Factory {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.color = "blue";
        car1.numberOfSeats = 5;
        car1.model = "Tesla";

        System.out.println("Car color is " + car1.color);
        car1.startEngine();

    }


}
