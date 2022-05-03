
package hms.source;

public class AllServiceInfo {
    private String name;
    private String room;
    private String guestnum;
    private String servicekind;
    private String serviceprice;
    private String bookingdate;
    private String bookingtime;
    private String type;

    public AllServiceInfo(String name, String room, String guestnum, String servicekind, String serviceprice, String bookingdate, String bookingtime, String type){
        this.name = name;
        this.room = room;
        this.guestnum = guestnum;
        this.servicekind = servicekind;
        this.serviceprice = serviceprice;
        this.bookingdate = bookingdate;
        this.bookingtime = bookingtime;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getGuestnum() {
        return guestnum;
    }

    public void setGuestnum(String guestnum) {
        this.guestnum = guestnum;
    }

    public String getServicekind() {
        return servicekind;
    }

    public void setServicekind(String servicekind) {
        this.servicekind = servicekind;
    }

    public String getServiceprice() {
        return serviceprice;
    }

    public void setServiceprice(String serviceprice) {
        this.serviceprice = serviceprice;
    }

    public String getBookingdate() {
        return bookingdate;
    }

    public void setBookingdate(String bookingdate) {
        this.bookingdate = bookingdate;
    }

    public String getBookingtime() {
        return bookingtime;
    }

    public void setBookingtime(String bookingtime) {
        this.bookingtime = bookingtime;
    }
}
