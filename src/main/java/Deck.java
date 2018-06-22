import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards = new ArrayList<>();

    Deck(){
        for (int s = 0; s < 4; s++){
            for (int t = 0; t < 13; t++){
                cards.add(new Card(t,s));
            }
        }
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void shuffleDeck() {
        Collections.shuffle(cards);
    }

}
