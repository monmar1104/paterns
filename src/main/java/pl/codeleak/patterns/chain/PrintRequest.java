package pl.codeleak.patterns.chain;

class PrintRequest {

    private PrintDestination printDestination;
    private String message;

    PrintRequest(PrintDestination printDestination, String message) {
        this.printDestination = printDestination;
        this.message = message;
    }

    PrintDestination getPrintDestination() {
        return printDestination;
    }

    void setPrintDestination(PrintDestination printDestination) {
        this.printDestination = printDestination;
    }

    String getMessage() {
        return message;
    }

    void setMessage(String message) {
        this.message = message;
    }
}
