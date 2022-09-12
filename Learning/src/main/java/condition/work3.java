package condition;

import java.util.Scanner;

public class work3 {
    public static void main(String[] args) {
        // khai bao thang
        int thang;
        Scanner input = new Scanner(System.in);
        // nhap thang
        System.out.print("Nhap thang: ");
        thang = input.nextInt();
        // cac truong hop cua thang (use Switch - Case)
        switch (thang) {
            // Th cac thang 31 ngay
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                // in ra cac thang 31 ngay
                System.out.println("Thang" + thang + " co 31 ngay!");
            break;
            // Th cac thang co 30 ngay
            case 4:
            case 6:
            case 11:
                // in ra cac thang co 30 ngay
                System.out.println("Thang" + thang +  " co 30 ngay!");
            break;
            // Th cua thang 2
            case 2:
                // Kb nam nhuan
                int nam;
                // In nam
                System.out.print("Nhap nam: ");
                nam = input.nextInt();
                // Tinh nam nhuan hay k (use if - else)
                if(nam %4 == 0){
                    System.out.println("Thang" + thang + " co 29 ngay!");
                }else {
                    System.out.println("Thang" + thang + " co 28 ngay!");
                }
            break;
            default:
                System.out.println("Thang khong hop le. Vui long nhap lai");
                break;
        }
    }
}
