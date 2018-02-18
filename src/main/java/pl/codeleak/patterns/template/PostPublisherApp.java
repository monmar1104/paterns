package pl.codeleak.patterns.template;

public class PostPublisherApp {

    public static void main(String[] args) {

        // TODO Refactor so that FacebookPostPublisher can be used here
        PostPublisher facebookPostPublisher = new PostPublisher("Facebook");
        facebookPostPublisher.postIt(new Post());

        // TODO Refactor so that InstagramPostPublisher can be used here
        PostPublisher instagramPostPublisher = new PostPublisher("Instagram");
        instagramPostPublisher.postIt(new Post());


    }
}
