/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.sql.Date;

/**
 *
 * @author DELL
 */
public class NhanVien {
    private String maNV;
    private String hoTen;
    private String chucVu;
    private String sdt;
    private Date ngaySinh;

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTen, String chucVu, String sdt, Date ngaySinh) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.chucVu = chucVu;
        this.sdt = sdt;
        this.ngaySinh = ngaySinh;
    }
    
    
}
