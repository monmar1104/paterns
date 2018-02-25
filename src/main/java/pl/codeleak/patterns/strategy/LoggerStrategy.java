package pl.codeleak.patterns.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerStrategy implements PrintingStrategy {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerStrategy.class);

    @Override
    public void print(String value) {
        LOGGER.info(value);
    }
}
