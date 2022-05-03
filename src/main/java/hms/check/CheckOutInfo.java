package hms.check;

public class CheckOutInfo {

    private String index;
    private String room;
    private String state;
    private String name;
    private String guestnum;
    private String date;
    private String checkintime;
    private String checkouttime;
    private String checkoutreal;

    public CheckOutInfo(String name, String room, String guestnum, String state, String checkouttime, String checkoutreal, String date) {
        this.room = room;
        this.state = state;
        this.name = name;
        this.checkouttime = checkouttime;
        this.checkoutreal = checkoutreal;
        this.date = date;
        this.guestnum = guestnum;
    }

    public CheckOutInfo(String index, String room, String state, String name, String guestnum, String date, String checkintime, String checkouttime) {
        this.index = index;
        this.room = room;
        this.state = state;
        this.name = name;
        this.guestnum = guestnum;
        this.date = date;
        this.checkintime = checkintime;
        this.checkouttime = checkouttime;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGuestnum() {
        return guestnum;
    }

    public void setGuestnum(String guestnum) {
        this.guestnum = guestnum;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCheckintime() {
        return checkintime;
    }

    public void setCheckintime(String checkintime) {
        this.checkintime = checkintime;
    }

    public String getCheckouttime() {
        return checkouttime;
    }

    public void setCheckouttime(String checkouttime) {
        this.checkouttime = checkouttime;
    }

    public String getCheckoutreal() {
        return checkoutreal;
    }

    public void setCheckoutreal(String checkoutreal) {
        this.checkoutreal = checkoutreal;
    }
}
