package pl.codeleak.patterns.chain;

public class Value10Dispenser implements DispenseChain {

    private DispenseChain dispenseChain;

    private int value = 10;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.dispenseChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        int amount = currency.getAmount();
        if (amount >= value) {
            int num = amount / value;
            int remain = amount % value;
            System.out.println("Dispensing " + num + " x " + value);

            if (remain != 0) {
                this.dispenseChain.dispense(new Currency(remain));
            }
        } else {
            this.dispenseChain.dispense(currency);
        }
    }
}
