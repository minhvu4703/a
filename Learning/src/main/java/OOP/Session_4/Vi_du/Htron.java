package Learning.src.main.java.OOP.Session_4.Vi_du;

public class Htron implements hinhHoc {
    public double r;
    @Override
    public void nhap() {
        System.out.print("Ban kinh = ");
        r = input.nextDouble();
    }

    @Override
    public void tinhChuVi() {
        double chuvi;
        chuvi = r * 2 * 3.14;
        System.out.println("Chu vi = " + chuvi);
    }

    @Override
    public void tinhDienTich() {
        double dientich;
        dientich = r * r * 3.14;
        System.out.println("Dien tich = " + dientich);
    }
}
