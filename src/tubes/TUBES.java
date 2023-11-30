/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tubes;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author fazru
 */
public class TUBES {

    /**
     * @param args the command line arguments
     */
//buat koneksi

 public static void main(String[] args) {
 MysqlDataSource dataSource = new MysqlDataSource();
 String DB_URL = "jdbc:mysql://localhost:3306/demo_pbo";
 String DB_USERNAME = "root";
 String DB_PASSWORD = "";
 dataSource.setUrl(DB_URL);
 dataSource.setUser(DB_USERNAME);
 dataSource.setPassword(DB_PASSWORD);
 try {
 Connection conn = dataSource.getConnection();
 System.out.println("Koneksi berhasil");
 } catch (SQLException ex) {
 System.out.println("Eksepsi akses data: " + 
 ex.getMessage());
 }
 }
}