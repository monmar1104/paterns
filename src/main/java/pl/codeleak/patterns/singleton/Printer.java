package pl.codeleak.patterns.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Printer {

    private static final Logger LOG = LoggerFactory.getLogger(Printer.class);

    private int printCount;

    void print(String message) {
        LOG.info("Printed: {}, Count: {}", message, ++this.printCount);
    }
}
