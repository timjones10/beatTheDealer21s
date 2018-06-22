import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void PlayerPickCardsAddsTwoCardstoHand(){
        Deck deck = new Deck();
        deck.shuffleDeck();
        Hand hand = new Hand();
        Player dealer = new Player(hand);
        dealer.pickCard(deck);
        assertEquals(1, dealer.getHand().size());
    }

}