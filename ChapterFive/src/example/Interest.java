package example;

public class Interest {

    private double amount;
    private double principal = 1000.0;
    private double rate = 0.05;

    public void setamount(double amount) {
        for (int year = 1; year <=10 ; ++year) {
            amount =principal * Math.pow(1.0 * rate , year);
        }
        this.amount = amount;
    }

    public void setprincipal(double principal) {
        this.principal = principal;
    }

    public void setrate(double rate) {
        this.rate = rate;
    }

    public double getamount() {
        return amount;
    }
}
