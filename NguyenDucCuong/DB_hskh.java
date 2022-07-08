
package DBCN;

import java.util.ArrayList;
import nganhang.hosokhachhang;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB_hskh {
    
    public ArrayList<hosokhachhang> layhoso() {

        ArrayList<hosokhachhang> dshoso = new ArrayList<>();

        try {
            String sql = "Select * From Hoso";
            ResultSet rs = ConectDB.thuchien_SQL(sql);
            while (rs.next()) {
                
                hosokhachhang hs1 = new hosokhachhang (rs.getString("MaHS"), rs.getString("LoaiHS"),rs.getString("Tendk"),rs.getString("Sdt"),
                rs.getString("Diachi"),rs.getLong("Hmtd"),rs.getDate("Ngay"),rs.getString("TenTC"));
                
                dshoso.add(hs1);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DB_hskh.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dshoso;
    }
    
}
