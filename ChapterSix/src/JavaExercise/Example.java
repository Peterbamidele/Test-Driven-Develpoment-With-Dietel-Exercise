package JavaExercise;

public class Example {
    public static int sum(int i1, int i2) {
        int sum = 0;
        for (int i = i1; i <= i2; i++)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("sum from 1 t0 10 is: " + sum(1,10));
        System.out.println("sum from 20 t0 37 is: " + sum(20,37));
        System.out.println("sum from 35 t0 49 is: " + sum(35,49));
        System.out.println("sum from 1 t0 100 is: " + sum(1,100));



    }
}
