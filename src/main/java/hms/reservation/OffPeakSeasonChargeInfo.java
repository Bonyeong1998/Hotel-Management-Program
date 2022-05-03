package hms.reservation;

public class OffPeakSeasonChargeInfo {
    private String room;
    private String numpeople;
    private String roomcharge;
    private String extracharge;
    private String maxpeople;

    public OffPeakSeasonChargeInfo(String room, String people, String roomcharge, String extracharge, String maxpeople) {
        this.room =room;
        this.numpeople =people;
        this.roomcharge = roomcharge;
        this.extracharge = extracharge;
        this.maxpeople =maxpeople;
    }

    public String getMaxpeople() {
        return maxpeople;
    }

    public void setMaxpeople(String maxpeople) {
        this.maxpeople = maxpeople;
    }
    
    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getNumpeople() {
        return numpeople;
    }

    public void setNumpeople(String numpeople) {
        this.numpeople = numpeople;
    }

    public String getRoomcharge() {
        return roomcharge;
    }

    public void setRoomcharge(String roomcharge) {
        this.roomcharge = roomcharge;
    }

    public String getExtracharge() {
        return extracharge;
    }

    public void setExtracharge(String extracharge) {
        this.extracharge = extracharge;
    }
}
