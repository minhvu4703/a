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
    public void phoneInsert(){
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
        return "Thông tin điện thoại: " +
                '\n' + "Tên điện thoại: " + phoneName + '\n' +
                '\n' + "Số IMEI: '" + IMEI + '\n' +
                '\n' + "Giá thị trường: " + price + " đ" + '\n' +
                '\n' + "Nhà phát hành: " + manufacturer + '\n' +
                '\n' + "Ngày ra mắt: " + releasedate + '\n' +
                '\n' + "Dung lượng RAM: " + RAM + " GB" + '\n' +
                '\n' + "Dung lượng ROM: " + ROM + " GB" + '\n' +
                '\n' + "Loại chip: " + chip + '\n' +
                '\n' + "Kích thước màn hình: " + screensize + " Hz" + '\n' +
                '\n' + "Kích thước của điện thoại" + size + " Hz" + '\n' ;
    }
}
