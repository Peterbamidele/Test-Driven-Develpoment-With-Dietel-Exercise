package Invoice;

public class Invoice {

    private String partNumber;
    private String partDescription;
    private int QuantityItemBeingPurchased;
    private double pricePerItem;

    public Invoice(String partDescription, int quantityItemBeingPurchased, double pricePerItem,String partNumber) {
        this.partDescription = partDescription;
        QuantityItemBeingPurchased = quantityItemBeingPurchased;
        this.pricePerItem = pricePerItem;
        this.partNumber = partNumber;
    }

    public void setpartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getpartNumber() {

        return partNumber;
    }

    public void setpartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public String getpartDescription() {
        return partDescription;
    }

    public void setQuantityItemBeingPurchased(int QuantityItemBeingPurchased) {
        if (QuantityItemBeingPurchased == 0.0)
            QuantityItemBeingPurchased = 0;
        this.QuantityItemBeingPurchased = QuantityItemBeingPurchased;
    }

    public int getQuantityItemBeingPurchased() {
        return QuantityItemBeingPurchased;
    }

    public void setpricePerItem(double pricePerItem) {
        if (pricePerItem == 0.0 )
            pricePerItem = 0;
        this.pricePerItem = pricePerItem;
    }

    public double getpricePerItem() {
        return pricePerItem;
    }

    public double getInvoiceAmount() {


        return getpricePerItem() * getQuantityItemBeingPurchased();
    }
}

