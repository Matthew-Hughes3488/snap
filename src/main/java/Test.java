import Card.CardGame;

public class Test {
    public static void main(String[] args) {
        CardGame cardGame = new CardGame("test");
        cardGame.shuffleDeck();
        cardGame.getDeck();
    }
}
