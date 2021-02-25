package ClassWithMainMethod;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        double gross = 0.0;
        double earnings;
        int Item = 0;
        int numbersolid = 0;

        while ( Item < 4){
            Item++;

            System.out.printf("Enter Number Sold Product #%d:",Item);
            numbersolid = input.nextInt();

            if (Item == 1)
                gross += numbersolid * 239.99;
            else if (Item == 2)
                gross += numbersolid * 129.75;
            else if (Item == 3)
                gross += numbersolid * 99.95;
            else if (Item == 4)
                gross += numbersolid * 350.89;        }
        earnings = 0.09 * gross + 200;
        System.out.printf("Earning this Week: #%.2f\n", earnings);
//#5256.23
        //67
        //65
        //43
        //78


    }
}
