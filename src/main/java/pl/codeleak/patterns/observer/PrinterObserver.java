package pl.codeleak.patterns.observer;

interface PrinterObserver {
    void messagePrinted(String message, int currentPrintCount);
}
