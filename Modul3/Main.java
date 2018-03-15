package Modul3;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    // instance variables - replace the example below with your own
    static public Pemain Gagah;

    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String[] args)
    {
        Gagah = new Pemain("Gagah", StatusPemain.FIT, "Kiper");
        System.out.println(Gagah.toString());
    }
}
