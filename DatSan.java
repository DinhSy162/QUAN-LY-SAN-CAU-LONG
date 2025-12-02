/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlysancaulong;

/**
 *
 * @author DELL
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DatSan {
    private KhachHang khachHang;
    private San san;
    private LocalDateTime thoiGianBatDau;
    private int soGioThue;

    public DatSan() {
    }

    public DatSan(KhachHang kh, San s) {
        this.khachHang = kh;
        this.san = s;
        this.thoiGianBatDau = LocalDateTime.now(); 
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so gio thue: ");
        this.soGioThue = sc.nextInt();
        this.thoiGianBatDau = LocalDateTime.now(); 
    }

    public double tinhThanhTien() {
        if (san != null) {
            return san.tinhGia(soGioThue);
        }
        return 0;
    }

    public void Xuat() {
        System.out.println("--- PHIEU DAT SAN ---");
        if (khachHang != null) khachHang.Xuat();
        if (san != null) san.Xuat();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        if(thoiGianBatDau != null) {
             System.out.println("Bat dau: " + thoiGianBatDau.format(formatter));
        }
        System.out.println("So gio: " + soGioThue);
        System.out.printf("Thanh tien: %.0f VND\n", tinhThanhTien());
        System.out.println("---------------------");
    }
}