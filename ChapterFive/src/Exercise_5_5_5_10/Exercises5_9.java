package Exercise_5_5_5_10;

import java.util.Scanner;

public class Exercises5_9 {
    public static void main(String[] args) {

        System.out.println("Find and correct the error(s) in each of the following segments of code:");
        /****
         * 5.9 Find and correct the error(s) in each of the following segments of code:
         * a) For (i = 100, i >= 1, i++)
         * System.out.println(i);****/
        for (int i = 100; i >=1 ;--i ) {
            System.out.println(i);

        }
        System.out.println();

        System.out.println("b) The following code should print whether integer value is odd or even:");

        /***b) The following code should print whether integer value is odd or even:
         switch (value % 2)
         {
         case 0:
         System.out.println("Even integer");
         case 1:
         System.out.println("Odd integer");
         }****/
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a value: ");
        int value = input.nextInt();
        switch (value % 2)
        {
            case 0:
                System.out.println("Even integer");
                break;
            case 1:
                System.out.println("Odd integer");
        }

        System.out.println();

        System.out.println("c) The following code should output the odd integers from 19 to 1:");

        for (int j = 19; j >=1 ; j-=2) {
            System.out.println(j);

        }

        System.out.println();

        System.out.println("d) The following code should output the even integers from 2 to 100:");
        int counter = 2;

        do {
            System.out.println(counter);
            counter +=2;
        }while (counter <= 100);

    }

}
