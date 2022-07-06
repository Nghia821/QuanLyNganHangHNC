
package DBCN;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConectDB {
    
    public static Connection getConectDB(){
        Connection conn = null;
            
        try {
            String knn = "jdbc:sqlserver://DESKTOP-9B0D12M\\SQLEXPRESS:1433;databaseName=qlNH; user=sa; password=l123456";
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(knn);
            System.out.println("done");
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

public static ResultSet thuchien_SQL(String sql){
    ResultSet rs = null;
        try {
            Connection conn= ConectDB.getConectDB();
            Statement stmt = conn.createStatement();
            rs=stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return rs;
}
    
public static void main(String[] arg ) {
    System.out.println(ConectDB.getConectDB().toString());
}
    
}
