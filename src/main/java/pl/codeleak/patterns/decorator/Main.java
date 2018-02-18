package pl.codeleak.patterns.decorator;

public class Main {

    public static void main(String[] args) {
        //normal car
        Car myCar = new NormalCar();
        runCar(myCar);

        //now superb car!
        myCar = new SuperbCar();
        runCar(myCar);
    }

    private static void runCar(Car car) {
        car.powerOn();
        car.drive();
    }
}
