package pl.codeleak.patterns.command;

class PrintCommand implements OfficeCommand {

    private String message;

    PrintCommand(String message) {
        this.message = message;
    }

    @Override
    public void execute(OfficeManagement target) {
        target.print(message);
    }
}
