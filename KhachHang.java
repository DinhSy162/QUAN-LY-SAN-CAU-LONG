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

public class KhachHang {
    private String maKH;
    private String tenKH;
    private String soDienThoai;

    public KhachHang() {
    }

    public KhachHang(String maKH, String tenKH, String soDienThoai) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.soDienThoai = soDienThoai;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma KH: ");
        this.maKH = sc.nextLine();
        System.out.print("Nhap ten KH: ");
        this.tenKH = sc.nextLine();
        System.out.print("Nhap SDT: ");
        this.soDienThoai = sc.nextLine();
    }

    public void Xuat() {
        System.out.println("KH: " + maKH + " - " + tenKH + " - " + soDienThoai);
    }

    public String getMaKH() {
        return maKH;
    }
}