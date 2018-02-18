package pl.codeleak.patterns.strategy;

@FunctionalInterface
interface PrintingStrategy {
    void print(String value);
}
