package pl.codeleak.patterns.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Triangle implements Shape {

    private static final Logger LOG = LoggerFactory.getLogger(Triangle.class);

    @Override
    public void draw(Point location) {
        LOG.info("Printing triangle at " + location);
    }
}
