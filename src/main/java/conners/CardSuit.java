package conners;

public enum CardSuit {
    CLUBS(1, "C"),
    DIAMONDS(2, "D"),
    HEARTS(3, "H"),
    SPADES(4, "S");

    public int getValue() {
        return value;
    }

    private final int value;

    public String getAbbreviation() {
        return abbreviation;
    }

    private final String abbreviation;

    CardSuit(int value, String abbreviation){
        this.value = value;
        this.abbreviation = abbreviation;
    }

    public static CardSuit getSuitByAbbreviation(String abbreviation){
        for (CardSuit suit: CardSuit.values()){
            if(abbreviation == suit.getAbbreviation()){
                return suit;
            }
        }
        return null;
    }
}
