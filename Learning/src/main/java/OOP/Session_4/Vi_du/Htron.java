package OOP.Session_4.Vi_du;

public class Htron implements hinhHoc {
    public double r;
    @Override
    public void nhap() {
        System.out.print("Ban kinh = ");
        r = input.nextDouble();
    }

    @Override
    public void tinhChuVi() {
        double P;
        P = r * 2 * Math.PI;
        System.out.println("Chu vi = " + P);
    }

    @Override
    public void tinhDienTich() {
        double S;
        S = Math.pow(r, 2) * Math.PI;
        System.out.println("Dien tich = " + S);
    }
}
