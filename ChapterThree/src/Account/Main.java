package Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("WELCOME TO OUR PETTECH BANK");

        Account account = new Account("p","Q",0,0);

        System.out.println("Enter your FirstName:");
        account.setfirstName(input.nextLine());

        System.out.println("Enter your SurName:");
        account.setSurName(input.nextLine());

        System.out.println("How Much Did You Want To Deposit:");
        account.setdepositAmount(input.nextDouble());

        System.out.println("Enter Your Secret Pin Number:");
        account.setpinNumber(input.nextInt());

//     System.out.println("How Much Did You Want To Deposit:");
//        account.setdepositAmount(input.nextDouble());

        System.out.println("How Much Did You Want To Withdrawal:");
        account.setWithdraw(input.nextDouble());


        System.out.println("Welcome To Our Bank");
        System.out.println("FirstName: " + account.getfirstName());
        System.out.println("SurName: " + account.getSurName());
        System.out.println("Your Pin: " + account.getpinNumber());
        System.out.println("Your Balance: " + account.getBalance());

//        System.out.println("Amount Paid: " + invoice.getpricePerItem());




    }
}
