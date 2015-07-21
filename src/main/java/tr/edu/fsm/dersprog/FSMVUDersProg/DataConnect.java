package tr.edu.fsm.dersprog.FSMVUDersProg;

import java.sql.Connection;
import java.sql.DriverManager;
 
public class DataConnect {
 
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://217.199.187.194/cl55-dersprog", "cl55-dersprog", "wH!x3BbsC");
            return con;
        } catch (Exception ex) {
            System.out.println("Database.getConnection() Error -->"
                    + ex.getMessage());
            return null;
        }
    }
 
    public static void close(Connection con) {
        try {
            con.close();
        } catch (Exception ex) {
        }
    }
}