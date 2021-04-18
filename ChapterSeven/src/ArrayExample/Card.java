package ArrayExample;

import java.security.SecureRandom;

public class Card {
    private final String face;
    private final String suit;

    public Card(String cardface, String cardSuit) {
        this.face = cardface;
        this.suit = cardSuit;
    }

    public String toString() {
        return  face + " of " + suit;
    }


    public static class DeskOfCards {
        private Card[] deck;
        private int currentCard;
        private static final int NUMBER_OF_CARDS = 52;//constant of cards
        private static final SecureRandom randomNumbers = new SecureRandom();

        // constructor fills deck of Cards
        public DeskOfCards()
        {
            String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
                    "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };

            String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

            deck = new Card[NUMBER_OF_CARDS];
            currentCard = 0;

            for (int count = 0; count < deck.length; count++)
                deck[count]= new Card(faces[count % 13], suits[count / 13]);
        }

        public void shuffle()
        {
            currentCard = 0;

            for (int first = 0; first < deck.length; first++)
            {
                int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
                Card temp = deck[first];
                deck[first]=deck[second];
                deck[second] = temp;

            }
        }

        public Card dealCard()
        {
            if (currentCard < deck.length)
                return deck[currentCard++];
            else
                return null;
        }

    }

    public static void main(String[] args) {
        ArrayExample.DeskOfCards myDeskOfCards = new ArrayExample.DeskOfCards();
        myDeskOfCards.shuffle();
        for (int i = 1; i < 52; i++) {
            System.out.printf("%-19s",myDeskOfCards.dealCard());

            if (i % 2==0)
                System.out.println();

        }
    }

}

