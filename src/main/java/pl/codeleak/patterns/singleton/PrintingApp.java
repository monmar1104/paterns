package pl.codeleak.patterns.singleton;

class PrintingApp {

    public static void main(String[] args) {
        //TODO
        //przerobić program tak, aby korzystał z klasy Printer jako singleton (sumował wystąpienia w polu 'count')

        PrintHouse printHouse = new PrintHouse();

        printHouse.print("Text to print 1");
        printHouse.print("Text to print 2");
        printHouse.print("Text to print 3");
        printHouse.print("Text to print 4");
        printHouse.print("Text to print 5");
    }
}

