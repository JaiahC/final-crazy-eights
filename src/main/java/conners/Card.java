package conners;


public class Card {
    private CardRank rank;
    private CardSuit suit;

    public CardRank getRank() {
        return rank;
    }

    public CardSuit getSuit() {
        return suit;
    }

    public boolean isValid() {
        if (suit != null) {
            return true;
        }
        return false;
    }

    public boolean equals(Card card) {
        boolean equals = false;
        if ((card.getSuit()==suit) && (card.getRank()==rank)) {
            equals = true;
        }
        return equals;
    }

    public boolean isGreaterThan(Card card) {
        CardSuit cardSuit = card.getSuit();
        CardRank cardRank = card.getRank();

        if (suit.getValue() > card.getSuit().getValue()) {
            return true;
        }
        if ((suit == cardSuit) && (rank.getValue() > card.getRank().getValue())) {
                return true;
        }
        return false;
    }

    public static boolean isValidSuit(String suit) {
        boolean valid = false;
        if (SUITS.indexOf(c) > -1) {
            valid = true;
        }
        return valid;
    }

    public Card (String rs) {
        if (rs.length() == 2) {
            char r = rs.charAt(0);
            char s = rs.charAt(1);
            int ri = RANKS.indexOf(r);
            int si = SUITS.indexOf(s);
            if (ri > -1 && si > -1) {
                rank = r;
                suit = s;
            }
        }
        rank = rs.charAt(0);
        suit = rs.charAt(1);
    }

    public Card (int id) {
        id = id % 52;
        if (id < 0) {
            id = id * -1;
        }
        int res = id%13;
        rank = RANKS[res];
        suit = SUITS.charAt((int)Math.floor(id/13));
    }

    public String toString() {
        String rs = "" + rank + suit;
        return rs;
    }
}

