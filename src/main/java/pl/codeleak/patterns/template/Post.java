package pl.codeleak.patterns.template;

final class Post {

    private String message = "Some message";

    public Post(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
