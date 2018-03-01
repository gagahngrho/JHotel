
/**
 * Ini merupakan Class yang digunakan untuk mencari tahu lokasi hotel
 *
 * @author Anggoro Gagah Nugroho
 * @version 1/3/2018
 */
public class Lokasi
{
    // instance variables - replace the example below with your own
    private float x_coord;
    private float y_coord;
    private String deskripsiLokasi;

    /**
     * Constructor for objects of class Lokasi
     */
    public Lokasi()
    {
        this.x_coord=x_coord;
        this.y_coord=y_coord;
        this.deskripsiLokasi=deskripsiLokasi;// inititalise instance variables
        
    }

    /**
     * Digunakan untuk mendapatkan nilai X
     *
     * 
     * @return 
     */
    public float getX()
    {
        return x_coord;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public float getY()
    {
        return y_coord;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getDeskripsi()
    {
        return deskripsiLokasi;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setX(float x_coord)
    {
        this.x_coord = x_coord;
        
    } 
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setY(float y_coord)
    {
        this.y_coord = y_coord;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setDeskripsi(String deskripsi)
    {
        deskripsiLokasi=deskripsi;
    }
   
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printData(String deskripsiLokasi)
    {
        System.out.print(deskripsiLokasi);
    }
    
   
}



