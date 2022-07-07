
package DBCN;

import java.util.ArrayList;
import nganhang.lichsu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB_lichsu {
    
    public ArrayList<lichsu> layls() {

        ArrayList<lichsu> dsls = new ArrayList<>();

        try {
            String sql = "Select * From Lichsu";
            ResultSet rs = ConectDB.thuchien_SQL(sql);
            while (rs.next()) {
                
                lichsu ls = new lichsu (rs.getInt("Magd"), rs.getString("Time"),rs.getString("Nhanvien"),
                rs.getString("Noidung"),rs.getString("Chuhoso"));
                
                dsls.add(ls);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DB_lichsu.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dsls;
    } 
    
}
