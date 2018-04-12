/**
 * Class Hotel
 *
 * @author Anggoro Gagah Nugroho
 * @version 1/3/2018
 */
import java.util.*;
import java.text.*;
public class JHotel
{
public static void main(String[] args)

{   
    //System.out.println("\n===========Selamat Datang di JHotel==========\n");
    //Customer customer1 = new Customer(223, "Gagah", new GregorianCalendar(2017,2,1).getTime());
    
    //customer1.getDOB();
   
    //Customer orang1 = new Customer(1, "Gagah",1,1,1);
    //Customer orang2 = new Customer(2, "Aqila",1,1,1);
    //Customer orang3 = new Customer(3, "Haekal",1,1,1);
    
    //orang1.setEmail("e.t.d@");
    //orang2.setEmail("Ee_.td@ui.ac.id");
    //orang3.setEmail("AnggoroGagah.modul5@netlab.com");
    
     Lokasi lokasi1 = new Lokasi(123,123,"Dirumah");
        Hotel hotel1 = new Hotel("Nama",lokasi1,100);
        Customer customer1 = new Customer(1234,"RIzkyRamadianWIjaya",1997,1,3);
        System.out.println(hotel1.toString());
}
 /**
     * Constructor dari Class JHotel
     */
    public JHotel()
    {
    }
}
    