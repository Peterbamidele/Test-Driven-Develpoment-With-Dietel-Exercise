package CreditLimit;
/***
 *  4.18 Develop a Java application that will determine whether any of several department-store customers has exceeded the credit limit on a charge account.
 *  *          For each customer, the following facts are available:
 *                 a) account number
 *                 b) balance at the beginning of the month
 *                 c) total of all items charged by the customer this month
 *                 d) total of all credits applied to the customer’s account this month
 *                 e) allowed credit limit.
 *             The program should input all these facts as integers, calculate the new balance (= beginning balance + charges – credits),
 *             display the new balance and determine whether the new balance exceeds the customer’s credit limit.
 *             For those customers whose credit limit is exceeded, the program should display the message "Credit limit exceeded" .? ***/

public class CreditLimit {

    public int newBalance;
    public int TotalItemCharged;
    private int AccountNumber;
    private int BalanceAtBeginningOfMonth;
    private int creditLimit;
    private int TotalCreditAppliedToCustomer;


    public CreditLimit(int newBalance, int totalItemCharged, int accountNumber, int balanceAtBeginningOfMonth, int creditLimit, int totalCreditAppliedToCustomer) {
        this.newBalance = newBalance;
        TotalItemCharged = totalItemCharged;
        AccountNumber = accountNumber;
        BalanceAtBeginningOfMonth = balanceAtBeginningOfMonth;
        this.creditLimit = creditLimit;
        TotalCreditAppliedToCustomer = totalCreditAppliedToCustomer;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public int getBalanceAtBeginningOfMonth() {
        return BalanceAtBeginningOfMonth ;
    }

    public int getcreditLimit() {
        return creditLimit;
    }

    public int getTotalItemCharged() {
        return TotalItemCharged;
    }

    public int getTotalCreditAppliedToCustomer(){


        return TotalCreditAppliedToCustomer;
    }

    public void setnewBalance(int newBalance) {
        newBalance = BalanceAtBeginningOfMonth + TotalItemCharged - creditLimit;
        this.newBalance = newBalance;
    }


    public int getnewBalance() {
        if (BalanceAtBeginningOfMonth > creditLimit) {
            System.out.println("Credit limit exceeded");
        }
        else System.out.print("You want dupe Our Bank Abi");
        return newBalance;
    }

    public void setAccountNumber(int AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    public void setBalanceAtBeginningOfMonth(int BalanceAtBeginningOfMonth) {
        this.BalanceAtBeginningOfMonth = BalanceAtBeginningOfMonth;
    }

    public void setcreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setTotalItemCharged(int TotalItemCharged) {
        TotalItemCharged = TotalItemCharged;
    }

    public void setTotalCreditAppliedToCustomer(int TotalCreditAppliedToCustomer) {
        this.TotalCreditAppliedToCustomer = TotalCreditAppliedToCustomer;
    }


}