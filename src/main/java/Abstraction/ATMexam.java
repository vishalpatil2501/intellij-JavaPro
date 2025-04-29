package Abstraction;

abstract class ATM {
    abstract void withdrawMoney();
    abstract void depositMoney();
    void checkBalance() {  // Concrete method
        System.out.println("Checking balance...");
    }
}
class SBI_ATM extends ATM {
    @Override
    void withdrawMoney() {
        System.out.println("Withdrawal from SBI ATM.");
    }
    @Override
    void depositMoney() {
        System.out.println("Deposit into SBI ATM.");
    }
}
public class ATMexam {
    public static void main(String[] args) {
        SBI_ATM sb = new SBI_ATM();
        sb.depositMoney();
        sb.withdrawMoney();
        sb.checkBalance();
    }
}
