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
import model.HoaDon;
import utility.DBContext;
import viewModel.HoaDonChiTietViewModel;
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

    public List<HoaDon> thongKeHoaDon() {
        List<HoaDon> list = new ArrayList<>();
        String SELECT_THONGKEHOADON = "select id,maHD,ngayTao,ngayThanhToan,tongTien from HoaDon";
        try {
            Connection conn = DBContext.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SELECT_THONGKEHOADON);
            while (rs.next()) {
                list.add(new HoaDon(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5)));
            }
        } catch (Exception ex) {
            System.out.println("Loi tai get hoa don");
        }
        return list;
    }

    public List<HoaDonChiTietViewModel> HoaDonchiTiet() {
        List<HoaDonChiTietViewModel> list = new ArrayList<>();
        String SELECT_HDCT = "select bc.tenBan, dv.ten, ctbc.soLuong, dv.gia from HoaDonChiTiet hdct join HoaDon hd on hdct.idHD = hd.id join BanChoi bc on bc.id = hdct.idBan join ChiTietBanChoi ctbc on ctbc.idBan = bc.id join DichVu dv on ctbc.idDV = dv.id";
        try {
            Connection conn = DBContext.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SELECT_HDCT);
            while (rs.next()) {
                list.add(new HoaDonChiTietViewModel(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getDouble(4)));
            }
        } catch (Exception ex) {
            System.out.println("Loi tai get hoa don");
        }
        return list;
    }

    public List<HoaDon> layHoaDontuNgay(String dateBD, String dateKT) {
        List<HoaDon> listHD = new ArrayList<>();
        String sql = "select id,maHD,ngayTao,ngayThanhToan,tongTien from HoaDon where NGAYTAO between ? and  ? order by NGAYTAO";

        try ( Connection con = DBContext.getConnection();  PreparedStatement sttm = con.prepareStatement(sql)) {
            sttm.setString(1, dateBD);
            sttm.setString(2, dateKT);
            ResultSet rs = sttm.executeQuery();
            while (rs.next()) {
                listHD.add(new HoaDon(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5)));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHD;
    }
}
