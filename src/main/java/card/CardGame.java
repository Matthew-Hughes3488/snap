package card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CardGame {
    private static final String[] SUITS = {"♥", "♣", "♦", "♠"};
    private static final String[] SYMBOLS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private static final int[] VALUES = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    private final String name;
    private List<Card> deck;

    public CardGame(String name){
        this.name = name;
        this.deck = initzaliseDeck();
    }

    public void getDeck(){
        deck.forEach(card -> System.out.println(card));
    }

    public Card dealCard(){
        return deck.remove(0);
    }

    public void sortDeckInNumberOrder(){
        this.deck = deck.stream()
                .sorted((a, b) -> a.getValue() - b.getValue())
                .collect(Collectors.toList());
    }

    public void sortDeckIntoSuits(){
        this.deck = deck.stream()
                .sorted((a, b) -> a.getSuit().compareTo(b.getSuit()))
                .collect(Collectors.toList());
    }

    public void shuffleDeck(){
        Collections.shuffle(deck);
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
