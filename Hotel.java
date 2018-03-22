
/**
 * Class Hotel 
 * 
 * @author Anggoro Gagah Nugroho
 * @version 1/3/2018
 */
public class Hotel
{
 
    private String nama;
    private Lokasi lokasi;
    private int bintang;
    
    
    /**
     * Ini adalah Constructor dari Class Hotel
     * 
     * @param nama adalah parameter untuk menentukan nama hotel
     * @param lokasi adalah parameter untuk menentukan lokasi hotel
     * @param bintang adalah parameter untuk menentukan bintang dari Hotel
     */
    public Hotel(String nama, Lokasi lokasi, int bintang)
    {
        this.nama = nama;
        this.lokasi = lokasi;
        this.bintang = bintang;
    }
    
    //Methode Getter (Accessor) untuk class
    /**
     * Ini adalah Methode untuk mendapatkan nama dari objek class Hotel
     * 
     * @return nama mengembalikkan variabel nama objek class Hotel
     */
    public String getNama(){
        return nama;
    }
    
    /**
     * Ini adalah Methode untuk mendapatkan lokasi dari objek class Hotel
     * 
     * @return lokasi mengembalikkan variabel objek lokasi objek class Hotel
     */
    public Lokasi getLokasi(){
        return lokasi;
    }
    
    /**
     * Ini adalah Methode untuk mendapatkan Bintang dari objek class Hotel
     * 
     * @return bintang mengembalikkan variabel bintang objek class Hotel
     */
    public int getBintang(){
        return bintang;
    }
    
    //Methode Setter (Mutator) untuk class
    /**
     * Ini adalah Methode mutator untuk set nilai nama
     * 
     * @param nama adalah variabel yang akan di masukkan pada variable nama pada Object Class
     */
    public void setNama(String nama){
        this.nama=nama;
    }
    
    /**
     * Ini adalah Methode mutator untuk set nilai lokasi
     * 
     * @param lokasi adalah variabel yang akan di masukkan pada variable Lokasi pada Object Class
     */
    public void setLokasi(Lokasi lokasi){
        this.lokasi=lokasi;
    }
    
    /**
     * Ini adalah Methode mutator untuk set nilai bintang
     * 
     * @param bintang adalah variabel yang akan di masukkan pada variable bintang pada Object Class
     */
    public void setBintang(int bintang){
        this.bintang=bintang;
    }
     public String toString()
    {
        return null;
    }
    
    
  
    /**
     * adalah Metod yang akan digunakan untuk mengprint data.
     */
    public void printData(){
        System.out.println(nama);
        getLokasi().printData();
        System.out.println(bintang);
    }
    
    
}
