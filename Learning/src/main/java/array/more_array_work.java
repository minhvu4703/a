package array;

import java.util.Scanner;

// Nhap mang gom 10 so thuc. Sap xep mang theo chieu tang dan
public class more_array_work {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//  Khai bao bien
        int i, j;
        int temp;
//  Nhap mang
        int arr[] = new int[10];
        System.out.println("Nhap phan tu; ");
        for (i = 0; i < arr.length; i++){
            int x = (i + 1);
            System.out.print("arr[" + x + "]: ");
            arr[i] = input.nextInt();
        }
//  sap xep
        for (i = 0; i < (arr.length - 1); i++){
            for (j = 0; j < (arr.length - i - 1); j++){
                if (arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
//  In ra man hinh
        System.out.println("Mang sap xep theo thu tu tang dan la");
        for (i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}