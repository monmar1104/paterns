package pl.codeleak.patterns.strategy;

class PrintHouse {

    private PrintingStrategy printingStrategy; // strategy

    PrintHouse(PrintingStrategy printingStrategy) {
        this.printingStrategy = printingStrategy;
    }

    void setStrategy(PrintingStrategy newStrategy) {
        this.printingStrategy = newStrategy;
    }

    void print(String value) {
        printingStrategy.print(value);
    }
}
