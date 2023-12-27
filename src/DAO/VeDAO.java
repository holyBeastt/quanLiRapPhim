/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connect.DBConnect;
import Entities.Ve;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class VeDAO {
    public List<Ve> layDanhSachVe() {
        Connection conn = null; // Kết nối với csdl
        PreparedStatement ps = null; // Ném câu lệnh query từ netbeans sang sqlserver
        ResultSet rs = null; // Nhận kết quả trả về
        try {
            String query = "select * from VE";
            conn = new DBConnect().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            List<Ve> l = new ArrayList<>();
            while (rs.next()) {
                Ve i = new Ve(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
                l.add(i);
            }

            return l;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
    
        public void themVe(Ve s) {
        Connection con = null;
        Statement st = null;

        try {
            String query = "INSERT INTO MONHOC(MaVe, LoaiVe, MaPhim, MaPhong, Gia) VALUES"
                    + "(" + "'" + s.getMaVe() 
                    + "','" + s.getLoaiVe()
                    + "','"+ s.getMaPhim()
                    + "','"+ s.getMaPhong()
                    + "'," + s.getGia();
             con = new DBConnect().getConnection();
            st = con.createStatement();
            int result = st.executeUpdate(query);

            System.out.println("Có " + result + " dòng được cập nhật");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void xoaMonHoc(int MaMH) {
        Connection con = null;
        Statement st = null;
        try{
            con = new DBConnect().getConnection();
            st = con.createStatement();
            String query = "DELETE MONHOC WHERE MAMH =" + MaMH;
            
            int result = st.executeUpdate(query);
            
            System.out.println(result + "dòng đc xóa");
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void capNhatMonHoc(int MaMH, String change) {
        Connection con = null;
        Statement st = null;
        /*
        try{
            con = new DBConnect().getConnection();
            st = con.createStatement();
            String query = "UPDATE MONHOC "
                    + "SET TenMH = " +"N'"+ change + "'" 
                    + " WHERE MaMH = "+MaMH;
            int result = st.executeUpdate(query);
            
            System.out.println(result + "dòng cập nhật");
            
        }catch (Exception e){
            e.printStackTrace();
        }
*/
        try{
            PreparedStatement ps = con.prepareStatement("update Monhoc set TenMH ='?' where MaMH = ?");
            ps.setString(1, change);
            ps.setInt(2, MaMH);
            
            System.out.println(ps.executeUpdate());
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
