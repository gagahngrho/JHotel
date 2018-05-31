package jhotel;
/**
 * Class PremiumRoom untuk tipe room single.
 *
 * @author Anggoro Gagah Nugroho
 * @version 29/5/2018
 */
public class SingleRoom extends Room
{
    // instance variables - replace the example below with your own
    private static TipeKamar TIPE_KAMAR = TipeKamar.SINGLE;
    private Customer customer2;

    /**
     * Default Constructor for objects of class SingleRoom
     */


    /**
     * Overloading Constructor for objects of class SingleRoom
     *
     * @param hotel object hotel
     * @param nomor_kamar berisi nomor kamar
     */

    /**
     * Constructor for objects of class SingleRoom
     */
    public SingleRoom(Hotel hotel,String nomor_kamar) {
        super(hotel, nomor_kamar);
        setDailyTariff(50000);
    }

    /**
     * Method accessor untuk tipe kamar
     *
     * @return TIPE_KAMAR mengembalikkan tipekamar
     */
    public TipeKamar getTipeKamar(){
        return TIPE_KAMAR;
    }

    /**
     * menentukan nilai daily tarif
     *
     * @param dailytariff nilai daily tariff
     */
    public void setDailyTariff(double dailytariff)
    {
        dailyTariff = dailytariff;
    }
}

