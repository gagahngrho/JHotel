package jhotel;
import java.util.ArrayList;

/**
 * Class DatabasePesanan digunakan sebagai database untuk pesanan.
 *
 * @author  Anggoro Gagah Nugroho
 * @version 29/5/2018
 */

public class DatabasePesanan
{
    private static ArrayList<Pesanan> PESANAN_DATABASE = new ArrayList<>();
    private static int LAST_PESANAN_ID = 0;

    /**
     * method untuk membuat arraylist berisi pesanan
     *
     * @return PESANAN_DATABASE
     */
    public static ArrayList<Pesanan> getPesananDatabase(){
        return PESANAN_DATABASE;
    }

    /**
     * untuk mendapatkan ID dari pesanan terakhir
     *
     * @return LAST_PESANAN_ID
     */
    public static int getLastPesananID() {
        return LAST_PESANAN_ID;
    }

    /**
     * untuk menambahkan pesanan ke database.
     *
     * @param baru berisi objek pesanan.
     */
    public static boolean addPesanan(Pesanan baru) throws PesananSudahAdaException{
        if(getPesananAktif(baru.getPelanggan()) == null){
            PESANAN_DATABASE.add(baru);
            LAST_PESANAN_ID = baru.getID();
            return true;
        }
        else {
            throw new PesananSudahAdaException(baru);
        }
    }
    /**
     * untuk mengambil data pemesanan.
     *
     * @param id berisi id
     * @return pesanan mengembalikan data pemesanan jika id yang dipesan telah ada.
     */
    public static Pesanan getPesanan(int id){
        for (Pesanan pesan :
                PESANAN_DATABASE) {
            if(pesan.getID() == id){
                return pesan;
            }
        }
        return null;
    }
    /**
     * Untuk mengambil data pemesanan.
     *
     * @return Pesanan mengembalikan data pemesanan jika Room yang dipesan telah ada.
     */
    public static Pesanan getPesananAktif(Room kamar){
        for (Pesanan pesan :
                PESANAN_DATABASE) {
            if(kamar.equals(pesan.getRoom()) && pesan.getStatusAktif()){
                return pesan;
            }
        }
        return null;
    }
    /**
     * untuk mengambil data pesanan aktif
     *
     * @param pelanggan berisi objek Customer
     * @return pesanan
     */
    public static Pesanan getPesananAktif(Customer pelanggan){
        for (Pesanan pesan :
                PESANAN_DATABASE) {
            if (pesan.getStatusAktif() == true && pesan.getPelanggan().equals(pelanggan) == true){
                return pesan;
            }
        }
        return null;
    }

    /**
     * untuk menghapus pesanan dari database.
     */
    public static boolean removePesanan(Pesanan pesan) throws PesananTidakDitemukanException{
        for (Pesanan pesan2 :
                PESANAN_DATABASE) {
            if(pesan.equals(pesan2)){
                if(pesan.getRoom() != null) Administrasi.pesananDibatalkan(pesan);
                else if(pesan.getStatusAktif() == true) pesan.setStatusAktif(false);
                PESANAN_DATABASE.remove(pesan2);
                return true;
            }
        }
        throw new PesananTidakDitemukanException(pesan.getPelanggan());
    }


}
