public class CardLost extends Lost{
    private String CardName;
    private int StudentNumber;

    public CardLost() {
    }
    public CardLost(int lostTime , int number, String message, String CardName, int StudentNumber) {
        super(lostTime, number,"Card", message);
        this.CardName = CardName;
        this.StudentNumber = StudentNumber;
    }

    public String getCardName() {
        return CardName;
    }

    public void setCardName(String cardName) {
        CardName = cardName;
    }

    public int getStudentNumber() {
        return StudentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        StudentNumber = studentNumber;
    }
}
