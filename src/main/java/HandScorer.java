public class HandScorer {

    private int handScore;

    public int scoreHand(Hand cards) {
        int cardScore;
        int numberOfCards = cards.size();
        for (int c = 0; c < numberOfCards; c++) {
            int cardType = cards.get(c).getType();
            cardScore = scoreCard(cardType);
            handScore = handScore + cardScore;
        }
        return handScore;
    }

    private int scoreCard(int cardType) {
        if(cardType <= 8){
            return cardType + 1;
        } else if (cardType < 13) {
            return 10;
        } else return 11;
    }


}
