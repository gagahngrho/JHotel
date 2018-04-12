import java.util.*;
import java.lang.*;

/**
 * Class DatabasePesanan digunakan sebagi
 * database untuk pesanan.
 *
 * @author  Anggoro Gagah Nugroho
 * @version 1.0
 * @since   22-02-2018
 */

public class DatabasePesanan
{
    // Instance variable yang digunakan
    private static ArrayList<Pesanan> PESANAN_DATABASE = new ArrayList<Pesanan>();
    private static int LAST_PESANAN_ID = 0;

    /**
     * Constructor dari class DatabasePesanan.
     *
     *
     * @return tidak ada
     */
    public DatabasePesanan()
    {
    }

    /**
     * Method ini digunakan untuk menambah pesanan.
     *
     * @param baru dengan tipe data Pesanan dari class Pesanan
     * @return false
     */
    public static boolean addPesanan(Pesanan baru)
    {
        if(baru.getStatusAktif()) {
            return false;
        } else{
            PESANAN_DATABASE.add(baru);
            return true;
        }
    }

    /**
     * Method ini digunakan untuk menghapus pesanan.
     *
     * @param pesan dengan tipe data Pesanan dari class Pesanan
     * @return false
     */

    /**
     * Method ini digunakan untuk mengambil pesanan.
     *
     * @param id dengan tipe data Customer dari class Customer
     * @return null
     */
    public static Pesanan getPesanan(int id)
    {
        for(Pesanan cari : PESANAN_DATABASE){
            if(cari.getID() == id){
                return cari;
            }
        }
        return null;
    }

    public static Pesanan getPesanan(Room kamar)
    {
        for(Pesanan cari : PESANAN_DATABASE){
            if(cari.getRoom() == kamar){
                return cari;
            }
        }
        return null;
    }

    public static int getLastPesananID()
    {

    }

    /**
     * Method ini digunakan untuk mengambil database pesanan.
     *
     * @return null
     */
    public static ArrayList<Pesanan> getPesananDatabase()
    {
        return null;
    }

    /**
     * Method ini digunakan untuk mengambil pesanan aktif.
     *
     * @param pesan dengan tipe data Pesanan dari class Pesanan
     * @return tidak ada
     */
    public static Pesanan getPesananAktif(Customer pelanggan)
    {
        for(Pesanan cari : PESANAN_DATABASE){
            if(cari.getStatusAktif() == true){
                return cari;
            }
        }
        return null;
    }
}

public static boolean removePesanan(Pesanan pesan) {
    for (Pesanan cari : PESANAN_DATABASE) {
        if (cari.equals(pesan)) {
            if (cari.getRoom() != null) {
                Administrasi.pesananDibatalkan(pesan);
            } else {
                if (cari.getStatusAktif() == true) {
                    cari.setStatusAktif(false);

                }
            }

            PESANAN_DATABASE.remove(pesan);
            return true;
        }
    }

    return false;
}