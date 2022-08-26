package Learning.src.main.java.OOP.Session_1;

public class Human {
    public String ten;
    public int tuoi;
    public String diaChi;
    public String soDienThoai;

    public void an() {
        System.out.println("An");
    }

    public void ngu() {
        System.out.println("Ngu");
    }

    public void choi() {
        System.out.println("choi");
    }

    @Override
    public String toString() {
        return "conNguoi{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", diaChi='" + diaChi + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                '}';
    }
    public Human() {
    }

    public Human(String ten, int tuoi, String diaChi, String soDienThoai) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }
}