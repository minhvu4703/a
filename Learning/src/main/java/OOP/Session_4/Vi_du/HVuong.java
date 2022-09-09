package OOP.Session_4.Vi_du;

public class HVuong implements hinhHoc {
    public double canh;
    @Override
    public void nhap() {
        System.out.print("Nhap canh = ");
        canh = input.nextDouble();
    }

    @Override
    public void tinhChuVi() {
        double P;
        P = canh * 4;
        System.out.println("Chu vi = " + P);
    }

    @Override
    public void tinhDienTich() {
        double S;
        S = canh * canh;
        System.out.println("Dien tich = " + S);
    }
}
