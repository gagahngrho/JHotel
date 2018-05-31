package jhotel;

/**
 * class Customer untuk memodelkan Customer.
 *
 * @author Anggoro Gagah Nugroho
 * @version 29/5/2018
 */
public class HotelSudahAdaException extends Exception{
    private Hotel hotel_error;

    /**
     * constructor untuk kelas HotelSudahAdaException
     *
     * @param hotel_input object Hotel
     */
    public HotelSudahAdaException(Hotel hotel_input){
        super("Hotel dengan nama : ");
        hotel_error = hotel_input;
    }
    /**
     * mendapatkan pesan error untuk exception
     *
     * @return string
     */
    public String getPesan(){
        return super.getMessage() + hotel_error.getNama() + " sudah terdaftar.";
    }
}
