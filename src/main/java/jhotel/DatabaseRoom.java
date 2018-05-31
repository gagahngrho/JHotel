package jhotel;
import java.util.ArrayList;


/**
 * Ini meruupakan class untuk Database Room
 *
 * @author Anggoro Gagah Nugroho
 * @version 29/5/2018
 */
public class DatabaseRoom
{
    //Bagian disini menunjukan Variabel-variabel pada class
    private static ArrayList<Room> ROOM_DATABASE = new ArrayList<>();

    /**
     * membuat arraylist berisi room
     *
     * @return ROOM_DATABASE
     */
    public static ArrayList<Room> getRoomDatabase(){
        return ROOM_DATABASE;
    }

    /**
     * menambahkan database room
     *
     * @param baru berisi objek Room
     */

    public static boolean addRoom(Room baru) throws RoomSudahAdaException{
        if(baru.getHotel() != null) {
            for (Room kamar :
                    ROOM_DATABASE) {
                if(kamar.getHotel().equals(baru.getHotel())){
                    if(baru.getNomorKamar().compareTo(kamar.getNomorKamar()) == 0){
                        throw new RoomSudahAdaException(baru);
                    }
                }
            }
            ROOM_DATABASE.add(baru);
            return true;
        }
        else throw new RoomSudahAdaException(baru);
    }
    /**
     * mengambil database room berdasarkan hotel dan nomor kamar
     *
     * @param hotel berisi objek Hotel
     * @param nomor_kamar berisi nomor kamar
     * @return kamar
     */

    public static Room getRoom(Hotel hotel,String nomor_kamar){
        for (Room kamar :
                ROOM_DATABASE) {
            if (kamar.getHotel().equals(hotel) && kamar.getNomorKamar().compareTo(nomor_kamar) == 0) {
                return kamar;
            }
        }
        return null;
    }

    /**
     * mengambil arraylist room yang berasal dari hotel
     *
     * @param hotel berisi objek Hotel
     * @return tempRoom
     */
    public static ArrayList<Room> getRoomsFromHotel(Hotel hotel){
        ArrayList<Room> toReturn = new ArrayList<>();
        for (Room kamar :
                ROOM_DATABASE) {
            if(kamar.getHotel().equals(hotel)){
                toReturn.add(kamar);
            }
        }
        return toReturn;
    }
    /**
     * mengambil arraylist dari vacant room
     *
     * @return tempRoom
     */
    public static ArrayList<Room> getVacantRooms(){
        ArrayList<Room> toReturn = new ArrayList<>();
        for (Room kamar :
                ROOM_DATABASE) {
            if(kamar.getStatusKamar().equals(StatusKamar.VACANT)){
                toReturn.add(kamar);
            }
        }
        return toReturn;
    }
    /**
     * menghapus database room
     *
     * @param hotel berisi objek Hotel
     * @param nomor_kamar berisi nomor kamar
     * @return true
     */
    public static boolean removeRoom(Hotel hotel, String nomor_kamar) throws RoomTidakDitemukanException{
        for (Room kamar :
                ROOM_DATABASE) {
            if(kamar.getHotel().equals(hotel)){
                if(kamar.getNomorKamar().compareTo(nomor_kamar) == 0){
                    Administrasi.pesananDibatalkan(kamar);
                    ROOM_DATABASE.remove(kamar);
                    return true;
                }
            }
        }
        throw new RoomTidakDitemukanException(hotel,nomor_kamar);
    }
}
