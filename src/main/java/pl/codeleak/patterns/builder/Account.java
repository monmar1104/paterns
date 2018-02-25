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

    public Account(Builder builder) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.expiresAt = expiresAt;
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

    static class Builder{
        private final String email;
        private final String password;
        private String name;
        private LocalDateTime expiresAt;

        public static Builder getBuilder(String email, String password){
            return new Builder(email,password);
        }

        Builder(String email, String password){
            this.email=email;
            this.password=password;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public LocalDateTime getExpiresAt() {
            return expiresAt;
        }

        public Builder setExpiresAt(LocalDateTime expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        public Account build(){
            return new Account(this);
        }

    }
}
