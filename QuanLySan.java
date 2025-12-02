/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlysancaulong;

/**
 *
 * @author DELL
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySan implements IReadWrite {
    private List<San> dsSan;
    private List<KhachHang> dsKhachHang;
    private List<DatSan> dsDatSan;

    public QuanLySan() {
        this.dsSan = new ArrayList<>();
        this.dsKhachHang = new ArrayList<>();
        this.dsDatSan = new ArrayList<>();
    }

    public void themSan(San s) {
        dsSan.add(s);
    }

    public void themKhachHang(KhachHang kh) {
        dsKhachHang.add(kh);
    }

    public void taoPhieuDatSan() {
        Scanner sc = new Scanner(System.in);
        
        if (dsKhachHang.isEmpty()) {
            System.out.println("Chua co khach hang nao. Vui long them khach hang truoc.");
            return;
        }
        System.out.print("Nhap ma khach hang dat san: ");
        String maKH = sc.nextLine();
        KhachHang khFound = null;
        for (KhachHang kh : dsKhachHang) {
            if (kh.getMaKH().equals(maKH)) {
                khFound = kh;
                break;
            }
        }
        if (khFound == null) {
            System.out.println("Khong tim thay khach hang!");
            return;
        }

        if (dsSan.isEmpty()) {
            System.out.println("Chua co san nao.");
            return;
        }
        System.out.print("Nhap ma san muon thue: ");
        String maSan = sc.nextLine();
        San sanFound = null;
        for (San s : dsSan) {
            if (s.getMaSan().equals(maSan)) {
                sanFound = s;
                break;
            }
        }
        if (sanFound == null) {
            System.out.println("Khong tim thay san!");
            return;
        }

        DatSan phieu = new DatSan(khFound, sanFound);
        phieu.Nhap(); 
        dsDatSan.add(phieu);
        System.out.println("Dat san thanh cong!");
        
        phieu.Xuat();
    }
    
    public void hienThiDanhSachSan() {
        System.out.println("\n--- DANH SACH SAN ---");
        for (San s : dsSan) {
            s.Xuat();
        }
    }

    @Override
    public void docDuLieu() {
        System.out.println("Dang doc du lieu tu " + FILE_NAME + "...");
    }

    @Override
    public void ghiDuLieu() {
        System.out.println("Dang ghi du lieu vao " + FILE_NAME + "...");
    }
}