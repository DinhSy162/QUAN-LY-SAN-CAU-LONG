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

public class SanVip extends San {
    private double donGiaTheoGio;
    private double phiDichVuTheoGio;

    public SanVip() {
        super();
    }

    @Override
    public void Nhap() {
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap don gia VIP/gio: ");
        this.donGiaTheoGio = sc.nextDouble();
        System.out.print("Nhap phi dich vu/gio: ");
        this.phiDichVuTheoGio = sc.nextDouble();
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println(" - Loai: VIP - Gia: " + donGiaTheoGio + " - Phi DV: " + phiDichVuTheoGio);
    }

    @Override
    public double tinhGia(int soGio) {
        return soGio * (donGiaTheoGio + phiDichVuTheoGio);
    }
}