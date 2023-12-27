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
public class TaiKhoanKH {
    private String sdt;
    private String mk;

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getMk() {
        return mk;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }

    public TaiKhoanKH() {
    }

    public TaiKhoanKH(String sdt, String mk) {
        this.sdt = sdt;
        this.mk = mk;
    }
    
    
}
