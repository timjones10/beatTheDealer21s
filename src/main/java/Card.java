public class Card {

    private int type;
    private int suit;

    private String[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
    private String[] types = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "Jack", "Queen", "King", "Ace"};

    Card(int type, int suit){
        this.suit = suit;
        this.type = type;
    }

    public @Override String toString(){
        return types[type] + " of " + suits[suit];
    }

    public int getType() {
        return type;
    }

    public String getTypeAsString() {
        return types[type];
    }

    public int getSuit() {
        return suit;
    }

    public String getSuitAsString() {
        return suits[suit];
    }
}
