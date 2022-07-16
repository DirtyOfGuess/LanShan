public class BookLost extends Lost{
    public BookLost() {
    }

    public BookLost(int lostTime, int number) {
        super(lostTime, number);
        this.setType("Book");
    }
    public BookLost(int lostTime , int number, String type) {
        super(lostTime,number);
        this.setType("Book");
    }
    public BookLost(int lostTime , int number, String type, String message) {
        super(lostTime, number, message);
        this.setType("Book");
    }

}
