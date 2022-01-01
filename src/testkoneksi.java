import java.sql.SQLException;
import lib.koneksi;
public class testkoneksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        koneksi connect = new koneksi();
        connect.getKoneksi();
    }
    
}
