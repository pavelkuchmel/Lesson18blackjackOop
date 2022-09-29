public class Card {
    private char suit; //масть
    private String rank; //значение

    public Card(){}

    public Card(char suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int getRank() {
        int result = 0;
        switch (rank){
            case "A":
                result = 1;
                break;
            case "2":
                result = 2;
                break;
            case "3":
                result = 3;
                break;
            case "4":
                result = 4;
                break;
            case "5":
                result = 5;
                break;
            case "6":
                result = 6;
                break;
            case "7":
                result = 7;
                break;
            case "8":
                result = 8;
                break;
            case "9":
                result = 9;
                break;
            default: result = 10;
        }
        /*if (rank.equals("A"))result = 1;
        else if (rank.equals("2"))result = 2;
        else if (rank.equals("3"))result = 3;
        else if (rank.equals("4"))result = 4;
        else if (rank.equals("5"))result = 5;
        else if (rank.equals("6"))result = 6;
        else if (rank.equals("7"))result = 7;
        else if (rank.equals("8"))result = 8;
        else if (rank.equals("9"))result = 9;
        else if (rank.equals("10"))result = 10;
        else if (rank.equals("J"))result = 10;
        else if (rank.equals("Q"))result = 10;
        else if (rank.equals("K"))result = 10;*/
        return result;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return " "+rank+" "+suit+" ";
    }
}
