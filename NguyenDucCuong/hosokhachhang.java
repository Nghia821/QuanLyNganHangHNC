
package nganhang;

import java.util.Date;

public class hosokhachhang {
    
    private String maHS;
    private String loaiHS;
    private String tenDK;
    private String sdt;
    private String diachi; 
    private long hanmuc;
    private Date ngaytaoHS;
    private String tentochuc;
    public static String mahoso;
    
    public hosokhachhang(String maHS, String loaiHS, String tenDK, String sdt, String diachi, long hanmuc, Date ngaytaoHS, String tentochuc) {
        this.maHS = maHS;
        this.loaiHS = loaiHS;
        this.tenDK = tenDK;
        this.sdt = sdt;
        this.diachi = diachi;
        this.hanmuc = hanmuc;
        this.ngaytaoHS = ngaytaoHS;
        this.tentochuc = tentochuc;
    }

    public String getMaHS() {
        return maHS;
    }

    public void setMaHS(String maHS) {
        this.maHS = maHS;
    }

    public String getLoaiHS() {
        return loaiHS;
    }

    public void setLoaiHS(String loaiHS) {
        this.loaiHS = loaiHS;
    }

    public String getTenDK() {
        return tenDK;
    }

    public void setTenDK(String tenDK) {
        this.tenDK = tenDK;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public long getHanmuc() {
        return hanmuc;
    }

    public void setHanmuc(long hanmuc) {
        this.hanmuc = hanmuc;
    }

    public Date getNgaytaoHS() {
        return ngaytaoHS;
    }

    public void setNgaytaoHS(Date ngaytaoHS) {
        this.ngaytaoHS = ngaytaoHS;
    }

    public String getTentochuc() {
        return tentochuc;
    }

    public void setTentochuc(String tentochuc) {
        this.tentochuc = tentochuc;
    }

}
