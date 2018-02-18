package pl.codeleak.patterns.strategy;

class PrintingApp {

    public static void main(String[] args) {

        // TODO Create different printing strategies (e.g. logger, console, file)

        PrintHouse printHouse = new PrintHouse(null);
        printHouse.print("Test using logging printing strategy");

        printHouse.setStrategy(null);
        printHouse.print("Test using console printing strategy");

        printHouse.setStrategy(null);
        printHouse.print("Test using file printing strategy");
    }
}


