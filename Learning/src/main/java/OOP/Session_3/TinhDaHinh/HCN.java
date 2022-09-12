package OOP.Session_3.TinhDaHinh;

public class HCN extends hinhHoc {
    public int CD;
    public int CR;
    public static void main(String[] args) {
        HCN hcn1 = new HCN();
        System.out.println("Nhap chieu dai va chieu rong");
        System.out.print("Chieu dai = ");
        hcn1.CD = input.nextInt();
        System.out.print("Chieu rong = ");
        hcn1.CR = input.nextInt();
    }
}
