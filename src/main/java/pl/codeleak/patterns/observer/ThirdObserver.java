package pl.codeleak.patterns.observer;

public class ThirdObserver implements PrinterObserver {
    @Override
    public void messagePrinted(String message, int currentPrintCount) {
        System.out.println("=======================================");
        System.out.println("I'm a THIRD Observer");
        System.out.println("Printer has print new message: " + message);
        System.out.println("Current print count = " + currentPrintCount);
        System.out.println("=======================================");
    }
}
