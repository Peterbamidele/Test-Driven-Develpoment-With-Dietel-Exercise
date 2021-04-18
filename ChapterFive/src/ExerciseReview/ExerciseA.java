package ExerciseReview;

public class ExerciseA{
    public static void main(String[] args) {

        System.out.println("a) Sum the odd integers between 1 and 99, using a for statement. Assume that the integer\n" +
                "variables sum and count have been declared.");
        int sum = 0;
        for (int count = 1; count < 99; count += 2) {
            sum += count;
            System.out.println(sum);
        }
        System.out.println();

        System.out.println("b) Calculate the value of 2.5 raised to the power of 3 , using the pow method.");
        double result =Math.pow(2.5, 3);


        System.out.println("c) Print the integers from 1 to 20, using a while loop and the counter variable i . Assume\n" +
                "that the variable i has been declared, but not initialized. Print only five integers per line.\n" +
                "[Hint: Use the calculation i % 5 . When the value of this expression is 0, print a newline\n" +
                "character; otherwise, print a tab character. Assume that this code is an application. Use\n" +
                "the System.out.println() method to output the newline character, and use the Sys-\n" +
                "tem.out.print('\\t' ) method to output the tab character.]");
        int i = 1;

        while (i <= 20)
        {
            System.out.println(i);
            if (i % 5 == 0)
                System.out.println();
            else
                System.out.println('\t');
            ++i;
        }
        System.out.println();

        System.out.println("d) Repeat part (c), using a for statement.");
        for (int x = 0; x <= 20; x++) {
            System.out.println(x);

            if (x % 5 ==0)
                System.out.println();
            else
                System.out.println('\t');

        }


    }

}
