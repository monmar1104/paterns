package pl.codeleak.patterns.decorator;

public class CompanyCarDecorator extends CarDecorator {
    public CompanyCarDecorator(Car decoratedCar) {
        super(decoratedCar);
        printDescription();
    }

    private void printDescription() {
        System.out.println("I'm company car!");
    }
}
