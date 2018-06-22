import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {

    @Test
    public void showCardShowsValueOfCard() {
        Card card = new Card(0,0);
        assertEquals("1 of Hearts", card.toString());
    }

}