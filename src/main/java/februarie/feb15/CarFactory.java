package februarie.feb15;

public class CarFactory {
    public static void main(String[] args) {

        Vehicle mySecondCar = new Car();

    }
}

class Vehicle{
   public int fuel;

}

class Car extends Vehicle{

    void fillTheTank(int fuel){
        this.fuel = fuel;

    }
}

class Bus extends Vehicle{

}