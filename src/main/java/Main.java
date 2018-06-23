public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffleDeck();
        Player sam = new Player();
        Player dealer = new Player();
        sam.pickCard(deck); sam.pickCard(deck);
        dealer.pickCard(deck); dealer.pickCard(deck);
        System.out.println(sam.scoreHand());
        System.out.println(dealer.scoreHand());
    }
}


