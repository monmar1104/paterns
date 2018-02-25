package pl.codeleak.patterns.observer;

public class SecondObserver implements PrinterObserver {
    @Override
    public void messagePrinted(String message, int currentPrintCount) {
        System.out.println("=======================================");
        System.out.println("I'm a SECOND Observer");
        System.out.println("Printer has print new message: " + message);
        System.out.println("Current print count = " + currentPrintCount);
        System.out.println("=======================================");
    }
}
