package base;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connexion {
    public static Connection getConnection() {
        Connection conn = null;
        String url = "jdbc:oracle:thin:@localhost:1521:EE";
        String username = "scott";
        String password = "tiger";
        try {
            conn = java.sql.DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    public boolean teste_connect() {
        Connection conn = getConnection();
        if (conn != null) {
            return true;
            
        } else {
            return false;
        }
    }
    public ResultSet mandefa_maka(String reqt) {
        Connection conn = getConnection();
        ResultSet rs = null;
        try {
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(reqt);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return rs;
    }

    public void mandefa(String reqt){
        Connection conn = getConnection();
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(reqt);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void close(){
        Connection c = getConnection();
        try {
            c.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
