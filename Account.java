public class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance - amount >= 0.0) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Account acc1 = new Account(100000.0);

        acc1.deposit(1000000);
        System.out.println("Saldo akun: " + acc1.getBalance());

        if (acc1.withdraw(500000)) {
            System.out.println("Penarikan berhasil.");
        } else {
            System.out.println("Penarikan gagal. Saldo tidak cukup.");
        }
    }
}
