package SalesCommissionCalculator;


/***
 * 4.19 (Sales Commission Calculator) A large company pays its salespeople on a commission basis.
 * The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
 * salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5000, or a
 * total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
 * these items are as follows:
 * Item     Value
 *  1       239.99
 *  2       129.75
 *  3       99.95
 *  4       350.89
 * Develop a Java application that inputs one salesperson’s items sold for last week and calculates and
 * displays that salesperson’s earnings. There’s no limit to the number of items that can be sold.
 * ****/

public class SalesCommissionCalculator {
    private int itemNumber;
    private double itemPrice;
    private double grossSales;

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
        getItemPrice();
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public double getItemPrice() {
        switch (itemNumber) {
            case 1 -> itemPrice = 239.99;
            case 2 -> itemPrice = 129.75;
            case 3 -> itemPrice = 99.95;
            case 4 -> itemPrice = 350.89;
        }
        grossSales += itemPrice;
        return itemPrice;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getGrossSalary() {
        double earnings = 200 + 0.09 * grossSales;
        return earnings;
    }
}
