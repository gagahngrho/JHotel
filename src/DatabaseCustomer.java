import java.util.ArrayList;

 /**
 * Class DatabaseCustomer 
 *
 * @author Anggoro Gagah Nugroho
 * @version 1/3/2018
 */
 public class DatabaseCustomer
 {
     //Bagian disini menunjukan Variabel-variabel pada class
     private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<>();
     private static int LAST_CUSTOMER_ID = 0;
     //Methode bagian sini akan dibenarkan, sampai modul integrasi database dengan java

     public static ArrayList<Customer> getCustomerDatabase(){
         return CUSTOMER_DATABASE;
     }

     public static int getLastCustomerID() {
         return LAST_CUSTOMER_ID;
     }


     /**
      * Merupakan metode yang akan digunakan pada link database
      * dengan customer untuk menambah customer kepada database
      */
     public static boolean addCustomer(Customer baru) {
         for (Customer cust :
                 CUSTOMER_DATABASE) {
             if(cust.getID() == baru.getID()) return false;
         }
         CUSTOMER_DATABASE.add(baru);
         LAST_CUSTOMER_ID = baru.getID();
         return true;
     }

     public static Customer getCustomer(int id){
         for (Customer cust :
                 CUSTOMER_DATABASE) {
             if (cust.getID() == id) return cust;
         }
         return null;
     }

     /**
      * Merupakan metode yang akan digunakan pada link database
      * dengan customer untuk menghapus customer kepada database
      */
     public static boolean removeCustomer(int id) {
         for (Customer cust :
                 CUSTOMER_DATABASE) {
             if(cust.getID()==id){
                 for (Pesanan pesan :
                         DatabasePesanan.getPesananDatabase()) {
                     if(pesan.getPelanggan().equals(cust)) DatabasePesanan.removePesanan(pesan);
                 }
                 CUSTOMER_DATABASE.remove(cust);
                 return true;
             }
         }
         return false;
     }

 }
