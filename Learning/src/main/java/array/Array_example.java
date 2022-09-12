package array;

import java.util.Scanner;

public class Array_example {
    // Nhap 40 so nguyen tu ban phim
// Tinh tong cac so nguyen day
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[10];
        int tong = 0;
// Nhap mang
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[ " + i + " ] = ");
            arr[i] = input.nextInt();
        }
// Tinh tong
        for (int i = 0; i < arr.length; i++) {
            tong += arr[i];
        }
// In tong
        System.out.println("Tong = " + tong);
    }
}
