
package repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.NhanVien;
import utility.DBContext;
import viewModel.UserLogin;

public class NhanVienRepository {

    public List<NhanVien> all() {
        List<NhanVien> listNhanVien = new ArrayList<>();
        String SELECT_NHANVIEN = "SELECT * FROM NHANVIEN";
        try {
            Connection conn = DBContext.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SELECT_NHANVIEN);
            while (rs.next()) {
                listNhanVien.add(new NhanVien(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getDate(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getInt(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getInt(11),
                        rs.getInt(12)));
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi tại get all()");
            ex.printStackTrace();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(NhanVienRepository.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        return listNhanVien;
    }
    
    public List<UserLogin> getUser() {
        List<UserLogin> listNhanVien = new ArrayList<>();
        String SELECT_NHANVIEN = "SELECT ma, matKhau FROM NHANVIEN";
        try {
            Connection conn = DBContext.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SELECT_NHANVIEN);
            while (rs.next()) {
                listNhanVien.add(new UserLogin(
                        rs.getString(1),
                        rs.getString(2)));
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi tại get getUser()");
            ex.printStackTrace();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(NhanVienRepository.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        return listNhanVien;
    }

    public boolean insert(NhanVien obj) {
        try {
            Connection conn = DBContext.getConnection();
            String INSERT_NHANVIEN = "INSERT INTO NHANVIEN(ma,ten,gioiTinh,ngaySinh,diaChi,sdt,diemTichLuy,soCMT,matKhau,vaiTro,tinhTrang) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareCall(INSERT_NHANVIEN);
            ps.setString(1, obj.getMa());
            ps.setString(2, obj.getTen());
            ps.setInt(3, obj.getGioiTinh());
            ps.setDate(4, (Date) obj.getNgaySinh());
            ps.setString(5, obj.getDiaChi());
            ps.setString(6, obj.getSdt());
            ps.setInt(7, obj.getDiemTichLuy());
            ps.setString(8, obj.getSoCMT());
            ps.setString(9, obj.getMatKhau());
            ps.setInt(10, obj.getVaiTro());
            ps.setInt(11, obj.getTinhTrang());

            System.out.println(INSERT_NHANVIEN);
            ps.execute();
            ps.close();
            conn.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Lỗi tại insert()");
            return false;
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(NhanVienRepository.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean delete(NhanVien obj) {
        try {
            Connection conn = DBContext.getConnection();
            String UPDATE_NHANVIEN = "UPDATE NHANVIEN SET tinhTrang = ?,"
                    + "WHERE id = ?";
            PreparedStatement ps = conn.prepareCall(UPDATE_NHANVIEN);
            ps.setInt(1, obj.getTinhTrang());
            ps.setInt(2, obj.getId());
            System.out.println(UPDATE_NHANVIEN);
            ps.execute();
            ps.close();
            conn.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Lỗi tại delete()");
            return false;
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(NhanVienRepository.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean update(NhanVien obj) {
        try {
            Connection conn = DBContext.getConnection();
            String UPDATE_NHANVIEN = "UPDATE NHANVIEN SET ten = ?,"
                    + "gioiTinh = ?,"
                    + "ngaySinh = ?,"
                    + "diaChi = ?,"
                    + "sdt = ?,"
                    + "SDT = ?,"
                    + "soCMT = ?,"
                    + "matKhau = ?,"
                    + "vaiTro = ?,"
                    + "tinhTrang = ? "
                    + "WHERE ma = ?";
            PreparedStatement ps = conn.prepareCall(UPDATE_NHANVIEN);
            ps.setString(1, obj.getTen());
            ps.setInt(2, obj.getGioiTinh());
            ps.setDate(3, (Date) obj.getNgaySinh());
            ps.setString(4, obj.getDiaChi());
            ps.setString(5, obj.getSdt());
            ps.setString(6, obj.getSoCMT());
            ps.setString(7, obj.getMatKhau());
            ps.setInt(8, obj.getVaiTro());
            ps.setInt(9, obj.getTinhTrang());
            ps.setString(10, obj.getMa());
            System.out.println(UPDATE_NHANVIEN);
            ps.execute();
            ps.close();
            conn.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Lỗi tại update()");
            return false;
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(NhanVienRepository.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return false;
    }
    public static void main(String[] args) {
        NhanVienRepository repo = new NhanVienRepository();
        List<NhanVien> list = repo.all();
        System.out.println(list.get(1));
    }
}
