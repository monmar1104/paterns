package pl.codeleak.patterns.solid.srp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.UncheckedIOException;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@FunctionalInterface
interface AccountMapper extends Function<String[], Account> {

}

@FunctionalInterface
interface AccountValidator extends Predicate<Account> {

}

class BetterCsvReader {

    private static final String SEPARATOR = ";";

    private final Reader source;
    private final String separator;

    private final AccountMapper accountMapper;
    private final AccountValidator accountValidator;

    BetterCsvReader(Reader source, AccountMapper accountMapper, AccountValidator accountValidator) {
        this(source, SEPARATOR, accountMapper, accountValidator);
    }

    BetterCsvReader(Reader source, String separator, AccountMapper accountMapper, AccountValidator accountValidator) {
        this.source = source;
        this.separator = separator;
        this.accountMapper = accountMapper;
        this.accountValidator = accountValidator;
    }

    List<Account> getAll() {
        try (BufferedReader reader = new BufferedReader(source)) {
            return reader.lines()
                         .map(line -> line.split(separator))
                         .map(accountMapper)
                         .filter(accountValidator)
                         .collect(Collectors.toList());
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
