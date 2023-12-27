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
public class HoaDon {
    private String maHoaDon;
    private String sdt;
    private String maVe;
    private int soLuong;
    private float giaTien;
    private Date ngayThanhToan;

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getMaVe() {
        return maVe;
    }

    public void setMaVe(String maVe) {
        this.maVe = maVe;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(float giaTien) {
        this.giaTien = giaTien;
    }

    public Date getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(Date ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public HoaDon() {
    }

    public HoaDon(String maHoaDon, String sdt, String maVe, int soLuong, float giaTien, Date ngayThanhToan) {
        this.maHoaDon = maHoaDon;
        this.sdt = sdt;
        this.maVe = maVe;
        this.soLuong = soLuong;
        this.giaTien = giaTien;
        this.ngayThanhToan = ngayThanhToan;
    }
    
    
}
