package hms.hotelservice;

public class Hotelservice {

    private String name;
    private String roomNum;
    private String index;
    private String phone;

    public Hotelservice(String name, String roomNum, String index, String phone) {
        this.name = name;
        this.roomNum = roomNum;
        this.index = index;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String Service) {
        this.phone = Service;
    }
}
