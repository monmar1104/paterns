package pl.codeleak.patterns.template;

public class PostPublisherApp {

    public static void main(String[] args) {
        Post post = new Post("Post message");

        // TODO Refactor so that FacebookPostPublisher can be used here
        PostPublisher facebookPostPublisher = new FacebookPostPublisher();
        facebookPostPublisher.postIt(post);

        // TODO Refactor so that InstagramPostPublisher can be used here
        PostPublisher instagramPostPublisher = new InstagramPostPublisher();
        instagramPostPublisher.postIt(post);


    }
}
