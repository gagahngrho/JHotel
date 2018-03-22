
 /**
 * Class Pesanan 
 *
 * @author Anggoro Gagah Nugroho
 * @version 1/3/2018
 */
import java.util.*;

public class Pesanan
{
    
    private double biaya;
    private double jumlahHari;
    private Customer pelanggan;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
    private Date tanggalPesan;

    
    /**
     * Constructor dari Class Pesanan
     * 
     * @param  parameter menentukan harga pesanan
     * @param pelanggan adalah parameter yang akan menunjukan pelanggan yang memesan
     */
    public Pesanan(double jumlahHari, Customer pelanggan, Room kamar)
    {
        this.jumlahHari = jumlahHari;
        this.pelanggan = pelanggan;
        this.kamar = kamar;
        biaya = kamar.getDailyTariff() * jumlahHari;
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
    
    public double getjumlahHari()
    {
        return jumlahHari;
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
    public Date getDate(){
        return tanggalPesan;
    }
    

    /**
     * Ini merupakan Methode mutator untuk set nilai biaya
     * 
     * @param biaya merupakan variabel yang akan di masukkan pada variable biaya pada Class
     */
    public void setBiaya()
    {
        biaya = kamar.getDailyTariff() * jumlahHari;
    }
    
    public void setJumlahHari(double jumlahHari)
    {
        this.jumlahHari=jumlahHari;
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
    public void setDate(Date tanggalPesan)
    {
        this.tanggalPesan = tanggalPesan;
    }
    
    
    
    
    /**
     * Merupakan Metode yang akan digunakan untuk mengprint data.
     */
    public String toString()
    {
        System.out.println("Nama Pelanggan Pesanan = " + getPelanggan().getNama());
        System.out.println("Status Proses pesanan = " + isDiproses);
        System.out.println("Status Selesai pesanan = " + isSelesai);
        System.out.println("Jumlah Hari = " + jumlahHari);
        System.out.println("Jumlah Biaya = " + biaya);
        return null;
       
    }
}
