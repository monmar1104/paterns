package pl.codeleak.patterns.command;

import java.time.LocalDateTime;

class OfficeAssistanceApp {

    public static void main(String[] args) {

        System.out.println(LocalDateTime.now());

        // Possible arguments
        String[] printArgs = new String[]{"print", "Hello World!"};
        // String[] faxArgs = new String[]{"fax", "0048543-34-34", "Hello World!"};
        // String[] emailArgs = new String[]{"email", "demo@example.com", "Hello World!"};

        OfficeManagement officeManagement = new OfficeManagement();

        // TODO Depending on the args create a command
        OfficeCommand officeCommand = null;

        // TODO Execute the command
        officeCommand.execute(officeManagement);
    }
}
