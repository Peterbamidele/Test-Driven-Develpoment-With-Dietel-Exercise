package Invoice;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InvoiceTest {
    Invoice invoice;

    @BeforeEach
    void setUp() {
       invoice = new Invoice("Tv",10,3000,"No:WER456");
    }

    @AfterEach
    void tearDown() {
         invoice = null;
    }


    @Test
    void TestIfInvoiceHasAPartNumber(){
        invoice.setpartNumber("partNumber");
        assertEquals("partNumber",invoice.getpartNumber());
    }

    @Test
    void TestIfInvoiceHasAPartDescription(){
        invoice.setpartDescription("partDescription");
        assertEquals("partDescription",invoice.getpartDescription());
    }
    @Test
    void TestIfInvoiceHasAQuantityOfTheItemBeingPurchased(){
       invoice.setQuantityItemBeingPurchased(2000);
        assertEquals(2000,invoice.getQuantityItemBeingPurchased());

    }

    @Test
    void TestIfInvoiceHasAPricePerItem(){
        invoice.setpricePerItem(00.00);
        assertEquals(00.00,invoice.getInvoiceAmount());
    }


    @Test
    void checkIfInvoiceAmountThatCalculatesTheInvoiceAmount(){
        invoice.setpricePerItem(2000);
        invoice.setQuantityItemBeingPurchased(10);
        assertEquals(20000,invoice.getInvoiceAmount());
    }

}
