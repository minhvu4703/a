package OOP.Session_1;
/*
Tao class HCn - gom 2 thuoc tinh: chieuDai, chieuRong
              - gom 2 constructor: + co tham so
                                   + k co tham so
              - gom 2 phuong thuc: tinhChuVi(), tinhDientich
 */
public class HCN {
// Thuoc tinh
    public int chieuDai;
    public int chieuRong;
// Phuong thuc
    public void tinhChuVi(){
        int chuvi = 0;
       chuvi = (chieuDai + chieuRong) * 2;
        System.out.print("Chu vi hinh chu nhat = " + chuvi);
    }
    public void tinhDienTich(){
        int dientich = 0;
        dientich = chieuDai * chieuRong;
        System.out.print("Dien tich hinh chu nhat = " + dientich);
    }

    @Override
    public String toString() {
        return "HCN{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                '}';
    }
    // Constructor k tham so
    public HCN(){

    }
    // Constructor co tham so
    public HCN(int chieuDai, int chieuRong){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
}
