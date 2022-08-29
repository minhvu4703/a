package Learning.src.main.java.OOP.Session_4.Vi_du;

public class khaibao {
    public static void hinhcn(){
        System.out.println("Hinh chu nhat ne");
        HinhCN hcn = new HinhCN();
        hcn.nhap();
        hcn.tinhChuVi();
        hcn.tinhDienTich();
    }
    public static void hinhvuon(){
        System.out.println("Hinh vuong ne");
        HVuong hv = new HVuong();
        hv.nhap();
        hv.tinhChuVi();
        hv.tinhDienTich();
    }
    public static void hinhtron(){
        System.out.println("Hinh tron ne");
        Htron ht = new Htron();
        ht.nhap();
        ht.tinhChuVi();
        ht.tinhDienTich();
    }
}
