package hms.check;

public class RoomState {

    private String index;
    private String roomNum;
    private String roomState;
    private String name;
    private String num;
    private String date;
    private String checkInTime;
    private String checkOutTime;

    public RoomState(String index, String roomNum, String roomState, String name, String num, String date, String checkInTime, String checkOutTime) {
        this.index = index;
        this.roomNum = roomNum;
        this.roomState = roomState;
        this.name = name;
        this.num = num;
        this.date = date;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
    }

    public String getIndex() {
        return index;
    }

    public String getRoomNum() {
        return roomNum;
    }

    public String getRoomState() {
        return roomState;
    }

    public String getName() {
        return name;
    }

    public String getNum() {
        return num;
    }

    public String getDate() {
        return date;
    }

    public String getCheckInTime() {
        return checkInTime;
    }

    public String getCheckOutTime() {
        return checkOutTime;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    public void setRoomState(String roomState) {
        this.roomState = roomState;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setCheckInTime(String checkInTime) {
        this.checkInTime = checkInTime;
    }

    public void setCheckOutTime(String checkOutTime) {
        this.checkOutTime = checkOutTime;
    }
}
