package jhotel;
import java.util.ArrayList;
/**
 * Ini merupakan class untuk database hotel
 *
 * @author Anggoro Gagah Nugroho
 * @version 29/5/2018
 */
public class DatabaseHotel
{
    //Bagian disini menunjukan Variabel-variabel pada class
    private static ArrayList<Hotel> HOTEL_DATABASE = new ArrayList<>();
    private static int LAST_HOTEL_ID = 0;

    /**
     * method untuk membuat arraylist berisi hotel
     *
     * @return HOTEL_DATABASE
     */
    public static ArrayList<Hotel> getHotelDatabase() {

        return HOTEL_DATABASE;
    }

    /**
     * untuk mendapatkan ID dari hotel terakhir
     *
     * @return LAST_HOTEL_ID
     */

    public static int getLastHotelID() {
        return LAST_HOTEL_ID;
    }

    /**
     * Merupakan metode yang akan digunakan pada link database
     * dengan Room untuk menambah Rooom kepada database
     */
    public static boolean addHotel(Hotel baru) throws HotelSudahAdaException{
        for (Hotel hotel :
                HOTEL_DATABASE) {
            if(hotel.getID() == baru.getID() || ((hotel.getLokasi().getX() == baru.getLokasi().getX() && hotel.getLokasi().getY() == baru.getLokasi().getY()) && (hotel.getLokasi().getDeskripsi().compareTo(baru.getLokasi().getDeskripsi()) == 0)  && hotel.getNama().compareTo(baru.getNama())==0)){
                throw new HotelSudahAdaException(hotel);
            }
        }
        HOTEL_DATABASE.add(baru);
        LAST_HOTEL_ID = baru.getID();
        return true;
    }
    /**
     * untuk mendapatkan hotel dengan id yang ditentukan
     *
     * @param id menentukan id hotel
     * @return hotel
     */
    public static Hotel getHotel(int id){
        for (Hotel hotel :
                HOTEL_DATABASE) {
            if (hotel.getID() == id) return hotel;
        }
        return null;
    }
    /**
     * Merupakan metode yang akan digunakan pada link database
     * dengan Room untuk menghapus Room kepada database
     */
    public static boolean removeHotel(int id) throws HotelTidakDitemukanException {
        for (Hotel hotel :
                HOTEL_DATABASE) {
            if(hotel.getID()==id){
                for (Room kamar :
                        DatabaseRoom.getRoomsFromHotel(hotel)) {
                    try{
                        DatabaseRoom.removeRoom(hotel, kamar.getNomorKamar());
                    }
                    catch(RoomTidakDitemukanException e){

                    }
                }
                HOTEL_DATABASE.remove(hotel);
                return true;
            }
        }
        throw new HotelTidakDitemukanException(id);
    }
}
