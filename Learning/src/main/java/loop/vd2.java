package loop;

import java.util.Scanner;

public class vd2 {
//  Tinh n giai thua voi n nhap tu ban phim
    public static void main(String[] args) {
        int n;
        long giaithua = 1;
     Scanner input = new Scanner(System.in);
        System.out.print("Nhap n = ");
        n = input.nextInt();
        int i = 1;
        while ( i <= n){
        giaithua = giaithua * i;
        i++;
        }
        System.out.println("Giai thua = " + giaithua);
        return;
    }
}
