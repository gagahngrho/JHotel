/**
 * Class Customer
 *
 * @author Anggoro Gagah Nugroho
 * @version 1/3/2018
 */
public class Customer
{
    
    protected int id;
    protected String nama;
    
   
    /**
     * Adalah Constructor dari Class Customer
     * 
     * @param id adalah parameter untuk menentukan id tiap customer
     * @param id adalah penentuan nama untuk Customer
     */
    public Customer(int id, String nama)
    {
        this.id = id;
        this.nama = nama;
    }
    
    //Methode Getter (Accessor) untuk class
     /**
     * Ini adalah Methode untuk mendapatkan ID dari objek
     * 
     * @return id adalah id yang di dapatkan
     */
    public int getID()
    {
        return id;
    }
    
    /**
     * Ini adalah Methode untuk mendapatkan nama dari objek
     * 
     * @return nama adalah nama yang di dapatkan
     */
    public String getNama()
    {
        return nama;
    }
    
    //Methode Setter (Mutator) untuk class
    /**
     * Ini adalah Methode mutator untuk set nilai id
     * 
     * @param id adalah id yang dimasukkan
     */
    public void setID(int id)
    {
        this.id = id;
    }
    
    /**
     * Ini adalah Methode mutator untuk set nama
     * 
     * @param nama adalah nama Customer yang dimasukkan
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    
   
    /**
     * adalah Metod yang akan digunakan untuk mengprint data.
     */
    public void printData()
    {
        System.out.println(id);
        System.out.println(nama);
    }
    

}
