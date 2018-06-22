
import org.junit.Test;

import static org.junit.Assert.*;

public class DeckTest {

    @Test
    public void newDeckHas52Cards(){
        Deck deck = new Deck();
        assertEquals(deck.getCards().size(), 52);
    }

    @Test
    public void shuffleDeckChangesOrderOfCards(){
        Deck deck1 = new Deck();
        Deck deck2 = new Deck();
        deck2.shuffleDeck();
        assertNotEquals(deck1.getCards().get(0).toString(), deck2.getCards().get(0).toString());
    }

}