package Method;

import java.util.Scanner;

/*
Nhap mang gom n so nguyen
tinh tong cac phan tu
tim max min
 */
public class work_1 {
    public static Scanner input = new Scanner(System.in);
// Nhap
    public static int nhap_n(){
        int n;
        do {
            System.out.print("Nhap n = ");
            n = input.nextInt();
        }while (n < 0);
        return n;
    }
    public static int[] nhap_mang(int n){
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            System.out.print("phan tu " + i + " = ");
            arr[i] = input.nextInt();
        }
        return arr;
    }
// Tinh tong
    public static void tong(int n, int[] arr) {
        int sum = 0;
    for (int i = 0; i < arr.length; i++){
        sum += arr[i];
        System.out.print("Tong = " + sum);
    }
}
// max min
    public static void max_min(int[] arr){
    int SLN = arr[0];
    int SNN = arr[0];
    for (int i = 1; i < arr.length; i++ ){
        if (arr[i] > SLN){
            SLN = arr[i];
        }
    }
    for (int i = 1; i < arr.length; i++){
        if(arr[i] < SNN){
            SNN = arr[i];
        }
    }
    System.out.println("So lon nhat trong day la: " + SLN);
    System.out.println("So nho nhat trong day la: " + SNN);
    }
// Main
    public static void main(String[] args) {
    int n = nhap_n();
    int[] arr = nhap_mang(n);
    tong(n, arr);
    max_min(arr);
    }
}
