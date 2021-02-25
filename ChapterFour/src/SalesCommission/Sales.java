package SalesCommission;

import javax.swing.*;

public class Sales {

    private double basePay = 200.0;
    private int quantityOfItem1;
    private int quantityOfItem2;
    private int quantityOfItem3;
    private int quantityOfItem4;
    private double totalSale;
    private double grossPay;

    public double getBasePay() {
        return basePay;
    }

    public double getValueOfItem1() {
        double valueOfItem1 = 239.99;
        return valueOfItem1;
    }

    public double getValueOfItem2() {
        double valueOfItem2 = 129.75;
        return valueOfItem2;
    }

    public double getValueOfItem3() {
        double valueOfItem3 = 99.95;
        return valueOfItem3;
    }

    public double getValueOfItem4() {
        double valueOfItem4 =350.89;
        return valueOfItem4;
    }

    public void setQuantityOfItem1() {
        int userInput =Integer.parseInt(JOptionPane.showInputDialog("ENTER NUMBER OF INPUT SOLD FOR ITEM 1"));
        this.quantityOfItem1= userInput;
    }

    public int getQuantityOfItem1() {
        return quantityOfItem1;
    }


    public void setQuantityOfItem2() {
        int userInput =Integer.parseInt(JOptionPane.showInputDialog("ENTER NUMBER OF INPUT SOLD FOR ITEM 2"));
        this.quantityOfItem2= userInput;
    }

    public int getQuantityOfItem2() {
        return quantityOfItem2;
    }



    public void setQuantityOfItem3() {
        int userInput =Integer.parseInt(JOptionPane.showInputDialog("ENTER NUMBER OF INPUT SOLD FOR ITEM 3"));
        this.quantityOfItem3= userInput;
    }

    public int getQuantityOfItem3() {
        return quantityOfItem3;
    }

    public void setQuantityOfItem4() {
        int userInput =Integer.parseInt(JOptionPane.showInputDialog("ENTER NUMBER OF INPUT SOLD FOR ITEM 4"));
        this.quantityOfItem4= userInput;
    }

    public int getQuantityOfItem4() {
        return quantityOfItem4;
    }



    public void calcTotalNumberOfItemsSold(){
        setQuantityOfItem1();
        setQuantityOfItem2();
        setQuantityOfItem3();
        setQuantityOfItem4();

        double totalSalesOfItem1 = getQuantityOfItem1() * getValueOfItem1();
        double totalSalesOfItem2 = getQuantityOfItem2() * getValueOfItem2();
        double totalSalesOfItem3 = getQuantityOfItem3() * getValueOfItem3();
        double totalSalesOfItem4 = getQuantityOfItem4() * getValueOfItem4();


        this.totalSale = totalSalesOfItem1+totalSalesOfItem2+totalSalesOfItem3+totalSalesOfItem4;


    }

    public double getTotalSales() {
        return totalSale;
    }

    public void calcGrossPay() {
        calcTotalNumberOfItemsSold();
        this.grossPay =(0.09 * totalSale) + basePay;
    }

    public double getGrossPay() {
        return grossPay;
    }
}

