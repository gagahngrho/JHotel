package jhotel;

public class RoomTidakDitemukanException extends Exception {

    private String room_error;
    private Hotel hotel_error;

    public RoomTidakDitemukanException(Hotel hotel_input, String room_input) {
        super("Kamar dengan nomor ruang ");
        this.room_error = room_input;
        this.hotel_error = hotel_input;
    }


    public String getPesan() {
        return super.getMessage() + hotel_error + "dan dengan nomor kamar" + room_error + "tidak ditemukan.";
    }
}

