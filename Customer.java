/**
 * Class Customer
 *
 * @author Anggoro Gagah Nugroho
 * @version 1/3/2018
 */
import java.util.*;

public class Customer
{
  
    protected int id;
    protected String nama;
    protected String email;
    protected Date dob;
    
   
    /**
     * Adalah Constructor dari Class Customer
     * 
     * @param id adalah parameter untuk menentukan id tiap customer
     * @param id adalah penentuan nama untuk Customer
     */
    public Customer(int id, String nama, int tanggal, int bulan, int tahun)
    {
        this.id = id;
        this.nama = nama;
        dob = new GregorianCalendar(tahun,bulan,tanggal).getTime();
    }
    
       public Customer(int id, String nama, Date dob)
    {
        this.id = id;
        this.nama = nama;
        this.dob = dob;
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
    public String getEmail()
    {
        return email;
    }
    public Date getDOB()
    {
        return dob;
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
    public void setEmail(String email)
    {
       if (email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")){
            System.out.println("Email valid");
            this.email = email;
        }
        else {
            System.out.println("Email tidak valid");
        }
    }
     public void setDOB(Date dob)
    {
        this.dob = dob;
    }

    
    
   public String toString()
   { 
       if(DatabasePesanan.getPesanan() = null)
       {
           System.out.println("Customer ID : " + id);
           System.out.println("Name : " + nama);
           System.out.println("E-Mail : " + email);
           System.out.println("Date of Birth : " + dob);
        }
        else
        {
           System.out.println("Customer ID : " + id);
           System.out.println("Name : " + nama);
           System.out.println("E-Mail : " + email);
           System.out.println("Date of Birth : " + dob);
           System.out.println("Booking order is in progress");
        }
        
        return null;
           
}
