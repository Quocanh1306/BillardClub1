/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewModel;

/**
 *
 * @author acer
 */
public class ThongKeViewModel {
    private Double thoiGian;
    private Double doanhThu;

    public ThongKeViewModel() {
    }

    public ThongKeViewModel(Double thoiGian, Double doanhThu) {
        this.thoiGian = thoiGian;
        this.doanhThu = doanhThu;
    }

    public Double getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(Double thoiGian) {
        this.thoiGian = thoiGian;
    }

    public Double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(Double doanhThu) {
        this.doanhThu = doanhThu;
    }
    
}
