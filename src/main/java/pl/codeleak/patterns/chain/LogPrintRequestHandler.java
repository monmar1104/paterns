package pl.codeleak.patterns.chain;

class LogPrintRequestHandler extends AbstractPrintRequestHandler {

    LogPrintRequestHandler(AbstractPrintRequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(PrintRequest printRequest) {
        // TODO Implement
    }
}
