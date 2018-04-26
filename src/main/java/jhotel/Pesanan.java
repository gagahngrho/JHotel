package jhotel;

/**
 * 
 *
 * @author Anggoro Gagah Nugroho
 * @version 1/3/2018
 */

import java.util.*;

public class Pesanan
{
    private int id;
    private double biaya;
    private double jumlahHari;
    private Customer pelanggan;
    private boolean isAktif;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
    private Date tanggalPesan;

    //Method Constructor dari Class
    /**
     * Ini merupakan Constructor dari Class Pesanan
     *
     * @param jumlahHari merupakan parameter untuk menentukan banyak hari
     * @param pelanggan merupakan parameter yang akan menunjukan pelanggan yang memesan
     */
    public Pesanan(double jumlahHari, Customer pelanggan)
    {
        this.jumlahHari = jumlahHari;
        this.pelanggan = pelanggan;
        this.tanggalPesan = new GregorianCalendar().getTime();
        //biaya = kamar.getDailyTariff()*jumlahHari;
        isAktif = true;
        id = DatabasePesanan.getLastPesananID() + 1;
    }

    //Methode Getter (Accessor) untuk class

    public int getID()
    {
        return id;
    }

    /**
     * Ini merupakan Methode untuk mendapatkan biaya dari objek class pesanan
     *
     * @return biaya mendapatkan biaya bayar dari pesanan
     */
    public double getBiaya()
    {
        return biaya;
    }

    /**
     * A method to get the sum of the days
     * @return  the double value of jumlahHari
     */
    public double getJumlahHari()
    {
        return jumlahHari;
    }

    /**
     * A method to get the details of the orderer
     * @return  the Customer value of pelanggan
     */
    public Customer getPelanggan()
    {
        return pelanggan;
    }

    /**
     * A method to know whether the order is active or not
     * @return  the boolean value of isAktif
     */
    public boolean getStatusAktif()
    {
        return isAktif;
    }

    /**
     * A method to know whether the order is being processed
     * or not
     * @return  the boolean value of isDiproses
     */
    public boolean getStatusDiproses()
    {
        return isDiproses;
    }

    /**
     * A method to know whether the order is already been done
     * or not
     *
     * @return  the boolean value of isSelesai
     */
    public boolean getStatusSelesai()
    {
        return isSelesai;
    }

    /**
     * A method to get the details of the room
     * @return  the Room value of kamar
     */
    public Room getRoom()
    {
        return kamar;
    }

    /**
     * A method to get the date of order
     * @return  the Date value of tanggalPesan
     */
    public Date getTanggalPesan()
    {
        System.out.println(tanggalPesan.toString());
        return tanggalPesan;
    }

    /**
     * A method to set the order's id
     * @param id integer value of id
     */
    public void setID(int id)
    {
        this.id = id;
    }

    /**
     * A method to set the order's cost
     * The total cost is the daily tariff multiple by sum of the days
     */
    public void setBiaya()
    {
        //The daily tariff is taken from the Room object kamar
        biaya = kamar.getDailyTariff()*jumlahHari;
    }

    /**
     * A method to set the sum of the days
     * @param  jumlahHari  the sum of the days in double value
     */
    public void setJumlahHari(double jumlahHari)
    {
        this.jumlahHari = jumlahHari;
    }

    /**
     * A method to set the details of new orderer
     * @param  pelanggan  details of new orderer in Customer value
     */
    public void setPelanggan(Customer pelanggan)
    {
        this.pelanggan = pelanggan;
    }

    /**
     * A method to set the status of the order's activation
     * @param  aktif  status of the process in boolean value
     */
    public void setStatusAktif(boolean aktif)
    {
        isAktif = aktif;
    }

    /**
     * A method to set the status of the order's process
     * @param  diproses  status of the process in boolean value
     */
    public void setStatusDiproses(boolean diproses)
    {
        isDiproses = diproses;
    }

    /**
     * A method to set the status of the finished process
     * @param  selesai  status of the process in boolean value
     */
    public void setStatusSelesai(boolean selesai)
    {
        isSelesai = selesai;
    }

    /**
     * A method to set the details of the room
     * @param  kamar  the room that is ordered in Room value
     */
    public void setRoom(Room kamar){
        this.kamar = kamar;
    }

    /**
     * A method to set the order's date
     * @param  tanggalPesan  the order's date in Date value
     */
    public void setTanggalPesan(Date tanggalPesan)
    {
        this.tanggalPesan = tanggalPesan;
    }

    /**
     * A method to print the details of the order
     */
    public String toString()
    {
        String final_status = "KOSONG";
        if(getStatusDiproses() == true && getStatusSelesai() == false)
        {
            final_status = "DIPROSES";
        }
        else if(getStatusDiproses() == false && getStatusSelesai() == false)
        {
            final_status = "KOSONG";
        }
        else if(getStatusDiproses() == false && getStatusSelesai() == true)
        {
            final_status = "SELESAI";
        }

        if(getRoom() == null){
            return ("Dibuat oleh " + pelanggan.getNama() +
                    "\nStatus Pesanan: " + final_status + ".\n");
        }
        else {
            return ("Dibuat oleh " + pelanggan.getNama() +
                    ". \nProses booking untuk hotel " + getRoom().getHotel().getNama()
                    + " dengan kamar nomor " + getRoom().getNomorKamar()
                    + " dan tipe kamar yang diinginkan " + getRoom().getTipeKamar()
                    + ".\nStatus Pesanan: " + final_status + ".\n");
        }
    }
}







