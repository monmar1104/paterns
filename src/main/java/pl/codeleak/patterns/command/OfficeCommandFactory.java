package pl.codeleak.patterns.command;

public class OfficeCommandFactory {
    public static OfficeCommand createCommand(String[] args) {
        String commandType = args[0];

        switch (commandType) {
            case "print":
                return new PrintCommand(args[1]);
            case "fax":
                return new FaxCommand(args[1], args[2]);
            case "email":
                return new EmailCommand(args[1], args[2]);
            default:
                throw new IllegalArgumentException("unknown command type..");
        }
    }
}
