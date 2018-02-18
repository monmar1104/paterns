package pl.codeleak.patterns.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// TODO Make this class a Template (should be abstract, no constructor argument is needed anymore)
abstract class PostPublisher {

    private static final Logger LOG = LoggerFactory.getLogger(PostPublisher.class);

    // Template method (do not change)
    void postIt(Post post) {
        // Algorithm steps
        if (logIn()) {
            doPostIt(post);
            logOut();
        }
    }

    abstract boolean logIn();

    abstract void doPostIt(Post post);

    abstract void logOut();
}

