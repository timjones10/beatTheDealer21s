import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HandScorerTest {

    @Before
    public void setUp(){

    }

    @Test
    public void scoreMethodCalculatesScoreOfInitialPair() {
        Deck deck = new Deck();
        deck.shuffleDeck();
        Card card = new Card(1,0);
        Card card1 = new Card(2,1);
        Hand hand = new Hand(card, card1);
        Player dealer = new Player(hand);
        HandScorer handScorer = new HandScorer();
        assertEquals(5, handScorer.scoreHand(dealer));
    }

}