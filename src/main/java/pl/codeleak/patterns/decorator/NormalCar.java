package pl.codeleak.patterns.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NormalCar implements Car {

    private static final Logger LOGGER = LoggerFactory.getLogger(NormalCar.class);

    @Override
    public void powerOn() {
        LOGGER.info("Normal car engine is starting..");
    }

    @Override
    public void drive() {
        LOGGER.info("Normal car is driving normally");
    }

    @Override
    public int getMaxSpeed() {
        return 100;
    }
}
