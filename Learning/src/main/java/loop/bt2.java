package loop;
//cac so nguyen tu 1 den n
import java.util.Scanner;
class bt2
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        int i =0;
        int num =0;
        String  so = "";
        System.out.print("Nhập vào số n = ");
        int n = input.nextInt();
        input.close();
        for (i = 1; i <= n; i++)
        {
            int dem=0;
            for(num = i; num >= 1; num--)
            {
                if(i % num == 0)
                {
                    dem = dem + 1;
                }
            }
            if (dem ==2)
            {
                so = so + i + " ";
            }
        }
        System.out.println("Các số nguyên tố từ 1 đến "+ n +" là:");
        System.out.println(so);
    }
}