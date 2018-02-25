package pl.codeleak.patterns.observer;

import java.util.ArrayList;
import java.util.List;

class Printer {

    private List<PrinterObserver> observers = new ArrayList<>();

    private int printCount = 0;

    void addObserver(PrinterObserver printerObserver) {
        if (observers.contains(printerObserver)) {
            return;
        }
        observers.add(printerObserver);
    }

    void print(String message) {
        System.out.println(message);
        printCount++;
        for (PrinterObserver observer : observers) {
            observer.messagePrinted(message, printCount);
        }
    }
}
