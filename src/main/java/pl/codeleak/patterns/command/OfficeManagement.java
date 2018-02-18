package pl.codeleak.patterns.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class OfficeManagement {

    private static final Logger LOG = LoggerFactory.getLogger(OfficeManagement.class);

    void print(String message) {
        LOG.info("Printing: {}", message);
    }

    void fax(String number, String message) {
        LOG.info("Sending fax: {} to: {}", number, message);
    }

    void email(String email, String message) {
        LOG.info("Sending email: {} to: {}", email, message);
    }
}
