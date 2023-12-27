/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author DELL
 */
public class KhachHang {
    private String sdt;
    private String hoTen;
    private String matkhau;

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public KhachHang() {
    }

    public KhachHang(String sdt, String hoTen, String matkhau) {
        this.sdt = sdt;
        this.hoTen = hoTen;
        this.matkhau = matkhau;
    }

    public KhachHang(String sdt, String matkhau) {
        this.sdt = sdt;
        this.matkhau = matkhau;
    }
    
    
}
