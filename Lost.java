public class Lost {

    //失物丢失时长
    private double lostTime;
    //失物编号
    private int number;
    //失物种类
    private String type;
    //补充物主信息
    private String message;

    public Lost() {
    }
    public Lost(int lostTime , int number) {
        this.lostTime = lostTime;
        this.number = number;
    }
    public Lost(int lostTime , int number, String type) {
        this.lostTime = lostTime;
        this.number = number;
        this.type = type;
    }
    public Lost(int lostTime , int number, String type, String message) {
        this.lostTime = lostTime;
        this.number = number;
        this.type = type;
        this.message = message;
    }


    public double getLostTime() {
        return lostTime;
    }

    public void setLostTime(double lostTime) {
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

