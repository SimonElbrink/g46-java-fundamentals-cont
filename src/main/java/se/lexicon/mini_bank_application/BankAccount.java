package se.lexicon.mini_bank_application;

public class BankAccount {

    String accountIdentification; // 902 556 588 664
    double balance = 0;
    String ownerName;

    public double withdraw(double amount){

//        this.balance = this.balance - amount;
        this.balance -= amount;

        return amount;
    }

    public boolean deposit(double amount){

        if (amount > 0){
            this.balance = this.balance + amount;
            return true;
        }else {
            System.out.println("🔥Warning: Deposit Failed🔥");
            return false;
        }

    }




}
