
 /**
 * Class Pesanan 
 *
 * @author Anggoro Gagah Nugroho
 * @version 1/3/2018
 */
public class Pesanan
{
    
    private double biaya;
    private Customer pelanggan;
    private String nama_pelanggan;
    private TipeKamar tipe_kamar;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;

    
    /**
     * Constructor dari Class Pesanan
     * 
     * @param  parameter menentukan harga pesanan
     * @param pelanggan adalah parameter yang akan menunjukan pelanggan yang memesan
     */
    public Pesanan(double biaya, Customer pelanggan)
    {
        this.biaya = biaya;
        this.pelanggan = pelanggan;
    }
    
    //Methode Getter (Accessor) untuk class
     /**
     * Methode untuk mendapatkan biaya dari objek class pesanan
     * 
     * @return biaya mendapatkan biaya bayar dari pesanan
     */
    public double getBiaya()
    {
        return biaya;
    }
    
    /**
     * Accessor for objects of class Pesanan
     * untuk mendapatkan nilai pelanggan
     * 
     * @return pelanggan
     */
    public Customer getPelanggan(){
        return pelanggan;
    }
    
    /**
     * Ini merupakan Methode untuk mendapatkan Nama pelanggan dari objek class pesanan
     * 
     * @return nama_pelanggan mengembalikkan variabel nama_pelanggan objek class pesanan
     */
    public String getNamaPelanggan(){
        return nama_pelanggan;
    }
    
    /**
     * Ini merupakan Methode untuk mendapatkan tipe kamar dari objek class pesanan
     * 
     * @return tipe_kamar mengembalikkan variabel tipe_kamar objek class pesanan
     */
    public TipeKamar getTipeKamar(){
        return tipe_kamar;
    }
    
    /**
     * Accessor for objects of class Pesanan
     * untuk mendapatkan nilai status diproses
     * 
     * @return isDiproses
     */
    public boolean getStatusDiproses(){
        return isDiproses;
    }
    
    /**
     * Ini merupakan Methode untuk mendapatkan status proses selesai dari objek class pesanan
     * 
     * @return isSelesai mengembalikkan variabel isSelesai objek class pesanan
     */
    public boolean getStatusSelesai(){
        return isSelesai;
    }
    
    /**
     * Ini merupakan Methode untuk mendapatkan object room dari object ini
     * 
     * @return kamar merupakan kamar yang akan dikembalikkan
     */
    public Room getRoom(){
        return kamar;
    }
    

    /**
     * Ini merupakan Methode mutator untuk set nilai biaya
     * 
     * @param biaya merupakan variabel yang akan di masukkan pada variable biaya pada Class
     */
    public void setBiaya(double biaya)
    {
        this.biaya=biaya;
    }
    
    /**
     * Ini merupakan Methode mutator untuk set nilai pelanggan
     * 
     * @param baru merupakan variabel yang akan di masukkan pada variable peanggan pada Class
     */
    public void setPelanggan(Customer baru)
    {
        pelanggan=baru;
    }
    
    /**
     * Ini merupakan Methode mutator untuk set nilai nama Pelanggan 
     * 
     * @param nama_pelanggan merupakan variabel yang akan di masukkan pada variable nama_pelanggan pada Class
     */
    public void setNamaPelanggan(String nama_pelanggan)
    {
        this.nama_pelanggan=nama_pelanggan;
    }
    
    /**
     * Ini merupakan Methode mutator untuk set nilai nama Tipe Kamar 
     * 
     * @param tipe_kamar merupakan variabel yang akan di masukkan pada variable tipe_kamar pada Class
     */
    public void setTipeKamar(TipeKamar tipe_kamar)
    {
        this.tipe_kamar=tipe_kamar;
    }
    
    /**
     * Ini merupakan Methode mutator untuk set nilai isDiproses
     * 
     * @param diproses merupakan variabel yang akan di masukkan pada variable isDiproses pada Class
     */
    public void setStatusDiproses(boolean diproses)
    {
        isDiproses = diproses;
    }
    
    /**
     * Ini merupakan Methode mutator untuk set nilai isSelesai
     * 
     * @param diproses merupakan variabel yang akan di masukkan pada variable isSelesai pada Class
     */
    public void setStatusSelesai(boolean diproses)
    {
        isSelesai = diproses;
    }
    
    /**
     * Ini merupakan Methode mutator untuk set Room
     * 
     * @param kamar merupakan Object yang akan di pasangkan pada object pesanan
     */
    public void setRoom(Room kamar)
    {
        this.kamar = kamar;
    }
    
    
    /**
     * Merupakan Metode yang akan digunakan untuk mengprint data.
     */
    public void printData()
    {
        System.out.println("Nama Pelanggan Pesanan = " + getPelanggan().getNama());
        System.out.println("Tipe Kamar dipesan = " + tipe_kamar);
        System.out.println("Status Proses pesanan = " + isDiproses);
        System.out.println("Status Selesai pesanan = " + isSelesai);
    }
}
