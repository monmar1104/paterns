package pl.codeleak.patterns.command;

public class FaxCommand implements OfficeCommand {
    private String number;
    private String message;

    public FaxCommand(String number, String message) {
        this.number = number;
        this.message = message;
    }

    @Override
    public void execute(OfficeManagement target) {
        target.fax(number, message);
    }
}
