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

    private Account(Builder builder) {
        this.email = builder.email;
        this.password = builder.password;
        this.name = builder.name;
        this.expiresAt = builder.expiresAt;
    }

    @Override
    public String toString() {
        return "Account{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", expiresAt=" + expiresAt +
                '}';
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

    public static Builder newBuilder(String email, String password) {
        return new Builder(email, password);
    }

    public static class Builder {
        final String email;
        final String password;
        String name;
        LocalDateTime expiresAt;

        public Builder(String email, String password) {
            this.email = email;
            this.password = password;
        }

        public Account build() {
            return new Account(this);
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder expiresAt(LocalDateTime expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
    }
}
