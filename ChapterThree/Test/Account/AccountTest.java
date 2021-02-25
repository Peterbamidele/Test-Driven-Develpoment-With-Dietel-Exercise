package Account;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountTest {

    Account account;
    @BeforeEach
    void setUp() {
        account = new Account("Peter","Aro",5000.0,2091);
    }

    @AfterEach
    void tearDown() {
        account = null;
    }

    @Test
    void CheckIfAccountHasFirstName(){
        account.setfirstName("peter");
        assertEquals("peter",account.getfirstName());

    }

    @Test
    void CheckIfAccountHasSurName(){
        account.setSurName("Aro");
       assertEquals("Aro",account.getSurName());
    }

    @Test
    void CheckIfAccountHasBalnce(){
        account.setBalance(00.00);
        assertEquals(00.00,account.getBalance());
    }
    @Test
    void CheckIfAccountCanDepositAmount(){
        account.setdepositAmount(00.00);


    }

    @Test
    void CheckIfAccountCanHasPinNUmber(){
        account.setpinNumber(1234);
        assertEquals(1234,account.getpinNumber());
        
    }

    @Test
    void CheckIfAccountCanWithDrawMoney(){
        account.setWithdraw(2000);
        assertEquals(2000,account.getBalance());
    }


}