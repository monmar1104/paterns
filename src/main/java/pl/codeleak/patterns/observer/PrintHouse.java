package pl.codeleak.patterns.observer;

class PrintHouse {

    private Printer printer;

    public PrintHouse(Printer printer) {
        this.printer = printer;
    }

    void print(String value) {
        printer.print(value);
    }
}
