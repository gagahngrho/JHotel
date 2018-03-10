/**
 * Class Hotel
 *
 * @author Anggoro Gagah Nugroho
 * @version 1/3/2018
 */
public class JHotel
{   
    /**
     * Adalah metode main dari Applikasi JHotel
     * 
     * @param args adalah argumen untuk main
     */
    public static void main(String[] args)
    {
        Customer customer1 = new Customer(001, "Peppy");
        Lokasi lokasi1 = new Lokasi(20, 20, "Jauh Hotelnya");
        Hotel hotel1 = new Hotel("Menarik", lokasi1, 2); 
        Pesanan pesanan1 = new Pesanan(100000, customer1);
        Room kamar1 = new Room(hotel1,"34",false,customer1,45000,StatusKamar.PROCESSED);
        lokasi1.printData();
        customer1.printData();
        hotel1.printData();
        
        Administrasi.pesananDitugaskan(pesanan1,kamar1);
        System.out.println("\n===========Method 1==========\n");
        pesanan1.printData();
        kamar1.printData();
        
        
        Administrasi.pesananDibatalkan(kamar1);
        System.out.println("\n===========Method 2==========\n");
        pesanan1.printData();
        kamar1.printData();
        
        Administrasi.pesananDitugaskan(pesanan1,kamar1);
        Administrasi.pesananSelesai(kamar1);
        System.out.println("\n===========Method 3==========\n");
        pesanan1.printData();
        kamar1.printData();
        
        
        Administrasi.pesananDitugaskan(pesanan1,kamar1);
        Administrasi.pesananDibatalkan(pesanan1);
        System.out.println("\n===========Method 4==========\n");
        pesanan1.printData();
        kamar1.printData();
        
        
        Administrasi.pesananDitugaskan(pesanan1,kamar1);        
        Administrasi.pesananDibatalkan(pesanan1);
        System.out.println("\n===========Method 5==========\n");
        pesanan1.printData();
        kamar1.printData();
    }
    
    /**
     * Constructor dari Class JHotel
     */
    public JHotel()
    {
    }
}
