package jhotel;
/**
 * class Customer untuk memodelkan Customer.
 *
 * @author Anggoro Gagah Nugroho
 * @version 29/5/2018
 */
public class RoomTidakDitemukanException extends Exception{
    private String room_error;
    private Hotel hotel_error;
    /**
     * constructor untuk kelas RoomTidakDitemukanException
     *
     * @param hotel_input objek Hotel
     * @param room_input objek Room
     */
    public RoomTidakDitemukanException(Hotel hotel_input, String room_input){
        super("Kamar yang terletak di : ");
        room_error = room_input;
        hotel_error = hotel_input;
    }
    /**
     * mendapatkan pesan error untuk exception
     *
     * @return string
     */
    public String getPesan(){
        return super.getMessage() + hotel_error + " dan dengan nomor kamar " + room_error + " tidak ditemukan.";
    }
}
