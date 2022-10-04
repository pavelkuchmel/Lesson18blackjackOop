import java.util.ArrayList;

public abstract class Hand {
    protected ArrayList<Card> hand;
    //protected String name;

    public Hand(){
        hand = new ArrayList<>();
    }

    public int countScore(){
        //TODO сделать, что бы туз давал или 1 или 11
        int score = 0;
        for (Card card:hand){
            score += card.getRank();
        }
        return score;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < hand.size(); i++){
            result += hand.get(i).toString();
        }
        return result;
    }
    public abstract void play(Deck deck) throws InterruptedException;
    public void takeOneCard(Deck deck){
        hand.add(deck.sendCard());
    }
}
