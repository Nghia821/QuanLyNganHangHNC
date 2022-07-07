package DBCN;

import java.util.ArrayList;
import nganhang.taikhoannhanvien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB_tknv {

    public ArrayList<taikhoannhanvien> laytaikhoan() {

        ArrayList<taikhoannhanvien> dstaikhoan = new ArrayList<>();

        try {
            String sql = "Select * From taikhoan";
            ResultSet rs = ConectDB.thuchien_SQL(sql);
            while (rs.next()) {
                
                taikhoannhanvien tk1 = new taikhoannhanvien (rs.getString("taikhoan"), rs.getString("matkhau"));
                dstaikhoan.add(tk1);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DB_tknv.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dstaikhoan;
    }
}
