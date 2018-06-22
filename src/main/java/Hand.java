import java.util.ArrayList;

public class Hand extends ArrayList <Card>{

    Hand(){

    }

    Hand(Card card, Card card1){
        this.add(card);
        this.add(card1);
    }


}