package pl.codeleak.patterns.builder;

import java.time.LocalDateTime;

public class AccountBuilderApp {

    public static void main(String[] args) {
        // TODO stwórz builder, który zbuduje różne reprezentacje obiektu account:
        // - tylko wymagane pola (oznaczone jako final)
        // - wymagane + pole name
        // - wszystkie pola obiektu

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

