package ExerciseWithOutTTD.ParkingCharge;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Value to Check if Is Even Or Odd:");
        int NumberEntered = input.nextInt();
        isEven(NumberEntered);
    }

    private static void isEven(int Value) {
        if (Value % 2 ==0){
            System.out.println("is Even");
        }else {
            System.out.println("Odd Number");
        }
    }


}
