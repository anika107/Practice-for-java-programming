
public class Room {
    private String roomNo;

    public Room(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }
    public int getFloorNumber(){
        int v = roomNo.charAt(0) - '0';
        return v;
    }
}
