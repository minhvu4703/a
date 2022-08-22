package loop;

import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
//  1. Nhập số nguyên n từ bàn phím. Kiểm tra n có phải số nguyên tố hay không.
        Scanner input = new Scanner(System.in);
// Nhập n
        System.out.print("Nhập n = ");
        int n = input.nextInt();
        boolean so = true;
        int i;
        for (i = 2; i < n-1; i++){
            if(n % i == 0){
                so = false;
                break;
            }
        }
        if(so){
            System.out.println(n + " la so nguyen to");
        }else{
            System.out.println(n + " khong la so nguyen to");
        }
    }
}
