package Learning.src.main.java.OOP.Session_4.Vi_du;

import java.util.Scanner;
public class HinhCN implements hinhHoc {
    public double CD;
    public double CR;
    @Override
    public void nhap() {
        System.out.print("CD = ");
        CD = input.nextDouble();
        System.out.print("CR = ");
        CR = input.nextDouble();
    }
    @Override
    public void tinhChuVi() {
        double P;
        P = (CD + CR) * 2;
        System.out.println("Chu vi = " + P);
    }

    @Override
    public void tinhDienTich() {
        double S;
        S = CD * CR;
        System.out.println("Dien tich = " + S);
    }
}
