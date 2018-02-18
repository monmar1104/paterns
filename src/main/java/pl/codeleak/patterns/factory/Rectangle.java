package pl.codeleak.patterns.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Rectangle implements Shape {

    private static final Logger LOG = LoggerFactory.getLogger(Rectangle.class);

    @Override
    public void draw(Point location) {
        LOG.info("Printing rectangle at " + location);
    }
}
