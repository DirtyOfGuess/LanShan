import java.util.Date;

public class Lost {

    //失物丢失日期
    private int lostTime;
    //失物编号
    private int number;
    //失物种类
    private String type;
    //拾取地点
    private String message;

    public Lost() {
    }
    public Lost(int lostTime , int number, String type, String message) {
        this.lostTime = lostTime;
        this.number = number;
        this.type = type;
        this.message = message;
    }


    public int getLostTime() {
        return lostTime;
    }

    public void setLostTime(int lostTime) {
        this.lostTime = lostTime;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

