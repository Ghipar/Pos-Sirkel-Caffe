
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ghifa
 */
class Config {

    private static final String DB_NAME = "project2";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String URL = "jdbc:mysql://localhost:3306/" + DB_NAME;

    public static Connection configDB() throws SQLException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        return connection;
    }

    public static boolean isConnected() {
        try {
            configDB();
            System.out.println("Database Terkoneksi");
            return true;
        } catch (Exception e) {
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Koneksi Gagal");
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Check");
        isConnected();
       
    }

    //static Connection configDB() {
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
}
