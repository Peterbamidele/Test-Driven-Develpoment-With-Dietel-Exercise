package CreditLimit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CreditLimitTest {
    CreditLimit creditLimit;

    @BeforeEach
    void setUp() {
        creditLimit = new CreditLimit(50,70,500,300,100,150);
    }

    @AfterEach
    void tearDown() {
        creditLimit = null;
    }

    @Test
    void checkIfCreditLimitHasAccount(){
        creditLimit.setAccountNumber(500);
        assertEquals(500,creditLimit.getAccountNumber());
    }

    @Test
    void checkIfCreditLimitHasBalanceAtTheBeginningOftheMonth(){
        creditLimit.setBalanceAtBeginningOfMonth(300);
        assertEquals(300,creditLimit.getBalanceAtBeginningOfMonth());
    }

    @Test
    void checkIfCreditLimitHasCreditLimit(){
        creditLimit.setcreditLimit(100);
        assertEquals(100,creditLimit.getcreditLimit());
    }


    @Test
    void CheckIfCreditLimitHasTotalItemChargedbyTheCustmoer(){
        creditLimit.setTotalItemCharged(70);
        assertEquals(70,creditLimit.getTotalItemCharged());
    }

    @Test
    void CheckIfCreditLimitHasTotalCreditAppliedToTheCustomer(){
        creditLimit.setTotalCreditAppliedToCustomer(150);
        assertEquals(150,creditLimit.getTotalCreditAppliedToCustomer());
    }

    @Test
    void CheckIfCreditLimitHasNewBalance(){
        creditLimit.setnewBalance(270);
        assertEquals(270,creditLimit.getnewBalance());
    }
}