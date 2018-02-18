package pl.codeleak.patterns.builder;

import java.time.LocalDateTime;

class Account {

    private final String email;
    private final String password;

    private String name; // optional
    private LocalDateTime expiresAt; // optional


    Account(String email, String password) {
        this.email = email;
        this.password = password;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getEmail() {
        return email;
    }

    String getPassword() {
        return password;
    }

    public LocalDateTime getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(LocalDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }
}
