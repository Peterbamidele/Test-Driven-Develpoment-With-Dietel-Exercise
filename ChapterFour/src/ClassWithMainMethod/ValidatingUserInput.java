package ClassWithMainMethod;

import java.util.Scanner;
/****
 * (Validating User Input) Modify the program in Fig. 4.12 to validate its inputs. For any in-
 * put, if the value entered is other than 1 or 2,
 * keep looping until the user enters a correct value.***/

public class ValidatingUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter UserInput: ");
        int userinput= input.nextInt();

        while (userinput!=1 && userinput!=2){
            System.out.print("Enter UserInput: ");
            userinput= input.nextInt();
        }
        System.out.printf("Your Input is %d%n",userinput);

    }
}
