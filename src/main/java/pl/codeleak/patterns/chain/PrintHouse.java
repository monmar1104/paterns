package pl.codeleak.patterns.chain;

class PrintHouse {

    private final PrintRequestHandler chain;

    PrintHouse(PrintRequestHandler chain) {
        this.chain = chain;
    }

    void makeRequest(PrintRequest printRequest) {
        chain.handleRequest(printRequest);
    }
}
