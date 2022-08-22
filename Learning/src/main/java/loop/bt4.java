package loop;
/* Tao hinh ngoi sao *
                     **
                     ***
                     ****
                     *****
                     ******
 */
import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
//        System.out.println("*");
//        System.out.println("**");
//        System.out.println("***");
//        System.out.println("****");
//        System.out.println("*****");
//        System.out.println("******");
        Scanner input = new Scanner(System.in);
        int docao;
        System.out.print("Nhap chieu cao tam giac : ");
        docao = input.nextInt();
        for(int i = 1; i <= docao; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        return;
    }
}