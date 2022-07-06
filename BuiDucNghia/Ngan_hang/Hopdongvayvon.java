
package nganhang;

import java.util.Date;

public class Hopdongvayvon {
    
    private int mavay;
    private double sotienvay;
    private double muclaisuat;
    private Date ngayvay;
    private int thoihanvay;
    private String hinhthuc;
    private String chuhoso;

    public Hopdongvayvon(int mavay, double sotienvay, double muclaisuat, Date ngayvay, int thoihanvay, String hinhthuc, String chuhoso) {
        this.mavay = mavay;
        this.sotienvay = sotienvay;
        this.muclaisuat = muclaisuat;
        this.ngayvay = ngayvay;
        this.thoihanvay = thoihanvay;
        this.hinhthuc = hinhthuc;
        this.chuhoso = chuhoso;
    }

    public int getMavay() {
        return mavay;
    }

    public void setMavay(int mavay) {
        this.mavay = mavay;
    }

    public double getSotienvay() {
        return sotienvay;
    }

    public void setSotienvay(double sotienvay) {
        this.sotienvay = sotienvay;
    }

    public double getMuclaisuat() {
        return muclaisuat;
    }

    public void setMuclaisuat(double muclaisuat) {
        this.muclaisuat = muclaisuat;
    }

    public Date getNgayvay() {
        return ngayvay;
    }

    public void setNgayvay(Date ngayvay) {
        this.ngayvay = ngayvay;
    }

    public int getThoihanvay() {
        return thoihanvay;
    }

    public void setThoihanvay(int thoihanvay) {
        this.thoihanvay = thoihanvay;
    }

    public String getHinhthuc() {
        return hinhthuc;
    }

    public void setHinhthuc(String hinhthuc) {
        this.hinhthuc = hinhthuc;
    }

    public String getChuhoso() {
        return chuhoso;
    }

    public void setChuhoso(String chuhoso) {
        this.chuhoso = chuhoso;
    }

    
}
