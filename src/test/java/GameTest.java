import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GameTest {

    @Mock
    Player playerMock1;
    @Mock
    Player playerMock2;

    Game testGame;

    @Before
    public void setUp() {
        testGame = new Game(playerMock1, playerMock2);
    }

    @Test
    public void dealSeePlayerPickCardMethodCalled(){
        testGame.deal(playerMock1);
        verify(playerMock1, times(1)).pickCard(any(Deck.class));
    }

    @Test
    public void checkBlackJackReturnsTrueIfPlayerHas21(){
    when(playerMock1.scoreHand()).thenReturn(21);
        assertTrue(testGame.checkBlackJack(playerMock1));
    }

    @Test
    public void checkScoreEndGameIfEitherPlayerHas21(){
        when(playerMock1.scoreHand()).thenReturn(21);
        when(playerMock2.scoreHand()).thenReturn(19);
        assertEquals(testGame.checkScore(), "Game Over. Player 1 wins with Blackjack");
    }

}