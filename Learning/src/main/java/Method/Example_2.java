package Method;

import java.util.Scanner;

/* Nhap 3 so thuc
    Kiem tra 3 so co phai la canh tam giac hay khong
    'Viet ra cac menthod rieng'
 */
public class Example_2 {
// Method nhap
    public static int nhap(){
        int n;
        Scanner input  = new Scanner(System.in);
        n = input.nextInt();
        return n;
    }
// Method kiem tra
    public static void kiem_tra(int a, int b, int c){
        if((a > 0)||(b > 0)||(c > 0)){
            if((a + b > c)||(a + c > b)||(b + c > a)){
                System.out.println("a, b, c la 3 canh cua tam gia");
            }else {
                System.out.println("a, b, c khong la 3 canh cua tam giac");
            }
        }else {
            System.out.println("k du dieu kien lam 3 canh cua tam giac");
        }
}
// Method main
    public static void main(String[] args) {
        int a , b, c;
        System.out.println("Nhap cac so:");
        System.out.print("a = ");
        a = nhap();
        System.out.print("b = ");
        b = nhap();
        System.out.print("c = ");
        c = nhap();
        kiem_tra(a , b, c);
    }
}
