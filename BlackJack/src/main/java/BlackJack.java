import java.util.ArrayList;
import java.util.List;

public class BlackJack {
    private final Deck deck;
    private List<Card> playerHand;
    private List<Card> dealerHand;

    public BlackJack() {
        this.deck = new Deck();
        deck.shuffle();
        playerHand = new ArrayList<Card>();
        dealerHand = new ArrayList<Card>();
    }

    public void deal() {
        playerHand.add(deck.draw());
        dealerHand.add(deck.draw());
        playerHand.add(deck.draw());
        dealerHand.add(deck.draw());
    }

    public List<Card> getPlayerHand() {
        return playerHand;
    }

    public List<Card> getDealerHand() {
        return dealerHand;
    }

    public void printPlayerHand() {
        System.out.println(playerHand);
    }

    public void printDealerHand() {
        System.out.println(dealerHand);
    }

    public void hitPlayer() {
        playerHand.add(deck.draw());
    }

    public void hitDealer() {
        dealerHand.add(deck.draw());
    }

    public int getPlayerScore() {
        int score = 0;
        for (Card card : playerHand) {
            score += card.getValue();
        }
        return score;
    }

    public int getDealerScore() {
        int score = 0;
        for (Card card : dealerHand) {
            score += card.getValue();
        }
        return score;
    }

    public void determineWinner() {
        int playerScore = 0;
        int dealerScore = 0;
        for (Card card : playerHand) {
            playerScore += card.getValue();
        }
        for (Card card : dealerHand) {
            dealerScore += card.getValue();
        }
        if (playerScore > dealerScore) {
            if (playerScore > 21 && dealerScore <= 21) {
                System.out.println("Player bust!");
                System.out.println("Dealer wins!");
            }else if (playerScore <= 21) {
                System.out.println("Player wins!");
                System.out.println("Dealer bust!");
            }else {
                System.out.println("Draw!");
            }
        }else if (dealerScore > playerScore) {
            if (dealerScore > 21 && playerScore <= 21) {
                System.out.println("Player wins!");
                System.out.println("Dealer bust!");
            }else if (dealerScore <= 21) {
                System.out.println("Player bust!");
                System.out.println("Dealer wins!");
            }else {
                System.out.println("Draw!");
            }
        }else {
            System.out.println("Draw!");
        }
    }

    public void viewDeck() {
        System.out.println(deck);
    }
}
