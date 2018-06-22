import java.util.ArrayList;

public class Player {

    private Hand cards = new Hand();

    Player(){
    }

    Player(Hand hand){
        cards = hand;
    }

    public void pickCard(Deck deck){
        cards.add(deck.getCards().get(0));
    }

    public ArrayList<Card> getHand() {
        return cards;
    }
}
