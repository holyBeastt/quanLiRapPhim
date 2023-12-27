/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connect.DBConnect;
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
public class PhimDAO {
    public List<Phim> layDanhSachPhim() {
        Connection conn = null; // Kết nối với csdl
        PreparedStatement ps = null; // Ném câu lệnh query từ netbeans sang sqlserver
        ResultSet rs = null; // Nhận kết quả trả về
        try {
            String query = "select * from Phim";
            conn = new DBConnect().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            List<Phim> l = new ArrayList<>();
            while (rs.next()) {
                Phim i = new Phim(rs.getString(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
                l.add(i);
            }

            return l;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
