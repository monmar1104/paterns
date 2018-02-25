package pl.codeleak.patterns.strategy;

class PrintingApp {

    public static void main(String[] args) {
        // TODO stworzyć różne strategie wypisania (np. logger, console)

        PrintHouse printHouse = new PrintHouse(null);
        printHouse.print("Test using logging printing strategy");

        printHouse.setStrategy(null);
        printHouse.print("Test using console printing strategy");
    }
}


