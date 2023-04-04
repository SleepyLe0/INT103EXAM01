import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int chooseStart;
        do {
        System.out.println("Welcome to BlackJack!");
        BlackJack game = new BlackJack();
        System.out.println("Dealing hands...");
        game.deal();
        int determine;
        int stay = 0;
            do {
                determine = 0;
                System.out.println("Player hand: " + game.getPlayerScore());
                System.out.println("Player Cards: " + game.getPlayerHand());
                int chooseAgain = 0;
                do {
                    System.out.println("Would you like to Hit or Stay");
                    System.out.println("1 : Hit");
                    System.out.println("2 : Stay");
                    if (game.getPlayerScore() <= 20) {
                        Scanner choice = new Scanner(System.in);
                        System.out.println("Choice: ");
                        int choose = choice.nextInt();
                        switch (choose) {
                            case 1 -> {
                                game.hitPlayer();
                                System.out.println("Player hits!");
                                chooseAgain = 0;
                            }
                            case 2 -> {
                                System.out.println("Player stays!");
                                determine++;
                                chooseAgain = 0;
                                stay++;
                            }
                            default -> {
                                chooseAgain++;
                                System.out.println("Please select only 1 or 2.");
                            }
                        }
                    }else {
                        determine++;
                    }
                } while (chooseAgain > 0);
                if (game.getDealerScore() <= 16) {
                    game.hitDealer();
                    System.out.println("Dealer hits!");
                }else {
                    System.out.println("Dealer stays!");
                    determine++;
                }
                System.out.println("--------------------------------");
            } while (determine < 2);
            System.out.println("Player hand: " + game.getPlayerScore());
            System.out.println("Player Cards: " + game.getPlayerHand());
            System.out.println("--------------------------------");
            System.out.println("Dealer hand: " + game.getDealerScore());
            System.out.println("Dealer Cards: " + game.getDealerHand());
            System.out.println("--------------------------------");
            game.determineWinner();
            int chooseStartAgain = 0;
            System.out.println("--------------------------------");
            do {
                Scanner startAgain = new Scanner(System.in);
                System.out.println("Would you like to play again? Type 1 for yes, 2 for no.");
                chooseStart = startAgain.nextInt();
                if (chooseStart > 2) {
                    chooseStartAgain++;
                    System.out.println("Please select 1 or 2");
                }
            } while (chooseStartAgain > 0);
        } while (chooseStart == 1);
    }
}
