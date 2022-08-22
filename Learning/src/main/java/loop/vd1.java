package loop;

import java.util.Scanner;

public class vd1 {
    public static void main(String[] args) {
// Tính tổng các sô chẵn từ 1 đến 10000
        int tong =0;
        int a;
        for (a = 1; a <= 10000;a++){
            if (a%2 ==0){
                tong += a;
            }
        }
        System.out.println("Tong cac so chan tu 1 den 10000 = " + tong);
// Tinh tong cac so chan tu 1 den n nhap tu ban phim
        int n;
        int tong_2 =0;
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        n= input.nextInt();
        for (int i = 0; i < n; i++){
            if (i%2 == 0){
                tong_2 += i;
            }
        }
        System.out.println("Tong_2 = " + tong);
        return;
    }
}
