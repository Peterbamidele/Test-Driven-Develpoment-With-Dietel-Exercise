package ClassWithMainMethod;

import java.util.Scanner;

public interface Multiples2withinInfiniteLoop {
    public static void main(String[] args) {

        int counter = 1;
        int number = 0;

        while (counter != 2) {
            number = number + 2;
            System.out.printf("Multiples of Two(2) %d%n", number);
            counter = counter + 2;
        }
    }
}

