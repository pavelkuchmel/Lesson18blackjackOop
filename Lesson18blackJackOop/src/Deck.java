import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    private final int suitSize = 13;
    private final int deckSize = 52;
    private ArrayList<Card> deck;

    public Deck(){
        deck = new ArrayList<>();
        init();
        shuffle();
    }

    private void init(){
        char[] suit = {'\u2661', '\u2662', '\u2664', '\u2667'};
        for (int i = 0; i < suit.length; i++){
            initSuit(suit[i]);
        }
    }

    private void initSuit(char suit){
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        for (int i = 0; i < suitSize; i++){
            deck.add(new Card(suit, ranks[i]));
        }
    }

    private void shuffle(){
        Random rdm = new Random();
        for (int i = 0; i < deck.size() - 1; i++) {
            int randomIndex = rdm.nextInt(deckSize - i - 1) + i + 1;
            Collections.swap(deck, i, randomIndex);
        }
    }

    public Card sendCard(){
        Card c = deck.get(deck.size() - 1);
        deck.remove(deck.size() - 1);
        return c;
    }

    @Override
    public String toString() {
        return deck.toString();
    }


}
