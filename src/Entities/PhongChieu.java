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
public class PhongChieu {
    private String maPhongChieu;
    private int soCho;
    private float dienTich;

    public String getMaPhongChieu() {
        return maPhongChieu;
    }

    public void setMaPhongChieu(String maPhongChieu) {
        this.maPhongChieu = maPhongChieu;
    }

    public int getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public PhongChieu() {
    }

    public PhongChieu(String maPhongChieu, int soCho, float dienTich) {
        this.maPhongChieu = maPhongChieu;
        this.soCho = soCho;
        this.dienTich = dienTich;
    }
    
    
}
