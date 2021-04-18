package ArrayExample;

public class Creating_Array {
    public static void main(String[] args) {
//        int[] array = new int[12];
        String[] fruits = {"Apple"," Orange","kiwi","Mango","banana","carrot"};
        // to print out a value in of index in fruit
        System.out.println(fruits[4]  + " Is the element array in fruit 4 ");

        System.out.println();

//      To change a value in the we use this formula
        fruits[2] = "Pineaple";
        System.out.println( fruits[2] + "was change to Kiwi in fruit element");

        System.out.println();
        // printing all fruit content
        System.out.printf("%s%10s%n", "index", "value");
        for (int i = 0; i < fruits.length; i++)
            System.out.printf("%5d%10s%n", i, fruits[i]);


    }
}
