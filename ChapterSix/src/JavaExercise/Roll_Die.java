package JavaExercise;

import java.security.SecureRandom;

public class Roll_Die {
    public static void main(String[] args) {
        SecureRandom randNumber = new SecureRandom();
        int side1 = 0;
        int side2 = 0;
        int side3 = 0;
        int side4 = 0;
        int side5 = 0;
        int side6 = 0;

        for (int roll = 1; roll <=600 ; roll++){
            int face = 1 + randNumber.nextInt(6);
            switch (face){
                case 1:
                    ++side1;
                    break;
                case 2:
                    ++side2;
                    break;
                case 3:
                    ++side3;
                    break;
                case 4:
                    ++side4;
                    break;
                case 5:
                    ++side5;
                    break;
                case 6:
                    ++side6;
                    break;
            }
        }
        {
            System.out.println("Face\tSide");
            System.out.printf("1\t\t%d%n2\t\t%d%n3\t\t%d%n4\t\t%d%n5\t\t%d%n6\t\t%d%n",side1,side2,side3,side4,side5,side6);

        }
    }
}
