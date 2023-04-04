import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class Deck {

    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<Card>();
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    public List<Card> getCards() {
        return cards;
    }

    public int size() {
        return cards.size();
    }

    public Card draw() {
        Card card = cards.get(0);
        cards.remove(0);
        return card;
    }

    public List<Card> draw(int count) {
        List<Card> drawCard = new ArrayList<Card>();
        for (int i = 0; i < count; i++) {
            drawCard.add(cards.get(i));
            cards.remove(i);
        }
        return drawCard;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public List<Card> getCardByRank(Card card) {
        return cards.stream().filter(s -> s.getRank().equals(card.getRank())).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return String.format("Deck: %s",cards);
    }
}
