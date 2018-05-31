package jhotel;
/**
 * Class mengenai status pada kamar
 *
 * @author Anggoro Gagah Nugroho
 * @version 29/5/2018
 */
public enum StatusKamar
{
    BOOKED("Booked"),PROCESSED("Processed"),VACANT("Vacant");

    private final String status;

    /**
     * Constructor StatusKamar
     *

     */
    StatusKamar(String status) {
        this.status=status;
    }

    /**
     * toString() - Method pengambilan String
     *
     * @return type mengembalikkan status kamar sebagai string
     */
    public String toString() {
        return this.status;
    }
}
