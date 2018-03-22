package Modul4;


/**
 * Write a description of class Honda here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Honda extends Motor implements SupraX
{
    private int harga = 400000000;
    // instance variables - replace the example below with your own
   public void jenisKendaraan()
   {
       System.out.println("Kendaraannya adalah");
    }

    /**
     * Constructor for objects of class Honda
     */
    public Honda()
    {
    
    }

  public void printKecepatan()
    {
        System.out.println("Speed : 1200000" );
    }
    public void printHarga()
    {
        System.out.println("Price : ");
    }
}
