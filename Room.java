
/**
 * Write a description of class Room here.
 *
 * @author Anggoro Gagah Nugroho
 * @version 8/3/18
 * @param biaya
 * @param pelanggan 
 */
public class Room
{
    private Hotel hotel;
    private int id;
    private String nomor_kamar;
    private boolean isAvailable;
    private Customer customer;
    private double dailyTariff;
    private StatusKamar status_kamar;
    private Pesanan pesan;

    /**
     * Constructor for objects of class Room
     */
    public Hotel getHotel()
    {
        // initialise instance variables
        return hotel;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getID()
    {
        // put your code here
        return id;
    }
    
    public String getNomorKamar()
    {
    return nomor_kamar;
    }
    
    public boolean getStatusAvailable()
    {
        return isAvailable;
    }
    public Customer getCustomer()
    {
        return customer;
    }
    public double getDailyTariff()
    {
        return dailyTariff;
    }
    public StatusKamar getStatusKamar()
    {    
    return status_kamar;
    }
    public Pesanan getPesanan()
    {
        return pesan;
    }
    public void setHotel(Hotel hotel)
    {
        this.hotel = hotel;
    }
    public void setID(int id)
    {
        this.id = id;
    }
    public void setNomorKamar(String nomor_kamar)
    {
        this.nomor_kamar = nomor_kamar;
    }
    public void setStatusKamarAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
    public void setDailyTariff(double dailytariff){
        this.dailyTariff = dailyTariff;
    }
    public void setStatusKamar(StatusKamar status_kamar){
        this.status_kamar = status_kamar;
    }
    public void setPesanan(Pesanan pesan){
        this.pesan = pesan;
    }
    public void printData(){
        System.out.println(hotel);
        System.out.println(id);
        System.out.println(nomor_kamar);
        System.out.println(isAvailable);
        System.out.println(customer);
        System.out.println(dailyTariff);
        System.out.println(status_kamar);
        System.out.println(pesan);
    }
 
}
    
    


