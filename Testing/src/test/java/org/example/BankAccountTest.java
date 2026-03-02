package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

/*
we have three phases in testing - red , green , blue
red phase - write code thats fails
green phase - write minimum code for any function
blue phase - optimize the code , edges cases etc
 */

public class BankAccountTest {
    @Test
    public void testDeposit(){
        BankAccount account = new BankAccount(100);
        account.deposit(50);
        assertEquals(150, account.getBalance());
    }

    @Test
    public void testWithdraw(){
        BankAccount account = new BankAccount(100);
        account.withdraw(50);
        assertEquals(50, account.getBalance());
    }

    @Test
    public void testInsufficientFunds(){
        BankAccount account = new BankAccount(100);
//        account.withdraw(150);
//        assertEquals(100, account.getBalance());
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(170));
    }

    public static void main(String[] args){
        BankAccountTest test = new BankAccountTest();
        test.testDeposit();
        test.testWithdraw();
        test.testInsufficientFunds();
    }
}
