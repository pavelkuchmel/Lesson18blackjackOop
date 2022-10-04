public class Dealer extends Hand{

    @Override
    public void play(Deck deck) throws InterruptedException {
        takeOneCard(deck);
        takeOneCard(deck);
        while (countScore() < 17){
            System.out.println("Dealer hand: " + hand + " dealer score: " + countScore());
                takeOneCard(deck);
                Thread.sleep(1000);
        }
        System.out.println("Dealer hand: " + hand + " dealer score: " + countScore());
    }
}
