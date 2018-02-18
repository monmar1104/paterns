package pl.codeleak.patterns.builder;

import java.time.LocalDateTime;

public class AccountBuilderApp {

    public static void main(String[] args) {
        // TODO Create a builder that constructs different account representations:
        // one with only required fields set
        // second with optional name set too
        // third with all fields set

        Account accountWithRequiredFields = Account.newBuilder("mail", "Password")
                .build();

        Account accountWithName = Account.newBuilder("mail", "password")
                .withName("Andrzej")
                .build();

        Account accountWithAllFields = Account.newBuilder("mail", "password")
                .withName("Stefan")
                .expiresAt(LocalDateTime.now())
                .build();

        System.out.println(accountWithRequiredFields.toString());
        System.out.println(accountWithName.toString());
        System.out.println(accountWithAllFields.toString());
    }
}

