package pl.codeleak.patterns.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// TODO Extend from PostPublisher, implement algorithm steps
class FacebookPostPublisher extends PostPublisher {

    private static final Logger LOGGER = LoggerFactory.getLogger(FacebookPostPublisher.class);

    @Override
    boolean logIn() {
        LOGGER.info("logging in Facebook..");
        return true;
    }

    @Override
    void doPostIt(Post post) {
        LOGGER.info("posting to Facebook");
    }

    @Override
    void logOut() {
        LOGGER.info("Logout from Facebook..");
    }
}
