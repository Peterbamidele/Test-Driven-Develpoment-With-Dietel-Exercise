package CalculatingSales;

import java.util.Scanner;

public class CalculatingSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double product1 = 0;
        double product2 = 0;
        double product3 = 0;
        double product4 = 0;
        double product5 = 0;

        int productNumber = 1;

        while (productNumber != 0)
        {
            System.out.print("Enter product number (1-5)(0 to stop:");
            productNumber = input.nextInt();

            if (productNumber >= 1 && productNumber <= 5)
            {
                System.out.print("Enter quantity sold");
                int quantitySold = input.nextInt();

                switch (productNumber) {
                    case 1 -> product1 += quantitySold * 2.98;
                    case 2 -> product2 += quantitySold * 4.50;
                    case 3 -> product3 += quantitySold * 9.98;
                    case 4 -> product4 += quantitySold * 4.49;
                    case 5 -> product5 += quantitySold * 6.87;
                }
            }
            else if (productNumber !=0) System.out.println("product number must be between 1 and 5 0r 0 to stop");
        }
        System.out.println();
        System.out.printf("Product 1: $%.2f\n",product1);
        System.out.printf("Product 2: $%.2f\n",product2);
        System.out.printf("Product 3: $%.2f\n",product3);
        System.out.printf("Product 4: $%.2f\n",product4);
        System.out.printf("Product 5: $%.2f\n",product5);



    }
}
