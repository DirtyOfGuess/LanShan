public class CardLost extends Lost{
    public CardLost() {
    }
    public CardLost(int lostTime, int number) {
        super(lostTime, number);
        this.setType("Card");
    }
    public CardLost(int lostTime , int number, String type) {
        super(lostTime,number);
        this.setType("Card");
    }
    public CardLost(int lostTime , int number, String type, String message) {
        super(lostTime, number, message);
        this.setType("Card");
    }
}
