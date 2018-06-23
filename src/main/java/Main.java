public class Main {

    public static void main(String[] args) {
        Player sam = new Player();
        Player dealer = new Player();
        Game game1 = new Game(dealer, sam);
        game1.deal(dealer);
        game1.deal(sam);
        System.out.println(sam.scoreHand());
        System.out.println(dealer.scoreHand());
    }
}


