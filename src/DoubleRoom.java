
/**
 * Write a description of class DoubleRoom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DoubleRoom extends Room

{
    private Customer customer2;
    TipeKamar TIPE_KAMAR = TipeKamar.DOUBLE;

    /**
     * Constructor for objects of class DoubleRoom
     */
    DoubleRoom(Hotel hotel, String nomor_kamar, StatusKamar status_kamar)
    {
        super(hotel, nomor_kamar,  status_kamar);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Customer getCustomer2()
    {
        return customer2;
    }
    public TipeKamar getTipeKamar()
    {
        return TIPE_KAMAR;
    }
    public void setCustomer2(Customer customer2)
    {
        this.customer2 = customer2;
    }
      
}
