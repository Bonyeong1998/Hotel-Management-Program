package hms.reservation;

public class PeakSeasonChargeInfo {
    private int room;
    private String numpeople;
    private String roomcharge;
    private String extracharge;
    private String maxpeople;

    public PeakSeasonChargeInfo(int room, String people, String roomcharge, String extracharge, String maxpeople) {
        this.room =room;
        this.numpeople =people;
        this.roomcharge = roomcharge;
        this.extracharge = extracharge;
        this.maxpeople =maxpeople;
    }

    public String getMaxpeople() {
        return this.maxpeople;
    }

    public void setMaxpeople(String maxpeople) {
        this.maxpeople = maxpeople;
    }
    
    public int getRoom() {
        return this.room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getNumpeople() {
        return this.numpeople;
    }

    public void setNumpeople(String numpeople) {
        this.numpeople = numpeople;
    }

    public String getRoomcharge() {
        return this.roomcharge;
    }

    public void setRoomcharge(String roomcharge) {
        this.roomcharge = roomcharge;
    }

    public String getExtracharge() {
        return this.extracharge;
    }

    public void setExtracharge(String extracharge) {
        this.extracharge = extracharge;
    }
}
