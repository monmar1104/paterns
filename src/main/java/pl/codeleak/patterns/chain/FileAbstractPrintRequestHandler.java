package pl.codeleak.patterns.chain;

class FileAbstractPrintRequestHandler extends AbstractPrintRequestHandler {

    FileAbstractPrintRequestHandler(AbstractPrintRequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(PrintRequest printRequest) {
        // TODO Implement
    }
}
