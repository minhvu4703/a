package Learning.src.main.java.array;

import java.util.Scanner;

//Nhập mảng số thực gồm 10 phần tử. Tìm phần tử lớn nhất và nhỏ nhất.
public class Array_work1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//  Nhap mang
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[ " + i + " ] = ");
            arr[i] = input.nextInt();
        }
//  Khai bao
        int SLN = arr[0];
        int SNN = arr[0];
//  Vong for tim so lon nhat va nho nhat
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
//  In ra man hinh
        System.out.println("So lon nhat trong day la: " + SLN);
        System.out.println("So nho nhat trong day la: " + SNN);
    }
}
