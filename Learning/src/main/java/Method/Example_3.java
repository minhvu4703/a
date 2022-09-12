package Method;

import java.util.Scanner;

/* Nhap 3 so thuc
    tinh nghiem cua phuong trinh ax^2 + bx + c = 0
 */
public class Example_3 {
// Method nhap
    public static int nhap() {
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        return n;
    }
// Method giai phuong trinh
    public static void Giai_phuong_trinh(double a, double b, double c) {
        if (a == 0) {
            if(b == 0){
                if (c == 0){
                    System.out.println("PT co vo so nghiem");
                }else{
                    System.out.println("PT vo nghiem");
                }
            }else{
                double x = (-c) / (b);
                System.out.println("PT co nghiem x = ");
            }
        }else{
            double delta = Math.pow(b,2) -4*a*c;
            if(delta < 0){
                System.out.println("PT vo nghiem");
            } else if (delta == 0) {
                double x = (-b)/(2*a);
            }else{
                double x1 = (-b*Math.sqrt(delta))/(2*a);
                double x2 = (-b-Math.sqrt(delta))/(2*a);
            }
        }
    }
// Method main
    public static void main(String[] args) {
    System.out.println("Nhap 3 so");
    double a, b ,c;
    System.out.print("a = ");
    a = nhap();
    System.out.print("b = ");
    b = nhap();
    System.out.print("c = ");
    c = nhap();
    Giai_phuong_trinh(a, b, c);
    }
}
