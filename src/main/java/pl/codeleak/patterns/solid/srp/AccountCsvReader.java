package pl.codeleak.patterns.solid.srp;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

class AccountCsvReader implements AccountReader {

    private final String filename;

    AccountCsvReader(String filename) {
        this.filename = filename;
    }

    @Override
    public List<Account> getAll() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            return reader.lines()
                         .map(line -> line.split(";"))
                         // mapping
                         .map(line -> {
                             Account account = new Account();
                             account.setName(line[0]);
                             account.setEmail(line[1]);
                             account.setPassword(line[2]);
                             return account;
                         })
                         // validating
                         .filter(account -> account.getEmail().contains("@"))
                         .collect(Collectors.toList());
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
