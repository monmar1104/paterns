package pl.codeleak.patterns.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SuperbCar implements Car {

    private static final Logger LOGGER = LoggerFactory.getLogger(SuperbCar.class);

    @Override
    public void powerOn() {
        LOGGER.info("Superb car engine is starting.. wrr wrr wrrr");
    }

    @Override
    public void drive() {
        LOGGER.info("Superb car is driving insanely!");
    }

    @Override
    public int getMaxSpeed() {
        return 150;
    }
}
