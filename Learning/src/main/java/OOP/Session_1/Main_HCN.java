package OOP.Session_1;

import java.util.Scanner;

public class Main_HCN {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
// Hinh chu nhat thu 1
        System.out.println("------------------- Hinh chu nhat thu nhat --------------------");
        HCN hcn1 = new HCN();
        System.out.println("Nhap chieu dai va chieu rong");
        System.out.print("Chieu dai = ");
        hcn1.chieuDai = input.nextInt();
        System.out.print("Chieu rong = ");
        hcn1.chieuRong = input.nextInt();
        hcn1.tinhDienTich();
        System.out.println();
        hcn1.tinhChuVi();
        System.out.println();
// Hinh chu nhat thu 2
        System.out.println("------------------- Hinh chu nhat thu hai  --------------------");
        HCN hcn2 = new HCN(5,6);
//        System.out.println("Nhap chieu dai va chieu rong");
//        System.out.print("Chieu dai = ");
//        hcn2.chieuDai = input.nextInt();
//        System.out.print("Chieu rong = ");
//        hcn2.chieuRong = input.nextInt();
//        hcn2.tinhDienTich();
//        System.out.println();
//        hcn2.tinhChuVi();
        System.out.println(hcn2.toString());
        hcn2.tinhChuVi();
        System.out.println();
        hcn2.tinhDienTich();
    }
}
