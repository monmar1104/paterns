package pl.codeleak.patterns.decorator;

public class PrivateCarDecorator extends CarDecorator {
    public PrivateCarDecorator(Car decoratedCar) {
        super(decoratedCar);
        printDescription();
    }

    private void printDescription() {
        System.out.println("I'm private car!");
    }
}
