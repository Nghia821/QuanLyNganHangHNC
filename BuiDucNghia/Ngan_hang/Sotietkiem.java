
package nganhang;

import java.util.Date;

public class Sotietkiem {
    
    private int maSTK;
    private double sotiengoc;
    private double laisuat;
    private double sotienlai;
    private Date ngaygui;
    private int thoihangui;
    private String chuhoso;

    public Sotietkiem(int maSTK, double sotiengoc, double laisuat, double sotienlai, Date ngaygui, int thoihangui, String chuhoso) {
        this.maSTK = maSTK;
        this.sotiengoc = sotiengoc;
        this.laisuat = laisuat;
        this.sotienlai = sotienlai;
        this.ngaygui = ngaygui;
        this.thoihangui = thoihangui;
        this.chuhoso = chuhoso;
    }

    public int getMaSTK() {
        return maSTK;
    }

    public void setMaSTK(int maSTK) {
        this.maSTK = maSTK;
    }

    public double getSotiengoc() {
        return sotiengoc;
    }

    public void setSotiengoc(double sotiengoc) {
        this.sotiengoc = sotiengoc;
    }

    public double getLaisuat() {
        return laisuat;
    }

    public void setLaisuat(double laisuat) {
        this.laisuat = laisuat;
    }

    public double getSotienlai() {
        return sotienlai;
    }

    public void setSotienlai(double sotienlai) {
        this.sotienlai = sotienlai;
    }

    public Date getNgaygui() {
        return ngaygui;
    }

    public void setNgaygui(Date ngaygui) {
        this.ngaygui = ngaygui;
    }

    public int getThoihangui() {
        return thoihangui;
    }

    public void setThoihangui(int thoihangui) {
        this.thoihangui = thoihangui;
    }

    public String getChuhoso() {
        return chuhoso;
    }

    public void setChuhoso(String chuhoso) {
        this.chuhoso = chuhoso;
    }

    
    
    
}
