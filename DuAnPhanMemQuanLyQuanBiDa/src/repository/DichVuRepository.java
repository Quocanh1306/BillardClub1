
package repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.DichVu;
import model.KhuyenMai;
import utility.DBContext;

public class DichVuRepository {

    final String insert = "INSERT INTO DichVu(ma, ten, gia, loaiDV, soLuong, tinhTrang) VALUES(?,?,?,?,?,?,?)";
    final String update = "UPDATE DichVu SET TEN = ?, gia = ?, loaiDV = ?, soLuong = ?, tinhTrang=? WHERE ma = ?";
    final String delete = "UPDATE DichVu Set tinhTrang = ? where ma = ?";

    public List<DichVu> getAll() {
        List<DichVu> list = new ArrayList<>();
        String SELECT_DICHVU = "SELECT * FROM DichVu";
        try {
            Connection conn = DBContext.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SELECT_DICHVU);
            while (rs.next()) {
                list.add(new DichVu(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getBigDecimal(4), rs.getString(5), rs.getInt(6), rs.getInt(7)));
            }
        } catch (Exception ex) {
            System.out.println("Loi tai getAll()");
        }
        return list;
    }

    public int createDichVuRepository(DichVu dv) {
        int ketQuaTruyVan = -1;
        try ( Connection con = DBContext.getConnection();  PreparedStatement sttm = con.prepareStatement(insert)) {
            sttm.setString(1, dv.getMa());
            sttm.setString(2, dv.getTen());
            sttm.setBigDecimal(3, dv.getGia());
            sttm.setString(4, dv.getLoaiDV());
            sttm.setInt(5, dv.getSoLuong());
            sttm.setInt(6, dv.getTinhTrang());
            ketQuaTruyVan = sttm.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQuaTruyVan;
    }

    public int updateTacGiaRepository(DichVu dv) {
        int ketQuaTruyVan = -1;
        try ( Connection con = DBContext.getConnection();  PreparedStatement sttm = con.prepareStatement(update)) {
            sttm.setString(1, dv.getTen());
            sttm.setBigDecimal(2, dv.getGia());
            sttm.setString(3, dv.getLoaiDV());
            sttm.setInt(4, dv.getSoLuong());
            sttm.setInt(5, dv.getTinhTrang());
            sttm.setString(7, dv.getMa());
            ketQuaTruyVan = sttm.executeUpdate();
            ketQuaTruyVan = sttm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQuaTruyVan;
    }
    public int deleteDichVuRepository(DichVu dv) {
        int ketQuaTruyVan = -1;
        try ( Connection con = DBContext.getConnection();  PreparedStatement sttm = con.prepareStatement(delete)) {
            sttm.setInt(1, dv.getTinhTrang());
            sttm.setString(2, dv.getMa());
            ketQuaTruyVan = sttm.executeUpdate();
            ketQuaTruyVan = sttm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQuaTruyVan;
    }
}
