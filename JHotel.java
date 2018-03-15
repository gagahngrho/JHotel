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
        System.out.println("\n===========Selamat Datang di JHotel==========\n");
        Customer customer1 = new Customer(001, "Peppy");
        Lokasi lokasi1 = new Lokasi(20, 20, "Jauh Hotelnya");
        Hotel hotel1 = new Hotel("Menarik", lokasi1, 2); 
        Room kamar1 = new SingleRoom(hotel1,"34",false,StatusKamar.PROCESSED);
        kamar1.setDailyTariff(100000);
        Pesanan pesanan1 = new Pesanan(20.0, customer1, kamar1);
  
        
        System.out.println("Tugas b");
        lokasi1.printData();
        customer1.printData();
        hotel1.printData();
        System.out.println("\n==================================\n");
        
        
        System.out.println("Tugas c");
        Administrasi.pesananDitugaskan(pesanan1,kamar1);
        pesanan1.printData();
        kamar1.printData();
        System.out.println("\n=======================================\n");
        
        System.out.println("Tugas d");
        if (kamar1 instanceof DoubleRoom)
        {
            System.out.println("Benar Double Room");
        }
        else
        {
        System.out.println("Salah, tidak Double Room");
    }
    System.out.println("\n==============================================\n");
    Room kamar2 = new DoubleRoom(hotel1, "34", true, StatusKamar.VACANT);
    Pesanan pesanan2 = new Pesanan(20, customer1, kamar1);
    
    System.out.println("Tugas e, f ,g");
    kamar2.setDailyTariff(2000000);
    pesanan2.setBiaya();
    Administrasi.pesananDitugaskan(pesanan2, kamar2);
    kamar2.printData();
    pesanan2.printData();
         if (kamar1 instanceof DoubleRoom)
        {
            System.out.println("Benar Double Room");
        }
        else
        {
        System.out.println("Salah, tidak Double Room");
    }
    
    
}
}
