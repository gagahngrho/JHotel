package jhotel;

/* Class Hotel
        *
        * @author Anggoro Gagah Nugroho
        * @version 1/3/2018
        */

        import java.util.*;

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JHotel
{
    /**
     * Merupakan metode main dari Applikasi JHotel
     *
     * @param args argumen untuk main
     */
    public static void main(String[] args)  throws RoomSudahAdaException , HotelSudahAdaException
    {
        SpringApplication.run(JHotel.class, args);
        Lokasi Jakarta = new Lokasi(1,2, "Mares");
        Lokasi Depok = new Lokasi(2,3, "Margo");
        Lokasi Bandung = new Lokasi(3,4, "Alexis");

        Hotel Mares = new Hotel("Mares", Jakarta, 5);
        DatabaseHotel.addHotel(Mares);
        Hotel Margo = new Hotel("Margo", Depok, 5);
        DatabaseHotel.addHotel(Margo);


        Room A1 = new PremiumRoom(Margo, "A1");
        DatabaseRoom.addRoom(A1);
        Room B1 = new DoubleRoom(Margo, "B1");
        DatabaseRoom.addRoom(B1);
        Room C1 = new SingleRoom(Margo, "C1");
        DatabaseRoom.addRoom(C1);



       /* try {
            DatabaseCustomer.addCustomer(new Customer("Gagah", 1996, 1, 9, "gagahblw@gmail.com"));
            DatabaseCustomer.addCustomer(new Customer("Alya", 1997, 3, 4, "alyaf@gmail.com"));
            DatabaseCustomer.addCustomer(new Customer("Citra", 2018, 6, 10, "citra@gmail.com"));
            DatabaseCustomer.addCustomer(new Customer("Citra", 2018, 6, 10, "citra@gmail.com"));
        }
        catch(PelangganSudahAdaException e){
            System.out.println("---EXCEPTION SUDAH ADA DAN BERHASIL---");
            System.out.println(e.getPesan());
        }

        try {
            Lokasi a = new Lokasi(102, 320, "Jauh");
            DatabaseHotel.addHotel(new Hotel("Alexis", new Lokasi(3, 3, "Jakarta"), 5));
            DatabaseHotel.addHotel(new Hotel("Margo", new Lokasi(10, 10, "Depok"), 100));
            DatabaseHotel.addHotel(new Hotel("Aston", a, 1));
            DatabaseHotel.addHotel(new Hotel("Aston", a, 1));
        } catch(HotelSudahAdaException e){
            System.out.println("---EXCEPTION HOTEL SUDAH ADA DAN BERHASIL---");
            System.out.println(e.getPesan());
        }

        try {
            DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1), "A101"));
            DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(2), "B202"));
            DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(3), "C303"));
            DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(1), "D404"));
            DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(1), "D404"));

        } catch(RoomSudahAdaException e){
            System.out.println("---EXCEPTION ROOM SUDAH ADA BERHASIL---");
            System.out.println(e.getPesan());
        }

        try {
            DatabasePesanan.addPesanan(new Pesanan(3, DatabaseCustomer.getCustomer(1)));
            DatabasePesanan.addPesanan(new Pesanan(5, DatabaseCustomer.getCustomer(2)));
            DatabasePesanan.addPesanan(new Pesanan(7, DatabaseCustomer.getCustomer(3)));
            DatabasePesanan.addPesanan(new Pesanan(7, DatabaseCustomer.getCustomer(3)));
        } catch(PesananSudahAdaException e){
            System.out.println("---EXCEPTION PESANAN SUDAH ADA BERHASIL---");
            System.out.println(e.getPesan());
        }

        try{
            DatabaseCustomer.removeCustomer(10);
        } catch(PelangganTidakDitemukanException e){
            System.out.println("---EXCEPTION PELANGGAN TIDAK DITEMUKAN BERHASIL---");
            System.out.println(e.getPesan());
        }
        Customer me = new Customer("Anggoro Gagah Nugroho",2017,3,2,"gagahblw@gmail.com");
        Pesanan pesan = new Pesanan(32,me);
        try{
            DatabasePesanan.removePesanan(pesan);
        } catch(PesananTidakDitemukanException e){
            System.out.println("---EXCEPTION PESANAN TIDAK DITEMUKAN BERHASIL---");
            System.out.println(e.getPesan());
        }

        try{
            DatabaseHotel.removeHotel(29);
        } catch(HotelTidakDitemukanException e){
            System.out.println("---EXCEPTION HOTEL TIDAK DITEMUKAN BERHASIL---");
            System.out.println(e.getPesan());
        }

        try{
            DatabaseRoom.removeRoom(DatabaseHotel.getHotel(2),"AAAA");
        } catch(RoomTidakDitemukanException e){
            System.out.println("---EXCEPTION ROOM TIDAK DITEMUKAN BERHASIL---");
            System.out.println(e.getPesan());
        }

        System.out.println("===========HASIL==========");

        System.out.println(DatabaseCustomer.getCustomerDatabase());
        System.out.println(DatabaseHotel.getHotelDatabase());
        System.out.println(DatabaseRoom.getRoomDatabase());
        System.out.println(DatabasePesanan.getPesananDatabase());

//            for (Pesanan pesan :
//                    DatabasePesanan.getPesananDatabase()) {
//                System.out.println(pesan);
//            }
//
//            Administrasi.pesananDitugaskan(DatabasePesanan.getPesanan(1), DatabaseRoom.getRoom(DatabaseHotel.getHotel(1), "A101"));
//            Administrasi.pesananDitugaskan(DatabasePesanan.getPesanan(2), DatabaseRoom.getRoom(DatabaseHotel.getHotel(1), "D404"));
//            Administrasi.pesananDitugaskan(DatabasePesanan.getPesanan(3), DatabaseRoom.getRoom(DatabaseHotel.getHotel(2), "B202"));
//
//            for (Pesanan pesan :
//                    DatabasePesanan.getPesananDatabase()) {
//                System.out.println(pesan);
//            }
//
//            Administrasi.pesananSelesai(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(1)));
//            Administrasi.pesananDibatalkan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(2)));
//            Administrasi.pesananSelesai(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(3)));

//            for (Pesanan pesan :
//                    DatabasePesanan.getPesananDatabase()) {
//                System.out.println(pesan);
//            }

    }


    /**
     * Constructor dari Class JHotel
     */

}}
