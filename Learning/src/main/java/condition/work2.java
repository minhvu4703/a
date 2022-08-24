package Learning.src.main.java.condition;

import java.util.Scanner;
// Giai phuong trinh bac 2 voi a, b, c nhap tu ban phim
public class work2 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        a = input.nextDouble();
        System.out.print("b = ");
        b = input.nextDouble();
        System.out.print("c = ");
        c = input.nextDouble();
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
}
