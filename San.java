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

public abstract class San {
    protected String maSan;
    protected String tenSan;
    protected String trangThai; 

    public San() {
    }

    public San(String maSan, String tenSan, String trangThai) {
        this.maSan = maSan;
        this.tenSan = tenSan;
        this.trangThai = trangThai;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma san: ");
        this.maSan = sc.nextLine();
        System.out.print("Nhap ten san: ");
        this.tenSan = sc.nextLine();
        System.out.print("Nhap trang thai: ");
        this.trangThai = sc.nextLine();
    }
    
    public void Xuat() {
        System.out.print("San: " + maSan + " - " + tenSan + " [" + trangThai + "]");
    }

    public abstract double tinhGia(int soGio);

    public String getMaSan() {
        return maSan;
    }
}