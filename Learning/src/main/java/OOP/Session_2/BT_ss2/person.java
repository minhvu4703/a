package Learning.src.main.java.OOP.Session_2.BT_ss2;

import java.util.Scanner;

public class person {
    public static student st1 = new student();
    public static Scanner input =new Scanner(System.in);
    public String ten;
    public String gioiTinh;
    public String diaChi;
    public String ngaySinh;
    public String maSV;
    public double TB;
    public String email;
    public void input_information(){
        System.out.print("Họ và tên : ");
        st1.ten = input.nextLine();
        System.out.print("Giới tính : ");
        st1.gioiTinh = input.nextLine();
        System.out.print("Địa chỉ : ");
        st1.diaChi = input.nextLine();
        System.out.print("Ngày tháng năm sinh : ");
        st1.ngaySinh = input.nextLine();
    }
    @Override
    public String toString() {
        return "Thong tin sinh vien: " +
                "Tên: " + ten + '\n' +
                "Giới tính: " + gioiTinh + '\n' +
                "Địa chỉ: " + diaChi + '\n' +
                "Ngày sinh: " + ngaySinh + '\n' +
                "Mã sinh viên: " + maSV + '\n' +
                "Email: " + email + '\n' +
                "Điêm trung bình" + TB + '\n' +"";
    }
    public void input_person(){
        System.out.println(input);
    }
    public void input_person(String ten, String gioiTinh, String ngaySinh){
        System.out.println(input);
    }
}

