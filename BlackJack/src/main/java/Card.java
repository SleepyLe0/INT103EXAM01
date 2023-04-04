public class Card {

    private final Rank rank;
    private final Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getValue() {
        return rank.value;
    }

    public boolean equals(Object card) {
        return this.rank == ((Rank)card);
    }

    @Override
    public String toString() {
        return String.format("%s of Suit: %s",rank,suit);
    }
}
