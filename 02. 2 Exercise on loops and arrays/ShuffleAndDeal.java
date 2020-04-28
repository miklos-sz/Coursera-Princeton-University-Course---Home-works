/* *****************************************************************************
 *  Name:              Miklós Szilas
 *  Email:             szilas.miklos@gmail.com
 *  Last modified:     15/04/2020
 *  Program:           ShuffleAndDeal.java
 *  Description:       Creates a deck of cards, shuffles it and deals a hand of
 *                     user-input 'n' cards.
 **************************************************************************** */

public class ShuffleAndDeal {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        String[] rank = {
                "2 ", "3 ", "4 ", "5 ", "6 ", "7 ", "8 ", "9 ", "10 ", "Jack ", "Queen ", "King ",
                "Ace "
        }; // 13 ranks
        String[] suit = { "of Clubs", "of Diamonds", "of Hearts", "Spades" }; // 4 suits

        String[] deck = new String[52]; // 52 identical cards in the deck
        for (int suitNo = 0; suitNo < suit.length; suitNo++) {
            for (int rankNo = 0; rankNo < rank.length; rankNo++) {
                deck[rankNo + rank.length * suitNo] = rank[rankNo] + suit[suitNo];
            }
        }
        // Shuffle the deck & exchanging the values of the arrays
        for (int i = 0; i < 52; i++) {
            int r = i + (int) (Math.random() * (52 - i));
            String t = deck[r];
            deck[r] = deck[i];
            deck[i] = t;
        }
        for (int j = 0; j < n; j++) {
            System.out.print(deck[j]);
            System.out.println();
        }
    }
}
