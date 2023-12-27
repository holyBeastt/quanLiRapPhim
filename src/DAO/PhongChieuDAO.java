/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connect.DBConnect;
import Entities.PhongChieu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class PhongChieuDAO {

    Connection conn = null; // Kết nối với csdl
    PreparedStatement ps = null; // Ném câu lệnh query từ netbeans sang sqlserver
    ResultSet rs = null; // Nhận kết quả trả về

    public List<PhongChieu> layDanhSachPhongChieu() {
        try {
            String query = "select * from phongchieu";
            conn = new DBConnect().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            List<PhongChieu> l = new ArrayList<>();
            while (rs.next()) {
                PhongChieu i = new PhongChieu(rs.getString(1), rs.getInt(2), rs.getFloat(3));
                l.add(i);
            }

            return l;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
