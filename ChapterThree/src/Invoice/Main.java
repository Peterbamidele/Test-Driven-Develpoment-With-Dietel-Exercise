package Invoice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("HARDWARE INVOICE");

        Scanner input = new Scanner(System.in);

        Invoice invoice = new Invoice("Fridge",10,250000,"N0:WER90234");

        System.out.print("ENTER SERIAL NUMBER OF THE INVOICE: ");
        invoice.setpartNumber(input.nextLine());

        System.out.print("ENTER ITEM BOUGHT(Name): ");
        invoice.setpartDescription(input.nextLine());

        System.out.print("ENTER QUANTITY OF ITEM BOUGHT:");
        invoice.setQuantityItemBeingPurchased(input.nextInt());

        System.out.print("ENTER AMOUNT OF ITEM BOUGHT:");
        invoice.setpricePerItem(input.nextInt());


//        System.out.println("PART/SERIAL NUMBER: " + invoice.getpartNumber() + "\n" + "ITEM DESCRIPTION: " + invoice.getpartDescription() + "\n" +
//              "QUANTITY Of ITEM:" + invoice.getQuantityItemBeingPurchased()  + "\n" + "ITEM PER PRICE :" + invoice.getpricePerItem() + "\n"+"\t" + "TOTAL:" + invoice.getInvoiceAmount() );




       // Invoice invoice = new Invoice("No:tr3567",10,20000,"NO:WER2345");

        System.out.println("Your Invoice Details Are:");
        System.out.println("Serial No: " + invoice.getpartNumber());
        System.out.println("Product Details: " + invoice.getpartDescription());
        System.out.println("Product Quantity: " + invoice.getQuantityItemBeingPurchased());
        System.out.println("Amount Paid: " + invoice.getpricePerItem());

    }
}

