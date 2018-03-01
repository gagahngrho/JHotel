
/**
 * Ini adalah suatu Class yang digunakan untuk mencari rekomendasi hotel
 *
 * @author Anggoro Gagah Nugroho
 * @version 1/3/2018
 */
public class Hotel
{
    // instance variables - replace the example below with your own
    private String nama;
    private Lokasi lokasi;
    private int bintang;

    /**
     * Constructor for objects of class Hotel
     */
    
    public Hotel(String nama, Lokasi lokasi, int bintang)
  
    {
        this.nama=nama;
        this.lokasi=lokasi;
        this.bintang=bintang;
        // initialise instance variables
        
    }

    /**
     * Digunakan untuk mendapatkan bintang dari set
     *
     * 
     * @return    bintang type int
     */
    public int getBintang()
    {
        return bintang;
       
    }
    
    /**
     * Digunakan untuk mendapatkan nama dari set
     *
     * 
     * @return nama type String
     */
    public String getNama()
    {
        return nama;
    }
    
    /**
     * Digunakan untuk mendapatkan lokasi dari set
     *
     * 
     * @return lokasi type Lokasi
     */
    public Lokasi getLokasi()
    {
        return lokasi;
    }
    
    /**
     * Digunakan untuk mengeset nama dari set
     *
     * @param String nama
     * 
     */
    public void setNama(String nama)
    {
        this.nama=nama;
    }
    
    /**
     * Digunakan untuk mengeset lokasi dari set
     *
     * @param  Lokasi lokasi
     * 
     */
    public void setLokasi(Lokasi lokasi)
    {
        this.lokasi=lokasi;//untuk mengeset lokasi hotel
    }
    
    /**
     * Digunakan untuk mengeset bintang dari set
     *
     * @param int bintang
     * 
     */
    public void setBintang(int bintang)
    {
        this.bintang=bintang;//untuk mengeset ingin hotel bintang berapa
    }
   
    /**
     * Digunakan untuk menampilkan nama
     *
     * @param String nama
     * 
     */
     public void printData(String nama)
    {
        System.out.print(nama);
    }
}

