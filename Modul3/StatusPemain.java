package Modul3;


/**
 * Enumeration class StatusPemain - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum StatusPemain
{
    INJURY("Cedera"),
    FIT("SIAP Main"),
    DOUBT("Diragukan");
    
    String deskripsi;
     StatusPemain(String deskripsi){
        this.deskripsi = deskripsi;
    }
    public String toString()
    {
        return this.deskripsi;
    }
}
