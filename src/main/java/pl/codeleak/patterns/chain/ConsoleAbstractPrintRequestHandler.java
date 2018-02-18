package pl.codeleak.patterns.chain;

/**
 * Handles {@link PrintDestination#Console} request by printing the message to the console
 */
class ConsoleAbstractPrintRequestHandler extends AbstractPrintRequestHandler {

    ConsoleAbstractPrintRequestHandler(AbstractPrintRequestHandler abstractPrintRequestHandler) {
        super(abstractPrintRequestHandler);
    }

    @Override
    public void handleRequest(PrintRequest printRequest) {
        // TODO If request is to be processed - process. Otherwise call next handler in the chain
        if (isEligibleForConsolePrinting(printRequest)) {
            System.out.println("ConsolePrintRequestHandler.handleRequest: " + printRequest.getMessage());
        } else {
            super.handleRequest(printRequest);
        }
    }

    private boolean isEligibleForConsolePrinting(PrintRequest printRequest) {
        // TODO Implement
        return true;
    }
}
