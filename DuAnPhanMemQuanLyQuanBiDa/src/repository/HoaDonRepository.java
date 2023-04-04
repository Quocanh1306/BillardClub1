/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import model.DichVu;
import utility.DBContext;
import viewModel.ThongKeBanChoi;
import viewModel.ThongKeViewModel;

/**
 *
 * @author Acer
 */
public class HoaDonRepository {
    public List<ThongKeViewModel> thongKe() {
        List<ThongKeViewModel> list = new ArrayList<>();
        String SELECT_THONGKE = "select month(ngayThanhToan), sum(tongTien) from HoaDOn group by month(ngayThanhToan)";
        try {
            Connection conn = DBContext.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SELECT_THONGKE);         
            while (rs.next()) {
                list.add(new ThongKeViewModel(rs.getDouble(1), rs.getDouble(2)));
            }
        } catch (Exception ex) {
            System.out.println("Loi tai getAll()");
        }
        return list;
    }
    
    public List<ThongKeBanChoi> thongKeBanChoi() {
        List<ThongKeBanChoi> list = new ArrayList<>();
        String SELECT_THONGKE = "select bc.maBan, sum(hd.tongTien) from HoaDon hd join HoaDonChiTiet hdct on hd.id = hdct.idHD join BanChoi bc on bc.id = hdct.idBan group by bc.maBan";
        try {
            Connection conn = DBContext.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SELECT_THONGKE);         
            while (rs.next()) {
                list.add(new ThongKeBanChoi(rs.getString(1), rs.getDouble(2)));
            }
        } catch (Exception ex) {
            System.out.println("Loi tai getAll()");
        }
        return list;
    }
}
