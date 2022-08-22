package Learning.src.main.java.Method;

import java.util.Scanner;
// Nhap 2 so nguyen. Tinh tong, hieu, tich, thuong
public class Example_1 {
    // Co 5 method: nhap , tong, hieu, tich, thuong
// Method nhap
    public static int nhap() {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so: ");
        n = input.nextInt();
        return n;
    }
    // Method tinh tong
    public static int tinh_tong(int a, int b){
        int tong = a + b;
        System.out.println("Tong = " + tong);
        return tong;
    }
    // Method tinh hieu
    public static int tinh_hieu(int a, int b) {
        int hieu = a - b;
        System.out.println("Hieu = " + hieu);
        return hieu;
    }
    // Method tinh tich
    public static int tinh_tich(int a, int b){
        int tich = a * b;
        System.out.println("Tich = " + tich);
        return tich;
    }
    // Method tinh thuong
    public static double tinh_thuong(int a, int b) {
        double thuong = (double) a / b;
        System.out.println("Thuong = " + thuong);
        return thuong;
    }
    // Method main
    public static void main(String[] args) {
        int a, b;
        a = nhap();
        b = nhap();
        tinh_tong(a, b);
        tinh_hieu(a, b);
        tinh_tich(a, b);
        tinh_thuong(a, b);
    }
}