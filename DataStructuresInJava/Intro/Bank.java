class BankAccount {
    private double balance;

    public BankAccount(double openingBalance) {
        balance = openingBalance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public void display() {
        System.out.println("balance = " + balance);
    }
}

class bank {
    public static void main(String[] args) {
        BankAccount bal = new BankAccount(100.00);

        System.out.println("Before transaction, ");
        bal.display();

        bal.deposit(75.54);
        bal.withdraw(30);

        System.out.println("After transaction, ");
        bal.display();
    }
}
