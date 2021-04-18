package Two_Deminision_Array;

public class Creating_2D_Array {
    public static void main(String[] args) {
        int[][] myNumber = {{1,2,3,4,5,6},{7,8,9,10}};
        int a = myNumber[1][3];
        System.out.println(a);

        System.out.println();
        //Updating an element
        myNumber[0][4] = 100;
        System.out.println(a);
    }


}
