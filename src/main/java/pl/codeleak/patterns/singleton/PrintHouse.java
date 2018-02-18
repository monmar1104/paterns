package pl.codeleak.patterns.singleton;

class PrintHouse {
    void print(String message) {
        // TODO Make sure only single Printer instance exists and it is used in print house
        Printer.getInstance().print(message);
    }
}
