package JavaExercise;

import java.security.SecureRandom;

public class SecureRandomNumber {
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();
        double randdouble = randomNumber.nextInt(1000);
        int randomdouble = 1 + randomNumber.nextInt(6);
        System.out.println("Random double :" + randdouble);
        System.out.println("Random Interger : " + randomdouble);


    }

}

