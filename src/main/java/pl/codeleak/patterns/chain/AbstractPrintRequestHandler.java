package pl.codeleak.patterns.chain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

abstract class AbstractPrintRequestHandler implements PrintRequestHandler {

    private static final Logger LOG = LoggerFactory.getLogger(AbstractPrintRequestHandler.class);

    private final AbstractPrintRequestHandler next;

    AbstractPrintRequestHandler(AbstractPrintRequestHandler next) {
        this.next = next;
    }

    @Override
    public void handleRequest(PrintRequest printRequest) {
        if (next != null) {
            LOG.info("Handling request with next handler");
            next.handleRequest(printRequest);
        }
    }
}

