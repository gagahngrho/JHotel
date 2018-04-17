/**
 * Class Hotel
 *
 * @author Anggoro Gagah Nugroho
 * @version 1/3/2018
 */
import javax.xml.crypto.Data;
import java.util.GregorianCalendar;

public class JHotel
{
    /**
     * Constructor for objects of class Pesanan
     */
    public JHotel()
    {
    }

    /**
     * The main method that will execute the programs.
     */
    public static void main(String args[])
    {
        DatabaseCustomer.addCustomer(new Customer("Gagah",1,7,1996));
        DatabaseCustomer.addCustomer(new Customer ("Alya",2,8,1997));
        DatabaseCustomer.addCustomer(new Customer("Hazbiy", 3, 9, 1997));

        System.out.println("Database Customer");
        for(int i=0; i<DatabaseCustomer.getCustomerDatabase().size();i++) {
            System.out.println(DatabaseCustomer.getCustomerDatabase().get(i).toString());
        }

        DatabaseHotel.addHotel(new Hotel("Alexis", new Lokasi(3,5,"Jakarta"),4));
        DatabaseHotel.addHotel(new Hotel("Margo", new Lokasi(4,6,"Depok"),3));
        DatabaseHotel.addHotel(new Hotel("Hotel Bagus", new Lokasi(9,8,"Bekasi"),5));

        System.out.println("Database Hotel");
        for(int i=0; i<DatabaseHotel.getHotelDatabase().size();i++) {
            System.out.println(DatabaseHotel.getHotelDatabase().get(i).toString());
        }

        DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel("Margo"), "A101", StatusKamar.VACANT));
        DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel("Alexis"), "B202", StatusKamar.VACANT));
        DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel("Hotel Bagus"), "C303", StatusKamar.VACANT));
        DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel("Alexis"), "D404", StatusKamar.VACANT));

        System.out.println("Database Room");
        for(int i=0; i<DatabaseRoom.getRoomDatbabse().size();i++) {
            System.out.println(DatabaseRoom.getRoomDatbabse().get(i).toString());
        }

        DatabasePesanan.addPesanan(new Pesanan(7, DatabaseCustomer.getCustomer(1)));
        DatabasePesanan.addPesanan(new Pesanan(6, DatabaseCustomer.getCustomer(2)));
        DatabasePesanan.addPesanan(new Pesanan(5, DatabaseCustomer.getCustomer(3)));

        System.out.println("Database Pesanan 1");
        for(int i=0; i<DatabasePesanan.getPesananDatabase().size();i++) {
            System.out.println(DatabasePesanan.getPesananDatabase().get(i).toString());
        }

        Administrasi adm = new Administrasi();
        adm.pesananDitugaskan(DatabasePesanan.getPesanan(1),DatabaseRoom.getRoom(DatabaseHotel.getHotel("Margo"),"A101"));
        adm.pesananDitugaskan(DatabasePesanan.getPesanan(2),DatabaseRoom.getRoom(DatabaseHotel.getHotel("Alexis"),"B202"));
        adm.pesananDitugaskan(DatabasePesanan.getPesanan(3),DatabaseRoom.getRoom(DatabaseHotel.getHotel("Hotel Bagus"),"C303"));

        System.out.println("Database Pesanan 2");
        for(int i=0; i<DatabasePesanan.getPesananDatabase().size();i++) {
            System.out.println(DatabasePesanan.getPesananDatabase().get(i).toString());
        }

        adm.pesananSelesai(DatabasePesanan.getPesanan(1));
        adm.pesananSelesai(DatabasePesanan.getPesanan(2));
        adm.pesananDibatalkan(DatabasePesanan.getPesanan(3));

        System.out.println("Database Pesanan 3");
        for(int i=0; i<DatabasePesanan.getPesananDatabase().size();i++) {
            System.out.println(DatabasePesanan.getPesananDatabase().get(i).toString());
        }
    }
}
