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
public class Ve {
    private String maVe;
    private String loaiVe;
    private String maPhim;
    private String maPhong;
    private float gia;

    public String getMaVe() {
        return maVe;
    }

    public void setMaVe(String maVe) {
        this.maVe = maVe;
    }

    public String getLoaiVe() {
        return loaiVe;
    }

    public void setLoaiVe(String loaiVe) {
        this.loaiVe = loaiVe;
    }

    public String getMaPhim() {
        return maPhim;
    }

    public void setMaPhim(String maPhim) {
        this.maPhim = maPhim;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhongChieu(String maPhong) {
        this.maPhong = maPhong;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public Ve() {
    }

    public Ve(String maVe, String loaiVe, String maPhim, String maPhong, float gia) {
        this.maVe = maVe;
        this.loaiVe = loaiVe;
        this.maPhim = maPhim;
        this.maPhong = maPhong;
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Ve{" + "maVe=" + maVe + ", loaiVe=" + loaiVe + ", maPhim=" + maPhim + ", maPhong=" + maPhong + ", gia=" + gia + '}';
    }
    
    
    
    
}
