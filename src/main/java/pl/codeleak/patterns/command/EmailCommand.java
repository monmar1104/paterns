package pl.codeleak.patterns.command;

public class EmailCommand implements OfficeCommand {

    private String email;
    private String message;

    public EmailCommand(String email, String message) {
        this.email = email;
        this.message = message;
    }

    @Override
    public void execute(OfficeManagement target) {
        target.email(email, message);
    }
}
