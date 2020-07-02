import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

enum Suit {
    DIAMOND, CLUB, HEART, SPADE;
}

enum Rank {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;
}

class Card {  // A card

    private Suit suit;
    private Rank rank;

    Card(Suit suit, Rank rank) {   // constructor
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public int getValue() {
        return rank.ordinal() + 1;
    }  // 1 to 13

    public String toString() {
        return suit + "-" + rank;
    }
}

class CardDeck {  // A deck of card

    List<Card> deck;

    CardDeck() {   // constructor
        deck = new ArrayList<>();   // JDK 7 type inference
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                deck.add(new Card(suit, rank));
            }
        }
    }

    public void print() {
        System.out.println(deck);
    }

    public void shuffle() {
        // use Collections' static method to shuffle the List in place
        Collections.shuffle(deck);
    }
}

public class CardGame {

    public static void main(String[] args) {
        CardDeck deck = new CardDeck();
        deck.print();
        deck.shuffle();
        deck.print();
    }
}
