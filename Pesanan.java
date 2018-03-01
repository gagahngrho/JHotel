
/**
 * Ini adalah Class yang digunakan untuk memesan hotel
 *
 * @author Anggoro Gagah Nugroho
 * @version 1/3/2018
 */
public class Pesanan
{
    // instance variables - replace the example below with your own
    private double biaya;
    private Customer pelanggan;
    private String nama_pelanggan;
    private String jenis_kamar;
    private boolean isDiproses;
    private boolean isSelesai;

    
  
    public Pesanan(double biaya, Customer pelanggan)
    {
      this.biaya=biaya;
      this.pelanggan=pelanggan;
        
    }
    
    /**
     * Digunakan untuk mendapatkan biaya dari set
     *
     * 
     * @return  biaya type double
     */
    public double getBiaya()
    {
        return biaya;
    }
    
    /**
     * Digunakan untuk mendapatkan pelanggan dari set
     * 
     * @return  pelanggan type Customer
     */
    public Customer getPelanggan()
    {
        return pelanggan;
    }
    
    /**
     * Digunakan untuk mendapatkan status 
     *
     * @param  y  a sample parameter for a method yang diproses
     * @return    isDiproses type boolean
     */
    public boolean getStatusDiproses()
    {
        return isDiproses;
    }
    
    /**
     * Digunakan untuk mendapatkan status yang telah selesai
     *
     * 
     * @return    isSelesai type boolean
     */
    public boolean getStatusSelesai()
    {
        return isSelesai;
    }
    
    /**
     *Digunakan untuk mengeset biaya
     *
     * @param  double biaya
     * 
     */
    public void setBiaya(double biaya)
    {
        this.biaya = biaya;
    }
    
    /**
     * Digunakan untuk mengeset pelanggan
     *
     * @param Customer baru
     * 
     */
    public void setPelanggan(Customer baru)
    {
        pelanggan=baru;
    }
    
    /**
     * Digunakan untuk mengeset status yang diproses
     *
     * @param  boolean diproses
     * 
     */
    public void setStatusDiproses(boolean diproses)
    {
        isDiproses=diproses;
    }
    
    /**
     * Digunakan untuk mengeset status yang selesai
     *
     * @param  boolean diproses
     * 
     */
    public void setStatusSelesai(boolean diproses)
    {
        isSelesai=diproses;
    }
    
        


    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
}
