
/**
 * Ini adalah Class digunakan untuk melihat ataupun mengeset data customer 
 *
 * @author Anggoro Gagah Nugroho
 * @version 1/3/2018
 */
public class Customer
{
    // instance variables - replace the example below with your own
    protected int id;
    protected String nama;

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  int id,string nama
     * 
     */
    public void Customer(int id, String nama)
 
    {
        this.id=id;
        this.nama=nama;
        
    }
    /**
     * Digunakan untuk mendapatkan ID yang telah di set
     *
     * 
     * @return id type int  
     */
    public int getID()
    {
        return id;
    }
    /**
     * Digunakan untuk mendapatkan nama yang telah di set
     *
     * 
     * @return    nama type String
     */
    public String getNama()
    {
        return nama;
    }
    /**
     * Digunakan untuk mengeset ID
     *
     * @param  int id
     * 
     */
    public void setID(int id)
    {
        this.id=id; //bisa dipakai untuk mengeset ID
    }
    /**
     * Digunakan untuk mengeset nama
     *
     * @param String nama
     * 
     */
    public void setNama(String nama)
    {
        this.nama=nama;
    }
    /**
     * Digunakan untuk menampilkan nama
     *
     * @param  String nama
     * 
     */
    public void printData(String nama)
    {
        System.out.print(nama);
    }
        

        

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
   
}
