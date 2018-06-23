import java.util.ArrayList;

public class Player {

    private Hand cards = new Hand();
    private HandScorer scorer = new HandScorer();

    Player(){
    }

    Player(Hand hand){
        cards = hand;
    }

    public void pickCard(Deck deck){
        cards.add(deck.getCards().get(0));
        deck.getCards().remove(0);
    }

    public ArrayList<Card> getHand() {
        return cards;
    }

    public int scoreHand(){
        return scorer.scoreHand(cards);
    }
}
