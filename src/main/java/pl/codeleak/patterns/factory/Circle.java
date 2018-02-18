package pl.codeleak.patterns.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Circle implements Shape {

    private static final Logger LOG = LoggerFactory.getLogger(Circle.class);

    @Override
    public void draw(Point location) {
        LOG.info("Printing circle at " + location);
    }
}
