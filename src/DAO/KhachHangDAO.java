/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connect.DBConnect;
import Entities.KhachHang;
import Entities.Ve;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class KhachHangDAO {
        public List<KhachHang> layDanhSachKhachHang() {
        Connection conn = null; // Kết nối với csdl
        PreparedStatement ps = null; // Ném câu lệnh query từ netbeans sang sqlserver
        ResultSet rs = null; // Nhận kết quả trả về
        try {
            String query = "select * from KhachHang";
            conn = new DBConnect().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            List<KhachHang> l = new ArrayList<>();
            while (rs.next()) {
                KhachHang i = new KhachHang(rs.getString(1), rs.getString(2));
                l.add(i);
            }

            return l;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
