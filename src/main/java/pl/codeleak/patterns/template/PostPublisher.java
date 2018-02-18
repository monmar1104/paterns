package pl.codeleak.patterns.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// TODO Make this class a Template (should be abstract, no constructor argument is needed anymore)
class PostPublisher {

    private static final Logger LOG = LoggerFactory.getLogger(PostPublisher.class);

    private final String where;

    PostPublisher(String where) {
        this.where = where;
    }

    private boolean isFacebook() {
        return where.equals("Facebook");
    }

    private boolean isInstagram() {
        return where.equals("Instagram");
    }

    // Template method (do not change)
    void postIt(Post post) {
        // Algorithm steps
        if (logIn()) {
            doPostIt(post);
            logOut();
        }
    }

    boolean logIn() {

        // TODO Facebook login logic goes to FacebookPostPublisher
        if (isFacebook()) {
            // Facebook logging-in
            LOG.info("Logging in Facebook ...");
            return true;
        }

        // TODO Instagram login logic goes to InstagramPostPublisher
        if (isInstagram()) {
            LOG.info("Logging in Instagram ...");
            return true;
        }

        return false;
    }

    void doPostIt(Post post) {
        // TODO Posting logic goes to FacebookPostPublisher
        if (isFacebook()) {
            // Facebook logging-in
            LOG.info("Posting in Facebook ...");
        }

        // TODO Posting logic goes to InstagramPostPublisher
        if (isInstagram()) {
            LOG.info("Posting in Instagram ...");
        }
    }



    void logOut() {
        // TODO Facebook logout logic goes to FacebookPostPublisher
        if (isFacebook()) {
            // Facebook logging-in
            LOG.info("Logging in Facebook ...");
        }

        // TODO Instagram logout logic goes to InstagramPostPublisher
        if (isInstagram()) {
            LOG.info("Logging in Instagram ...");
        }
    }

}

