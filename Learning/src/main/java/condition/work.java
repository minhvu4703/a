package Learning.src.main.java.condition;

import java.util.Scanner;
// Ktra 3 so co du dieu kien lam canh cua tam giac k
public class work {
    public static void main(String[] args) {
        int a, b, c;// khai bao a,b,c
        Scanner input  = new Scanner(System.in);
        System.out.print("a = ");
        a = input.nextInt();//in a
        System.out.print("b = ");
        b = input.nextInt();//in b
        System.out.print("c = ");
        c = input.nextInt();//in c
        // ktra a,b,c co du dieu kien lam 3 canh cua tam giac k
        if((a > 0)||(b > 0)||(c > 0)){
            System.out.println("du dieu kien lam 3 canh cua tam giac");
        }else {
            System.out.println("k du dieu kien lam 3 canh cua tam giac");
        }
        // ktra a,b,c co la 3 canh cua tam giac k
        if((a + b > c)||(a + c > b)||(b + c > a)){
            System.out.println("a, b, c la 3 canh cua tam gia");
        }else {
            System.out.println("a, b, c khong la 3 canh cua tam giac");
        }
    }
}
