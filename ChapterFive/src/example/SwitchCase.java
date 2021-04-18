package example;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System .in);

        int n =5;
        switch (n){
            case 10:
                System.out.println("n = 10");
            case 4:
                System.out.println("n = 90");
            default:
                System.out.println("non of them");
        }
        System.out.println();

        System.out.print("Enter Grade:");
         String grade = input.next();

        switch (grade){
            case "A":
                System.out.println("Excellent");
                System.out.println("Grade is:" + grade + " More of it");
                break;
            case "B":
                System.out.println("Very Good");
                System.out.println("Grade is :"+ grade + " Keep Tryng");
                break;
            case "C":
                System.out.println("Good");
                System.out.println("Grade is :" + grade + " Keep it up");
                break;
            default:
                System.out.println("Please enter grade A,B,or C");
        }
        System.out.println("Grade is:"+ grade);
    }
}
