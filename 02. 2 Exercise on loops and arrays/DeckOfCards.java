/* *****************************************************************************
 *  Name:              Miklós Szilas
 *  Email:             szilas.miklos@gmail.com
 *  Last modified:     15/04/2020
 *  Program:           DeckOfCards.java
 *  Description:       Creates a deck of cards.
 **************************************************************************** */

public class DeckOfCards {


    public static void main(String[] args) {

        String rank[] = {
                "2 ", "3 ", "4 ", "5 ", "6 ", "7 ", "8 ", "9 ", "10 ", "Jack ", "Queen ", "King ",
                "Ace "
        }; // 13 ranks
        String suit[] = { "of Clubs", "of Diamonds", "of Hearts", "Spades" }; // 4 suits

        String[] deck = new String[52]; // 52 identical cards in the deck
        for (int suitNo = 0; suitNo < suit.length; suitNo++) {
            for (int rankNo = 0; rankNo < rank.length; rankNo++) {
                deck[rankNo + rank.length * suitNo] = rank[rankNo] + suit[suitNo];
            }
        }
        for (int i = 0; i < deck.length; i++) {
            System.out.print(deck[i] + " ");
            System.out.println();
        }
    }
}
