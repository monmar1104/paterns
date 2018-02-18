package pl.codeleak.patterns.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// TODO Extend from PostPublisher, implement algorithm steps
class InstagramPostPublisher extends PostPublisher {

    private static final Logger LOGGER = LoggerFactory.getLogger(InstagramPostPublisher.class);

    @Override
    boolean logIn() {
        LOGGER.info("logging in Instagram..");
        return true;
    }

    @Override
    void doPostIt(Post post) {
        LOGGER.info("posting to Instagram");
    }

    @Override
    void logOut() {
        LOGGER.info("Logout from Instagram..");
    }
}
