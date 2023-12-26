package test;

import main.BankAccount;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    BankAccount account;

    @BeforeAll
    static void testStart() {

        System.out.println("Test has started.");
    }

    @AfterAll
    static void testFinish() {

        System.out.println("Test has finished.");
    }

    @BeforeEach
    void initializeObj() {

        account = new BankAccount();
    }

    @AfterEach
    void devastateObj() {

        account = null;
    }

    @Test
    void TC_005_01_DepositIntoAccount() {

        account.deposit(100);

        assertNotEquals(0, account.getBalance(), "DepositIntoAccount amount is 100$ so the balance should not be zero.");
    }

    @Test
    void TC_005_02_WithdrawFromAccountWithSufficientFunds() {

        account.deposit(100);

        account.withdraw(99);

        assertEquals(1, account.getBalance(), "Withdraw amount is 99$ so the balance should be 1$.");
    }

    @Test
    void TC_005_03_WithdrawFromAccountExceedingBalance() {

        account.deposit(100);

        assertThrows(Exception.class, () -> account.withdraw(101), "WithdrawFromAccountExceedingBalance should throw an Exception.");
    }

    @Test
    void TC_005_04_DepositNegativeAmount() {

        assertThrows(Exception.class, () -> account.deposit(-100), "DepositNegativeAmount should throw an Exception.");
    }

    @Test
    void TC_005_05_WithdrawNegativeAmount() {

        assertThrows(Exception.class, () -> account.withdraw(-100), "WithdrawNegativeAmount should throw an Exception.");
    }
}
