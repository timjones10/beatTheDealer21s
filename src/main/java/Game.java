public class Game {

    private Player player1;
    private Player player2;
    private Deck deck;

    Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.deck = new Deck();
        deck.shuffleDeck();
    }

    public void deal(Player player) {
        player.pickCard(deck);
    }


    public Boolean checkBlackJack(Player player) {
        if (player.scoreHand() == 21) {
            return true;
        } else {
            return false;
        }
    }

    public String checkScore() {
        if (checkBlackJack(player1) && checkBlackJack(player2)){
            return "Game Over. Both Players have Blackjack";
        }
        if (checkBlackJack(player1)) {
            return "Game Over. Player 1 wins with Blackjack";
        }
        if (checkBlackJack(player2)) {
            return "Game Over. Player 2 wins with Blackjack";
        } else return "Player 1 draw a card";
    }
}
