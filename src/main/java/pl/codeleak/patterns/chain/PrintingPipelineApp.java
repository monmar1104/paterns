package pl.codeleak.patterns.chain;

class PrintingPipelineApp {

    public static void main(String[] args) {

        // TODO Implement CoR for this PrintHouse
        // TODO Create chain (add request handlers and create chain)
        PrintRequestHandler chain = new ConsoleAbstractPrintRequestHandler(null);

        PrintHouse printHouse = new PrintHouse(chain);

        printHouse.makeRequest(new PrintRequest(PrintDestination.Console, "Message 1"));
        printHouse.makeRequest(new PrintRequest(PrintDestination.File, "Message 2"));
        printHouse.makeRequest(new PrintRequest(PrintDestination.Log, "Message 3"));
        printHouse.makeRequest(new PrintRequest(PrintDestination.Console, "Message 4"));
        printHouse.makeRequest(new PrintRequest(PrintDestination.Log, "Message 5"));
    }
}


