package pl.codeleak.patterns.strategy;

public class ConsoleStrategy implements PrintingStrategy {
    @Override
    public void print(String value) {
        System.out.println(value);
    }
}
