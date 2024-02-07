package game;

import card.Card;
import card.CardGame;

import java.util.Scanner;

public class Snap extends CardGame {
    private final Scanner SCANNER = new Scanner(System.in);
    private boolean gameIsOver = false;

    public Snap(String name) {
        super(name);
        gameLoop();
    }

    public void gameLoop(){

        shuffleDeck();

        Card topCard = dealCard();
        while(!gameIsOver){

            System.out.println("Top card is\n" + topCard);

            SCANNER.nextLine();
            Card newCard = dealCard();

            System.out.println("Your card is\n" + newCard + "\n");

            if(checkIfSnap(newCard, topCard))
                setGameOver();
            else
                topCard = newCard;
        }
    }

    private void setGameOver(){
        this.gameIsOver = true;
    }

    private boolean checkIfSnap(Card card1, Card card2){

        return card1.getSymbol().equals(card2.getSymbol());
    }

}
