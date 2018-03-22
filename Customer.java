/**
 * Class Customer
 *
 * @author Anggoro Gagah Nugroho
 * @version 1/3/2018
 */
import java.util.*;
import java.text.*;

public class Customer
{
  
    protected int id;
    protected String nama;
    protected String email;
    protected Date dob;
    
    SimpleDateFormat dobformat = new SimpleDateFormat("dd MMMMMMMMMM yyyy");
    
   
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
        SimpleDateFormat formatdob = new SimpleDateFormat("dd MMMMMMMMMM yyyy");
        System.out.println("DOB: " + formatdob.format(dob));
        System.out.printf("%s %te %tB %tY", "DOB: ", dob, dob, dob, dob);
        
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
       if(DatabasePesanan.getPesanan(this) == null)
       {
           return "\nCustomer ID \t: " + getID()
           + "\nName \t\t:" + getNama()
           + "\nE-Mail \t\t: " + getEmail()
           + "\nDate of Birth \t: " + dobformat.format(getDOB());
        }
          
        
        

        else 
        {
             return "\nCustomer ID \t: " + getID()
           + "\nName \t\t:" + getNama()
           + "\nE-Mail \t\t: " + getEmail()
           + "\nDate of Birth \t: " + dobformat.format(getDOB())
           + "\nBooking Order is in progress";
        }
    }
}
  
           

