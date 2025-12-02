/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlysancaulong;

/**
 *
 * @author DELL
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLySan ql = new QuanLySan();
        Scanner sc = new Scanner(System.in);
        
        int chon;
        do {
            System.out.println("\n=== QUAN LY SAN CAU LONG ===");
            System.out.println("1. Them khach hang");
            System.out.println("2. Them san thuong");
            System.out.println("3. Them san VIP");
            System.out.println("4. Xem danh sach san");
            System.out.println("5. Tao phieu dat san");
            System.out.println("6. Ghi du lieu");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            chon = sc.nextInt();
            sc.nextLine(); 

            switch (chon) {
                case 1:
                    KhachHang kh = new KhachHang();
                    kh.Nhap();
                    ql.themKhachHang(kh);
                    break;
                case 2:
                    SanThuong st = new SanThuong();
                    st.Nhap();
                    ql.themSan(st);
                    break;
                case 3:
                    SanVip sv = new SanVip();
                    sv.Nhap();
                    ql.themSan(sv);
                    break;
                case 4:
                    ql.hienThiDanhSachSan();
                    break;
                case 5:
                    ql.taoPhieuDatSan();
                    break;
                case 6:
                    ql.ghiDuLieu();
                    break;
                case 0:
                    System.out.println("Ket thuc chuong trinh.");
                    break;
                default:
                    System.out.println("Chon sai! Vui long chon lai.");
            }
        } while (chon != 0);
    }
}