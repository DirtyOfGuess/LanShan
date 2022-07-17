public class BookLost extends Lost{
    private String BookName;

    public BookLost() {
    }
    public BookLost(int lostTime , int number, String message, String BookName) {
        super(lostTime, number,"Book", message);
        this.BookName = BookName;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }
}
