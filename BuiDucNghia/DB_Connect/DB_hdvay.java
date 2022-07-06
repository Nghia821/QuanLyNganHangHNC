
package DBCN;

import java.util.ArrayList;
import nganhang.Hopdongvayvon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB_hdvay {
    
    public ArrayList<Hopdongvayvon> layhd() {

        ArrayList<Hopdongvayvon> dshd = new ArrayList<>();

        try {
            String sql = "Select * From Hopdongvayvon";
            ResultSet rs = ConectDB.thuchien_SQL(sql);
            while (rs.next()) {
                
                Hopdongvayvon hd = new Hopdongvayvon (rs.getInt("Msvay"), rs.getDouble("Sotienvay"),rs.getDouble("Muclaisuat"),
                rs.getDate("Ngayvay"),rs.getInt("Thoihan"),rs.getString("Hinhthucthanhtoan"),rs.getString("Chuhoso"));
                
                dshd.add(hd);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DB_hdvay.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dshd;
    } 
    
}
