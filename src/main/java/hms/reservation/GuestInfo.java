package hms.reservation;

public class GuestInfo {

    private String code;
    private String name;
    private String roomnum;
    private String InYear;
    private String InMonth;
    private String InDay;
    private String OutYear;
    private String OutMonth;
    private String OutDay;
    private String guestnum;
    private String phone;
    private String address;
    private String cardtype;
    private String cardnum;
    private String expriymonth;
    private String expriyear;
    private String guarantee;
    private String money;

    public GuestInfo(String code, String name, String roomnum, String InYear, String InMonth, String InDay,
            String OutYear, String OutMonth, String OutDay, String guestnum, String phone, String address,
            String cardtype, String cardnum, String expriymonth, String expriyear, String guarantee, String money) {
        this.code = code;
        this.name = name;
        this.roomnum = roomnum;
        this.InYear = InYear;
        this.InMonth = InMonth;
        this.InDay = InDay;
        this.OutYear = OutYear;
        this.OutMonth = OutMonth;
        this.OutDay = OutDay;
        this.guestnum = guestnum;
        this.phone = phone;
        this.address = address;
        this.cardtype = cardtype;
        this.cardnum = cardnum;
        this.expriymonth = expriymonth;
        this.expriyear = expriyear;
        this.guarantee = guarantee;
        this.money = money;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getCode() {
        return code;
    }

    public String getInYear() {
        return InYear;
    }

    public String getInMonth() {
        return InMonth;
    }

    public String getInDay() {
        return InDay;
    }

    public String getOutYear() {
        return OutYear;
    }

    public String getOutMonth() {
        return OutMonth;
    }

    public String getOutDay() {
        return OutDay;
    }

    public void setInYear(String InYear) {
        this.InYear = InYear;
    }

    public void setInMonth(String InMonth) {
        this.InMonth = InMonth;
    }

    public void setInDay(String InDay) {
        this.InDay = InDay;
    }

    public void setOutYear(String OutYear) {
        this.OutYear = OutYear;
    }

    public void setOutMonth(String OutMonth) {
        this.OutMonth = OutMonth;
    }

    public void setOutDay(String OutDay) {
        this.OutDay = OutDay;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoomnum() {
        return roomnum;
    }

    public void setRoomnum(String roomnum) {
        this.roomnum = roomnum;
    }

    public String getGuestnum() {
        return guestnum;
    }

    public void setGuestnum(String guestnum) {
        this.guestnum = guestnum;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCardtype() {
        return cardtype;
    }

    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    public String getCardnum() {
        return cardnum;
    }

    public void setCardnum(String cardnum) {
        this.cardnum = cardnum;
    }

    public String getExpriymonth() {
        return expriymonth;
    }

    public void setExpriymonth(String expriymonth) {
        this.expriymonth = expriymonth;
    }

    public String getExpriyear() {
        return expriyear;
    }

    public void setExpriyear(String expriyear) {
        this.expriyear = expriyear;
    }

    public String getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(String guarantee) {
        this.guarantee = guarantee;
    }
}
