package pl.codeleak.patterns.chain;

import java.util.Scanner;

public class ATMDispenseChain {

    private DispenseChain chain1;

    public ATMDispenseChain() {
        //TODO stwórz łańcuch
    }

    public static void main(String[] args) {
        //TODO stwórz łańcuch wymiany pieniędzy na drobne po 50,20,10
        ATMDispenseChain atmDispenseChain = new ATMDispenseChain();

        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense: ");
            Scanner scanner = new Scanner(System.in);
            amount = scanner.nextInt();

            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                continue;
            }

            atmDispenseChain.chain1.dispense(new Currency(amount));
        }
    }
}
