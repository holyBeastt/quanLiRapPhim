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
public class Phim {
    private String maPhim;
    private String tenPhim;
    private Date ngayChieu;
    private String gioChieu;
    private String daoDien;
    private String nuocSanXuat;
    private String theLoai;

    public String getMaPhim() {
        return maPhim;
    }

    public void setMaPhim(String maPhim) {
        this.maPhim = maPhim;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public Date getNgayChieu() {
        return ngayChieu;
    }

    public void setNgayChieu(Date ngayChieu) {
        this.ngayChieu = ngayChieu;
    }

    public String getGioChieu() {
        return gioChieu;
    }

    public void setGioChieu(String gioChieu) {
        this.gioChieu = gioChieu;
    }

    public String getDaoDien() {
        return daoDien;
    }

    public void setDaoDien(String daoDien) {
        this.daoDien = daoDien;
    }

    public String getNuocSanXuat() {
        return nuocSanXuat;
    }

    public void setNuocSanXuat(String nuocSanXuat) {
        this.nuocSanXuat = nuocSanXuat;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public Phim() {
    }

    public Phim(String maPhim, String tenPhim, Date ngayChieu, String gioChieu, String daoDien, String nuocSanXuat, String theLoai) {
        this.maPhim = maPhim;
        this.tenPhim = tenPhim;
        this.ngayChieu = ngayChieu;
        this.gioChieu = gioChieu;
        this.daoDien = daoDien;
        this.nuocSanXuat = nuocSanXuat;
        this.theLoai = theLoai;
    }

    @Override
    public String toString() {
        return "Phim{" + "maPhim=" + maPhim + ", tenPhim=" + tenPhim + ", ngayChieu=" + ngayChieu + ", gioChieu=" + gioChieu + ", daoDien=" + daoDien + ", nuocSanXuat=" + nuocSanXuat + ", theLoai=" + theLoai + '}';
    }
    
    
    
}
