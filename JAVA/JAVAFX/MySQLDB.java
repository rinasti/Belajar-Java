import java.sql.*;
public class MySQLDB {
    static Connection cn ;
    public static Connection getConnection(){
        try{
    cn =
DriverManager.getConnection("jdbc:mysql://localhost/dbjava", "nina", "123");
System.out.println("Koneksi berhasil");
        }catch(SQLException se) {
            se.printStackTrace();
        }
        return cn;
        }
    public static void main(String[] args) {
        MsSQLDB.getConnection();
    }
}

