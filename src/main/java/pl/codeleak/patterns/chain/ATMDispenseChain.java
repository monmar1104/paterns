package pl.codeleak.patterns.chain;

import java.util.Scanner;

public class ATMDispenseChain {

    private DispenseChain chain1;

    public ATMDispenseChain() {
        this.chain1 = new Value50Dispenser();
        DispenseChain chain2 = new Value20Dispenser();
        DispenseChain chain3 = new Value10Dispenser();

        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);
    }

    public static void main(String[] args) {
        //TODO stwórz łańcuch wymiany pieniędzy na drobne po 50,20,10
        ATMDispenseChain atmDispenseChain = new ATMDispenseChain();

        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense (-1 ends program): ");
            Scanner scanner = new Scanner(System.in);
            amount = scanner.nextInt();

            if (amount == -1) {
                break;
            }

            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                continue;
            }

            atmDispenseChain.chain1.dispense(new Currency(amount));
        }
    }
}
