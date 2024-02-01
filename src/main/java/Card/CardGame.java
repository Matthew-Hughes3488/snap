package Card;

import java.util.ArrayList;
import java.util.List;

public class CardGame {
    private static final String[] SUITS = {"heart", "club", "diamond", "spade"};
    private static final String[] SYMBOLS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private static final int[] VALUES = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    private final String name;
    private final List<Card> deck;

    public CardGame(String name){
        this.name = name;
        this.deck = initzaliseDeck();
    }

    private List<Card> initzaliseDeck(){
        List<Card> newDeck = new ArrayList<>();
        for (int i = 0; i < SUITS.length; i++) {
            for (int j = 0; j < SYMBOLS.length; j++) {
                newDeck.add(new Card(SUITS[i], SYMBOLS[j], VALUES[j]));
            }
        }
       return newDeck;
    }
}
