package pl.codeleak.patterns.decorator;

public abstract class CarDecorator implements Car {

    protected Car decoratedCar;

    public CarDecorator(Car decoratedCar) {
        this.decoratedCar = decoratedCar;
    }

    public void powerOn() {
        decoratedCar.powerOn();
    }

    public void drive() {
        decoratedCar.drive();
    }

    public int getMaxSpeed() {
        return decoratedCar.getMaxSpeed();
    }
}
