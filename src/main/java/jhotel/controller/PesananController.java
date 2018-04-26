package jhotel.controller;
import jhotel.Pesanan;
import jhotel.DatabasePesanan;
import jhotel.DatabaseCustomer;
import jhotel.DatabaseRoom;
import jhotel.DatabaseHotel;
import jhotel.PesananSudahAdaException;
import jhotel.Administrasi;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.GregorianCalendar;

public class PesananController
{
    public Pesanan pesananCust(int id_customer)
    {
        return DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(id_customer));
    }

    public Pesanan getPesanan(int id_pesanan)
    {
        return DatabasePesanan.getPesanan(id_pesanan);
    }

    public Pesanan bookPesanan(int jumlah_hari, int id_customer, int id_hotel, String nomor_kamar) throws PesananSudahAdaException
    {
        Pesanan baru = new Pesanan(jumlah_hari, DatabaseCustomer.getCustomer(id_customer));
        DatabasePesanan.addPesanan(baru);
        Administrasi.pesananDitugaskan((pesananCust(id_customer)),
                DatabaseRoom.getRoom((DatabaseHotel.getHotel(id_hotel)), nomor_kamar));
        baru.setTanggalPesan(new GregorianCalendar().getTime());
        return baru;
    }

    public Pesanan cancelPesanan(int id_pesanan)
    {
        Administrasi.pesananDibatalkan(DatabasePesanan.getPesanan(id_pesanan));
        return DatabasePesanan.getPesanan(id_pesanan);
    }

    public Pesanan selesaikanPesanan(int id_pesanan)
    {
        Administrasi.pesananSelesai(DatabasePesanan.getPesanan(id_pesanan));
        return DatabasePesanan.getPesanan(id_pesanan);
    }
}