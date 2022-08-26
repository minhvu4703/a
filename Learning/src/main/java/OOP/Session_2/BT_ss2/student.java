package Learning.src.main.java.OOP.Session_2.BT_ss2;

public class student extends person {
    public static void nhapThongtin() {
        System.out.println("Nhập thông tin của sinh viên");
        st1.input_information();
        System.out.print("Mã sinh viên : ");
        st1.maSV = input.nextLine();
        System.out.print("Email : ");
        st1.email = input.nextLine();
        System.out.print("Điểm trung bình : ");
        st1.TB = input.nextInt();
    }

    public static void inThongTin() {
        System.out.println(st1.toString());
    }

    public static void xetHocBong() {
        if (st1.TB >= 8) {
            System.out.println("Đủ điều kiện để được nhận học bổng");
        } else {
            System.out.println("Không đủ điều kiện để được nhận học bổng");
        }
    }
}
