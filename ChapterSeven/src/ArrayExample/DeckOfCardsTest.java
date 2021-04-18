package ArrayExample;

public class DeckOfCardsTest {
    public static void main(String[] args) {
        DeskOfCards myDeskOfCards = new DeskOfCards();
        myDeskOfCards.shuffle();
        for (int i = 1; i < 52; i++) {
            System.out.printf("%-19s",myDeskOfCards.dealCard());

            if (i % 4==0)
                System.out.println();

        }
    }
}
