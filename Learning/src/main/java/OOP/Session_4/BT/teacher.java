package Learning.src.main.java.OOP.Session_4.BT;

import java.util.Scanner;

public class teacher extends person {
// Thong tin teacher
    public static Scanner input = new Scanner(System.in);
    public double can_cuoc;
    public String email;
    public String chuyen_nganh;
    public double luongCoBan;
    public double luongTheoGio;
    public double soGioLam;
    public int thang;
    public int nam;
// Input
    public void Input(){
        System.out.println("Nhap thong tin giao vien");
        System.out.print("Nhap ten:");
        name = input.nextLine();
        System.out.print("Nhap gender ");
        gender = input.nextLine();
        System.out.print("Nhap dia chi: ");
        address = input.nextLine();
        System.out.print("Nhap birthday: ");
        birth_day = input.nextLine();
        System.out.print("Nhap so CCCD: ");
        can_cuoc = input.nextInt();
        input.nextLine();
        System.out.print("Nhap email:");
        email = input.nextLine();
        System.out.print("Nhap chuyen nganh: ");
        chuyen_nganh = input.nextLine();
        System.out.print("Nhap luong theo gio: ");
        luongTheoGio = input.nextDouble();
        System.out.print("Nhap so gio lam: ");
        soGioLam = input.nextDouble();
        System.out.print("Nhap thang: ");
        thang =input.nextInt();
        System.out.print("Nhap nam: ");
        nam = input.nextInt();

    }
// Override
    @Override
    public String toString() {
        return "Giao vien: " + '\n' +
                '\t'+"Ho va ten: " + name + '\n' +
                '\t'+ "Gioi tinh: " + gender + '\n' +
                '\t'+ "Dia chi: " + address + '\n' +
                '\t'+"Ngay thang nam sinh: " + birth_day + '\n' +
                '\t'+"So CCCD: " + can_cuoc + '\n' +
                '\t'+ "Email: " + email + '\n' +
                '\t'+"Chuyen nganh: " + chuyen_nganh + '\n' +
                '\t'+ "Luong theo gio: " + luongTheoGio + '\n' +
                '\t'+ "So gio lam: " + soGioLam + '\n' +
                '\t'+ "Thang: " + thang + '\n' +
                '\t'+ "Nam: " + nam + "\n";
    }
// Tinh luong
    public void tinhluong(){
        luongCoBan = luongTheoGio * soGioLam;
        System.out.println("So luong co ban la: " + luongCoBan);
    }
}