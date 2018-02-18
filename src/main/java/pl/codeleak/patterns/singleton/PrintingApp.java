package pl.codeleak.patterns.singleton;

class PrintingApp {

    public static void main(String[] args) {

        PrintHouse printHouse = new PrintHouse();

        printHouse.print("Text to print 1");
        printHouse.print("Text to print 2");
        printHouse.print("Text to print 3");
        printHouse.print("Text to print 4");
        printHouse.print("Text to print 5");
    }
}

