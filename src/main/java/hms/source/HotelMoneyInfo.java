package hms.source;

public class HotelMoneyInfo {

    private String name;
    private String room;
    private String num;
    private String service;
    private String money;
    private String date;
    private String time;
    private String type;

    public HotelMoneyInfo(String name, String room, String num, String service, String money, String date, String time, String type) {
        this.name = name;
        this.room = room;
        this.num = num;
        this.service = service;
        this.money = money;
        this.date = date;
        this.time = time;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
