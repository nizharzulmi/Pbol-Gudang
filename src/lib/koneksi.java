package lib;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Toshiba
 */
public class koneksi {
private Connection connect;    
    private String driverName ="com.mysql.jdbc.Driver"; // Driver Untuk Koneksi Ke MySQL
    private String jdbc = "jdbc:mysql://";
    private String host = "localhost:"; // Bisa Menggunakan IP Anda
    private String port = "3306/"; //port MySQL
    private String database = "db_gudang"; // Database yang akan digunakan
    private String url = jdbc + host + port + database;
    private String username = "root"; // username default mysql
    private String password ="";
   
    public Connection getKoneksi () throws SQLException {
        if (connect == null) {
            try {
              Class.forName(driverName);
              System.out.println("Class Driver Ditemukan");
            try {
                connect = DriverManager.getConnection(url, username, password);
                System.out.println("Koneksi Database Sukses");
            }   catch (SQLException se) {
                System.out.println("Koneksi Database Gagal : " + se);
                System.exit(0);
             }
         }    catch (ClassNotFoundException cnfe) {
              System.out.println("Class Driver Tidak Ditemukan, Terjadi Kesalahan Pada : " + cnfe);
              System.exit(0);
         }
       }
       return connect;
    }

    public void getkoneksi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
