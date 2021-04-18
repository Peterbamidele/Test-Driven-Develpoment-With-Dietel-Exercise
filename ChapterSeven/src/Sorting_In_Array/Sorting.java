package Sorting_In_Array;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[]arr = {13,23,45,65,23};
        Arrays.sort(arr);
        System.out.printf("Sorted arr[] = %s",Arrays.toString(arr));

        System.out.println();

        System.out.println("Sort(2)");
        int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        Arrays.sort(array);
        System.out.printf("Sorted array[] = %s",Arrays.toString(array));

    }
}