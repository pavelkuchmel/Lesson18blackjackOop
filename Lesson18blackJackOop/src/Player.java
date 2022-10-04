import java.util.Scanner;

public class Player extends Hand{

    @Override
    public void play(Deck deck) {
        Scanner in = new Scanner(System.in);
        char answer = 'y';
        takeOneCard(deck);
        takeOneCard(deck);
        while (countScore() < 21 && answer == 'y'){
            System.out.println("Your hand: " + hand + " your score: " + countScore());
            System.out.print("Do you want another card? (y/n): ");
            answer = in.nextLine().charAt(0);
            if (answer == 'y'){
                takeOneCard(deck);
            }
        }
        System.out.println("Your hand: " + hand + " your score: " + countScore());
    }
}
