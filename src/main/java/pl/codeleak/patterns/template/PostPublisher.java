package pl.codeleak.patterns.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// TODO klasa niech zotanie szablonem (powinna być abstrakcyjna)
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

    // szablonowa metoda, powinna zostać w takiej formie
    void postIt(Post post) {
        if (logIn()) {
            doPostIt(post);
            logOut();
        }
    }

    //poniższe metody powinny być abstrakcyjne, a ich implementacja przeniesiona do odpowiednich klas
    boolean logIn() {
        if (isFacebook()) {
            // Facebook logging-in
            LOG.info("Logging in Facebook ...");
            return true;
        }

        if (isInstagram()) {
            LOG.info("Logging in Instagram ...");
            return true;
        }

        return false;
    }

    void doPostIt(Post post) {
        if (isFacebook()) {
            // Facebook logging-in
            LOG.info("Posting in Facebook ...");
        }

        if (isInstagram()) {
            LOG.info("Posting in Instagram ...");
        }
    }

    void logOut() {
        if (isFacebook()) {
            // Facebook logging-in
            LOG.info("Logging in Facebook ...");
        }

        if (isInstagram()) {
            LOG.info("Logging in Instagram ...");
        }
    }
}

