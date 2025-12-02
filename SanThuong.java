/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlysancaulong;

/**
 *
 * @author DELL
 */
import java.util.Scanner;

public class SanThuong extends San {
    private double donGiaTheoGio;

    public SanThuong() {
        super();
    }

    @Override
    public void Nhap() {
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap don gia thuong/gio: ");
        this.donGiaTheoGio = sc.nextDouble();
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println(" - Loai: Thuong - Gia: " + donGiaTheoGio);
    }

    @Override
    public double tinhGia(int soGio) {
        return soGio * donGiaTheoGio;
    }
}