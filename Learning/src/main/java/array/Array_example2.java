package Learning.src.main.java.array;

import java.util.Scanner;

// Nhap mang so thuc gom 10 phan tu
// Tinh hieu cac phan tu cua mang
public class Array_example2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Khai bao
        int arr[] = new int[10];
        int hieu = 0, i;
// Nhap mang
        for (i = 0; i < arr.length; i++) {
            System.out.print("So thu " + i + " la : ");
            arr[i] = input.nextInt();
// Tinh hieu
        }
        for (i = 0; i < arr.length; i++) {
            hieu -= arr[i];
        }
        System.out.println("Hieu = " + hieu);
        return;
    }
}
