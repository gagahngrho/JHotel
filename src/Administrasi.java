
/**
 * Class Administrasi 
 *
 * @author Anggoro Gagah Nugroho
 * @version 8/3/2018
 */
public class Administrasi
{
   
    private int x;

    /**
     * Constructor for objects of class Administrasi
     */
    public Administrasi()
    {
    }

    /**
     * Methode administratif untuk memproses ruangan yang akan di assign
     * kepada kamar tertentu
     */
    public static void pesananDitugaskan(Pesanan pesan, Room kamar)
    {
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(true);
        pesan.setRoom(kamar);
        roomAmbilPesanan(pesan,kamar);
        pesan.setStatusAktif(false);
        
    }
    
    /**
     * Methode administratif untuk menyatakan status ruangan dan dilink dengan pesanan
     */
    public static void roomAmbilPesanan(Pesanan pesan, Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.BOOKED);
        kamar.setPesanan(pesan);
        pesan.isAktif(false);
        
    }
    
    /**
     * Methode administratif untuk menyatakan room status jadi vacant dan unlink
     */
    public static void roomLepasPesanan(Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.VACANT);
        kamar.setPesanan(null);
        pesan.isAktif(false);
    }
    
    /**
     * Methode administratif untuk mengubah status pesanan dan status room dan unlink
     */
    public static void pesananDibatalkan(Room kamar)
    {
        kamar.getPesanan().setStatusSelesai(false);
        kamar.getPesanan().setStatusDiproses(false);
        kamar.getPesanan().setRoom(null);
        roomLepasPesanan(kamar);
        pesan.isAktif(false);
        
    }
    
    /**
     * Methode administratif untuk mengubah status pesanan dan status room dan unlink
     */
    public static void pesananSelesai(Room kamar)
    {
        kamar.getPesanan().setStatusSelesai(true);
        kamar.getPesanan().setStatusDiproses(false);
        kamar.getPesanan().setRoom(null);
        roomLepasPesanan(kamar);
        pesan.isAktif(false);
    }
    
    /**
     * Methode administratif untuk mengubah 
     * status pesanan dan status room yang telah membatalkan 
     * pesanan serta me-unlink masing-masing objek.
     */
    public static void pesananDibatalkan(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
        pesan.isAktif(false);

    }
    
    /**
     * Method ini untuk mengubah status pesanan dan status room 
     * yang telah menyelesaikan
     * pesanan serta me-unlink masing-masing objek.
     */
    public static void pesananSelesai(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
        pesan.isAktif(false);
    }
    
}