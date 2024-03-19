public class CheckingAccount extends Account {

    private double overdraftProtection;

    public CheckingAccount(double balance, double overdraftProtection) {
        super(balance);
        this.overdraftProtection = overdraftProtection;
    }

    public CheckingAccount(double balance) {
        this(balance, -1.0); 
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance - amount >= 0.0) {
            balance -= amount;
            return true;
        } else if (overdraftProtection >= 0.0 && overdraftProtection >= (amount - balance)) {
            balance = 0.0;
            overdraftProtection -= (amount - balance);
            return true;
        }
        return false;
    }

    public double getOverdraftProtection() {
        return overdraftProtection;
    }

    public void setOverdraftProtection(double overdraftProtection) {
        this.overdraftProtection = overdraftProtection;
    }
}


