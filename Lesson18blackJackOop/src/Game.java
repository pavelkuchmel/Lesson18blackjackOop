import java.util.Scanner;

public class Game {
    private Deck deck;
    private Dealer dealer;
    private Player player;
    private int dWins = 0;
    private int pWins = 0;
    private int draw = 0;
    private char answer = 'y';
    Scanner in = new Scanner(System.in);

    public Game(){}

    public void play() throws InterruptedException {
        do {
            dealer = new Dealer();
            deck = new Deck();
            player = new Player();
            player.play(deck);
            //проверка как сыграл player
            if (player.countScore() == 21) {
                System.out.println("Player wins!");
                pWins++;
                System.out.print("Repeat game?\nY/or other: ");
                answer = in.nextLine().charAt(0);
                continue;
            } else if (player.countScore() > 21) {
                System.out.println("Player loses!");
                System.out.print("Repeat game?\nY/or other: ");
                answer = in.nextLine().charAt(0);
                continue;
            }
            Dealer dealer = new Dealer();
            dealer.play(deck);
            //проверка как сыграл dealer
            if (dealer.countScore() == 21) {
                System.out.println("Dealer wins!");
                dWins++;
            } else if (dealer.countScore() > 21) {
                System.out.println("Dealer loses!");
            } else if (dealer.countScore() > player.countScore()) {
                System.out.println("Dealer wins!");
                dWins++;
            } else if (dealer.countScore() < player.countScore()) {
                System.out.println("Player wins!");
                pWins++;
            } else if (dealer.countScore() < player.countScore()) {
                System.out.println("Draw");
                draw++;
            }
            System.out.print("Repeat game?\nY/or other: ");
            answer = in.nextLine().charAt(0);
        }while (answer == 'y');
        System.out.println("Dealer won: " + dWins + "\nPlayer won: " + pWins + "\nDraw: " + draw);
    }
}
