import java.util.Scanner;

public class phone {
    // Khai bao bien
    public static Scanner input = new Scanner(System.in);
    public String phoneName;
    public String IMEI;
    public double price;
    public String manufacturer;
    public String releasedate;
    public double RAM;
    public double ROM;
    public String chip;
    public String screensize;
    public String size;

    // Nhap
    public void insert(){
        System.out.print("Nhap ten dien thoai: ");
        phoneName = input.nextLine();
        System.out.print("Nhap IMEI: ");
        IMEI = input.nextLine();
        System.out.print("Nhap gia: ");
        price = input.nextInt();
        input.nextLine();
        System.out.print("Nhap nha phat hanh: ");
        manufacturer = input.nextLine();
        System.out.print("Nhap ngay ra mat: ");
        releasedate = input.nextLine();
        System.out.print("Nhap RAM: ");
        RAM = input.nextInt();
        System.out.print("Nhap ROM: ");
        ROM = input.nextInt();
        input.nextLine();
        System.out.print("Nhap chip: ");
        chip = input.nextLine();
        System.out.print("Nhap size man hinh: ");
        screensize = input.nextLine();
        System.out.print("Nhap size dien thoai: ");
        size = input.nextLine();
    }

    // Hien thi
    public String toString() {
        return "Thong tin dien thoai: "
                + '\n' + "Ten dien thoai: " + phoneName + '\n' +
                '\n' +  "So IMEI: '" + IMEI + '\n' +
                '\n' + "Gia thi truong: " + price + '\n' +
                '\n' + "Nhap phat hanh: " + manufacturer + '\n' +
                '\n' +  "Ngay ra mat: " + releasedate + '\n' +
                '\n' +  "Dung luong RAM: " + RAM + '\n' +
                '\n' +   "Dung luong ROM: " + ROM + '\n' +
                '\n' +  "Loai chip: " + chip + '\n' +
                '\n' +   "Kich thuoc man hinh: " + screensize + '\n' +
                '\n' + "Kich thuoc cua dien thoai" + size + '\n' ;
    }
}
