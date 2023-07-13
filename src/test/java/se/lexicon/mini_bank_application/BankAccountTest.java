package se.lexicon.mini_bank_application;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class BankAccountTest {

    @Test
    @DisplayName("withdraw should succeed when amount is greater then 0 and Enough Balance")
    void withdraw_SucceedGreaterThen0EnoughBalance() {
        BankAccount account = new BankAccount();
        account.balance = 600;

        double withdrawReturnValue = account.withdraw(500);

        double expectedBalance = 100;
        double actualBalance = account.balance;

        assertAll(
                () -> assertEquals(expectedBalance, actualBalance, "Balance should be 100"),
                () -> assertEquals(500, withdrawReturnValue, "Should Return amount transferred")
        );

    }

    @Test
    void withdraw_should_fail_when_amount_higher_then_balance() {

    }

    @Test
    void withdraw_should_fail_when_amount_is_negative() {

    }

    @Test
    void deposit_should_succeed_when_amount_positive() {

        BankAccount account = new BankAccount();

        //Balance = 0

        account.deposit(500);

        //Balance 500


        double expectedBalance = 500;
        double actualBalance = account.balance;

//        if (account.balance == 500){
//            System.out.println("CORRECT!");
//        }else {
//            System.out.println("Balance is not correct!");
//        }

        assertEquals(expectedBalance, actualBalance, "Balance should be updated to 500");

    }

    @Test
    void deposit_should_fail_when_amount_negative() {
        BankAccount account = new BankAccount();

        boolean deposit = account.deposit(-650);

        double expectedBalance = 0;
        double actualBalance = account.balance;

        assertEquals(expectedBalance, actualBalance);
        assertFalse(deposit);

    }



}