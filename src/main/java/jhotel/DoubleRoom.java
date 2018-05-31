package jhotel;
/**
 * Class PremiumRoom untuk tipe room double.
 *
 * @author Anggoro Gagah Nugroho
 * @version 29/5/2018
 */
public class DoubleRoom extends Room
{
    // instance variables - replace the example below with your own
    private static TipeKamar TIPE_KAMAR = TipeKamar.DOUBLE;
    private Customer customer2;

    /**
     * Constructor for objects of class SingleRoom
     */
    public DoubleRoom(Hotel hotel,String nomor_kamar) {
        // initialise instance variables
        super(hotel, nomor_kamar);
        setDailyTariff(75000);
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
     * Method accessor untuk Customer 2
     *
     * @return customer2 mengembalikkan customer kedua dari doubleroom
     */
    public Customer getCustomer2(){
        return customer2;
    }

    /**
     * Method mutator untuk Customer 2
     *
     * @param customer2 mengset nilai customer2
     */
    public void setCustomer2(Customer customer2){

        this.customer2 = customer2;
    }
    /**
     * menentukan daily tarif untuk class DoubleRoom
     *
     * @param dailytariff nilai daily tariff
     */
    public void setDailyTariff(double dailytariff)
    {
        dailyTariff = dailytariff;
    }
}

