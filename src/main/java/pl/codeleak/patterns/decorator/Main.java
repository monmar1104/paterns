package pl.codeleak.patterns.decorator;

public class Main {

    public static void main(String[] args) {
        //normal car
        Car normalCar = new NormalCar();
        Car myCar = new PrivateCarDecorator(normalCar);
        runCar(myCar);

        //now superb car!
        Car superbCar = new SuperbCar();
        myCar = new CompanyCarDecorator(superbCar);
        runCar(myCar);

        myCar = new PrivateCarDecorator(superbCar);
        runCar(myCar);
    }

    private static void runCar(Car car) {
        car.powerOn();
        car.drive();
    }
}
