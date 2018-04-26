package jhotel;

/**
 * Write a description of class SingleRoom here.
 *
 * @author Anggoro Gagah Nugroho
 * @version 1.0
 */
public class SingleRoom extends Room
{
    private static TipeKamar TIPE_KAMAR = TipeKamar.SINGLE;
    
    SingleRoom(Hotel hotel, String nomor_kamar)
    {
        super(hotel, nomor_kamar);
    }
    
    public TipeKamar getTipeKamar()
    {
        return TIPE_KAMAR;
    }
    
}

