package ArrayExample;

public class Summing_Element_in_Array {
    public static void main(String[] args) {
        int[] number = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        int sum = 0;

        for (int counter = 0; counter < number.length; counter++)
            sum += number[counter];
        System.out.printf("Total Sum of Number Element: %d%n",sum);
    }
}
