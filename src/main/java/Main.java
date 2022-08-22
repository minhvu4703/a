import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //      Khai bao a, b, tong, hieu, tich, thuong
        int a;
        int b;
        int tong, hieu, tich;
        float thuong;
        boolean dung_sai;
    //    Tao doi tuong Scanner de nhap du lieu
        Scanner input = new Scanner(System.in);
    //    Nhap du lieu cho a, b
        System.out.print("a =");
        a = input.nextInt();
        System.out.print("b ="); // Sout;
        b = input.nextInt();
    //    Tinh tong a + b
        tong = a + b;
    //    Tinh hieu
        hieu = a - b;
    //    Tinh tich
        tich = a * b;
    //    Tinh thuong
        thuong =(float) a / b;
    //    Hien thi
        System.out.println("Tong a + b =" + tong);
        System.out.println("Hieu a - b =" + hieu);
        System.out.println("Tich a * b =" + tich);
        System.out.println("Thuong a / b =" + thuong);
        dung_sai = true;
        dung_sai = false;
    }
}