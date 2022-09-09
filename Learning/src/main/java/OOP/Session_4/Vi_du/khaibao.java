package OOP.Session_4.Vi_du;

import java.util.Scanner;

public class khaibao {
    static Scanner input = new Scanner(System.in);
    public static void hinhcn(){
        System.out.println("Hinh chu nhat ne");
        HinhCN hcn = new HinhCN();
        hcn.nhap();
        hcn.tinhChuVi();
        hcn.tinhDienTich();
    }
    public static void hinhvuon(){
        System.out.println("Hinh vuong ne");
        HVuong hv = new HVuong();
        hv.nhap();
        hv.tinhChuVi();
        hv.tinhDienTich();
    }
    public static void hinhtron(){
        System.out.println("Hinh tron ne");
        Htron ht = new Htron();
        ht.nhap();
        ht.tinhChuVi();
        ht.tinhDienTich();
    }
    public static void hinhTru(){
        System.out.println("Hinh tru ne");
        Htron day = new Htron();
        day.nhap();
        hinhTru htr = new hinhTru(10, day);
        System.out.println("Dien tich xung quanh = " + htr.dienTichXQ(htr.chieuCao, htr.day));
    }
}
