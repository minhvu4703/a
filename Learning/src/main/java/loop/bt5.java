package loop;
// Tao hinh ngoi sao nguoc lai bt4
import java.util.Scanner;

public class bt5 {
    public static void main(String[] args) {
        //System.out.println("******");
        //System.out.println("*****");
        //System.out.println("****");
        //System.out.println("***");
        //System.out.println("**");
        //System.out.println("*");
        Scanner input = new Scanner(System.in);
        int docao;
        System.out.print("Nhap chieu cao tam giac : ");
        docao = input.nextInt();
        for(int i = docao; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        return;
    }
}
