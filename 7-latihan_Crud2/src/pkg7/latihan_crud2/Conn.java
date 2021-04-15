package pkg7.latihan_crud2;


import javax.swing.JOptionPane;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {
    static Connection Con;
    public static Connection getConnection(){
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost/db_mahasiswa", "rahmat", "rahmat21");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Koneksi gagal");
        }
        return Con;
    }
}
