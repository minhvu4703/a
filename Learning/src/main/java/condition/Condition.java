package condition;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
    // Cho so nguyen a nhap tu ban phim. kiem tra a la so am hay duong
    // Neu a la so chan hay le?
    // khai bao a
        int a;
    // Nhap a
        Scanner input  = new Scanner(System.in);
        System.out.print("a = ");
        a = input.nextInt();
    // Kiem tra a > 0 ?
        if(a > 0) {
            if(a % 2 == 0){
                System.out.println("a la so duong va la so chan");
            }
            else {
                System.out.println("a la so duong va la so le");
            }
        }
        else{
    // Kiem tra a = 0 ?
            if(a == 0){
                System.out.println("a la so khong am khong duong");
            }
            else{
                if(a % 2 == 0){
                    System.out.println("a la so am va la so chan");
                }
                else {
                    System.out.println("a la so am va la so le");
                }
            }
        }
    }
}
