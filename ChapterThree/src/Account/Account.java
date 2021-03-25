package Account;

public class Account {

    private String firstName;
    private String SurName;
    private double Balance;
    private int pinNumber;


    public Account(String firstName,String SurName,double Balance,int pinNumber){
        this.firstName = firstName;
        this.SurName= SurName;
        this.pinNumber = pinNumber;
        if(Balance > 0.0)
          this.Balance = Balance;
    }



    public void setfirstName(String firstName){
        this.firstName = firstName;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setSurName(String Surname) {
        this.SurName = Surname;
    }

    public String getSurName()  {
        return SurName;
    }


    public void setBalance(double Balance) {
        if (Balance > 0.0)
        this.Balance = Balance;
    }

    public double getBalance() {
        return Balance;
    }

    public void setdepositAmount(double depositAmount) {
        if (depositAmount > 0.0)
            Balance = Balance + depositAmount;
    }

    public void setpinNumber(int pinNumber) {
        this.pinNumber = pinNumber;

    }

    public int getpinNumber() {
        return pinNumber;
    }

    public void setWithdraw(double withdraw) {
       if (withdraw > 0.0);
        Balance = Balance - withdraw;
    }
}
