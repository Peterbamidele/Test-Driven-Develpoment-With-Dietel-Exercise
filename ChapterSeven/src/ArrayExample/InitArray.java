package ArrayExample;

public class InitArray {
    public static void main(String[] args) {
        int[] array = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };
        System.out.printf("%s%8s%n", "index", "value");
        for (int counter = 0; counter < array.length ; counter++)
            System.out.printf("%5d%8d%n", counter, array[counter]);

        System.out.println();
        System.out.println(array[7]);

        System.out.println();
        array[5] = 100;
        System.out.println(array[5]);
    }
}
