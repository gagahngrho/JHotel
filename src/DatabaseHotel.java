import java.util.ArrayList;
/**
 * Write a description of class DatabaseHotel here.
 *
 * @author Anggoro Gagah Nugroho
 * @version 1.0
 */
public class DatabaseHotel
{
    private static ArrayList<Hotel> HOTEL_DATABASE = new ArrayList<Hotel>();
    private static int LAST_HOTEL_ID = 0;

    /**
     * Constructor for objects of class DatabaseHotel
     */
    public DatabaseHotel()
    {
    }

    /**
     * A method to get the database of Hotel in form of ArrayList
     *
     * @return ArrayList of HOTEL_DATABASE
     */
    public static ArrayList<Hotel> getHotelDatabase()
    {
        return HOTEL_DATABASE;
    }

    /**
     * A method to get the last Hotel ID
     *
     * @return int value of LAST_HOTEL_ID
     */
    public static int getLastHotelID()
    {
        return LAST_HOTEL_ID;
    }

    /**
     * A method to add a new hotel
     * @param baru Hotel object
     * @return true if adding hotel succeed, false if adding hotel failed
     */
    public static boolean addHotel(Hotel baru)
    {
        if(HOTEL_DATABASE.size() == 0){
            baru.setID(LAST_HOTEL_ID+1);
            LAST_HOTEL_ID++;
            HOTEL_DATABASE.add(baru);
            return true;
        }
        else {
            for (Hotel lama : HOTEL_DATABASE) {
                if (lama.getID() != baru.getID()) {
                    HOTEL_DATABASE.add(baru);
                    LAST_HOTEL_ID = baru.getID();
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * A method to get hotel's details
     * @param nama String value of hotel's name
     * @return  Hotel object if hotel exists, null if hotel does not exist
     */
    public static Hotel getHotel(String nama)
    {
        for(Hotel hotel : HOTEL_DATABASE){
            if(hotel.getNama().equals(nama)){
                return hotel;
            }
        }
        return null;
    }

    /**
     * A method to remove a hotel
     * @return  default boolean value
     */
    public static boolean removeHotel(int id)
    {
        for(Hotel hotel : HOTEL_DATABASE){
            if(hotel.getID() == id){
                for (Room kamar :
                        DatabaseRoom.getRoomsFromHotel(hotel)) {
                    DatabaseRoom.removeRoom(hotel, kamar.getNomorKamar());
                }
                HOTEL_DATABASE.remove(hotel);
                return true;
            }
        }
        return false;
    }
}
