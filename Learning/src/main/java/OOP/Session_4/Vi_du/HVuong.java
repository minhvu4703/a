package Learning.src.main.java.OOP.Session_4.Vi_du;

public class HVuong implements hinhHoc {
    public double canh;
    @Override
    public void nhap() {
        System.out.print("Nhap canh = ");
        canh = input.nextDouble();
    }

    @Override
    public void tinhChuVi() {
        double chuvi;
        chuvi = canh * 4;
        System.out.println("Chu vi = " + chuvi);
    }

    @Override
    public void tinhDienTich() {
        double dientich;
        dientich = canh * canh;
        System.out.println("Dien tich = " + dientich);
    }
}
