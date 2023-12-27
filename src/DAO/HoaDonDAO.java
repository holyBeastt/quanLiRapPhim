/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connect.DBConnect;
import Entities.HoaDon;
import Entities.Phim;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class HoaDonDAO {
    public List<HoaDon> layDanhSachPhim() {
        Connection conn = null; // Kết nối với csdl
        PreparedStatement ps = null; // Ném câu lệnh query từ netbeans sang sqlserver
        ResultSet rs = null; // Nhận kết quả trả về
        try {
            String query = "select * from HoaDon";
            conn = new DBConnect().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            List<HoaDon> l = new ArrayList<>();
            while (rs.next()) {
                HoaDon i = new HoaDon(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getFloat(5), rs.getDate(6));
                l.add(i);
            }

            return l;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
