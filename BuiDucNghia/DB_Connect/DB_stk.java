
package DBCN;

import java.util.ArrayList;
import nganhang.Sotietkiem;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB_stk {
    
    public ArrayList<Sotietkiem> laystk() {

        ArrayList<Sotietkiem> dsstk = new ArrayList<>();

        try {
            String sql = "Select * From Sotietkiem";
            ResultSet rs = ConectDB.thuchien_SQL(sql);
            while (rs.next()) {
                
                Sotietkiem stk = new Sotietkiem (rs.getInt("Msstk"), rs.getDouble("Sotiengoc"),rs.getDouble("Laisuat"),rs.getDouble("Sotienlai"),
                rs.getDate("Ngaytao"),rs.getInt("Thoihan"),rs.getString("Chuhoso"));
                
                dsstk.add(stk);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DB_stk.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dsstk;
    }
    
    
}
