package pl.codeleak.patterns.observer;

class PrinterObserverApp {

    public static void main(String[] args) {
        Printer printer = new Printer();

        PrinterObserver firstObserver = new FirstObserver();
        PrinterObserver secondObserver = new SecondObserver();
        PrinterObserver thirdObserver = new ThirdObserver();

        printer.addObserver(firstObserver);
        printer.addObserver(secondObserver);

        printer.print("Message 1");
        printer.print("Message 2");

        printer.addObserver(thirdObserver);

        printer.print("Message 3");
        printer.print("Message 4");
        printer.print("Message 5");
    }
}


