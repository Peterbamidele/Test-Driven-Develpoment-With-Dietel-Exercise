package CrapGame;

import java.security.SecureRandom;

public class Crap {
//    You roll two dice. Each die has six faces, which contain one, two, three, four, five and
//    six spots, respectively. After the dice have come to rest, the sum of the spots on the two
//    upward faces is calculated. If the sum is 7 or 11 on the first throw, you win. If the sum
//    is 2, 3 or 12 on the first throw (called “craps”), you lose (i.e., the “house” wins). If the
//    sum is 4, 5, 6, 8, 9 or 10 on the first throw, that sum becomes your “point.” To win,
//    you must continue rolling the dice until you “make your point” (i.e., roll that same
//    point value). You lose by rolling a 7 before making your point.

    private static final SecureRandom randomNumber = new SecureRandom();

    private enum Status {Continue, Won, Lost};

    private static final int Snake_Eyes = 2;
    private static final int Trey = 3;
    private static final int Seven =7;
    private static final int Yo_leven = 11;
    private static final int Box_Cars = 12;

    public static void main(String[] args) {
        int myPoint = 0;
        Status gameStatus;

        int sumOfDice = rollDice();


        switch (sumOfDice) {
            case Seven:
            case Yo_leven:
                gameStatus = Status.Won;
                break;
            case Snake_Eyes:
            case Trey:
            case Box_Cars:
                gameStatus = Status.Lost;
                break;
            default:
                gameStatus = Status.Continue;
                myPoint = sumOfDice;
                System.out.printf("Point is %d%n", myPoint);
                break;
        }

                while (gameStatus == Status.Continue)
                {
                    sumOfDice = rollDice();

                    if (sumOfDice == myPoint)
                        gameStatus = Status.Won;
                    else
                        if (sumOfDice == Seven)
                        gameStatus =Status.Lost;// roll 7 b4 the point
                }
                if (gameStatus == Status.Won)
                    System.out.println("Player Win");
                else
                    System.out.println("Player Loses");

        }
        public static  int rollDice()
        {
            int firstdieThrow = 1 + randomNumber.nextInt(6);
            int seconddieThrow = 1 + randomNumber.nextInt(6);

            int sum = firstdieThrow + seconddieThrow;

            System.out.printf("Player rolled %d + %d = %d%n",firstdieThrow,seconddieThrow,sum);

            return sum;


    }
}
