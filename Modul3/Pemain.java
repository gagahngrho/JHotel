package Modul3;


/**
 * Write a description of class Pemain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pemain
{
    // instance variables - replace the example below with your own
    String nama;
    StatusPemain status;
    String posisi;
    
    
    /**
     * Constructor for objects of class Pemain
     */
    public Pemain(String nama,StatusPemain status, String posisi)
    {
        this.nama = nama;
        this.status = status;
        this.posisi = posisi;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setStatus(StatusPemain status)
    {
        this.status = status;
    }
    
    public StatusPemain getStatus()
    {
        return this.status;
    }
    
    public String toString(){
        return ("Nama Pemainnya :" + this.nama + " \nStatus pemainnya :" + this.status +" \nPosisi pemain :" +this.posisi);
    }
}
