package loop;

public class Main{
    public static void main(String[] args) {
//  vi du in ra cac so tu 0 den 100
        int a;
//  vong lap for | áp dụng khi biết trc đc số lần lặp
        System.out.println("----------for---------");
        for (a = 0; a <= 100; a++){
            System.out.println(a);
        }
        System.out.println("---------while----------");
//  vong lap while | áp dụng đc khi biết hoặc k biết trc số lần lặp
        a = 0;
        while(a < 50){
            System.out.println(a);
            a++;
        }
//  vong lap do - while | áp dụng đc khi biết hoặc k biết trc số lần lặp
        System.out.println("---------do ... while--------");
        a = 0;
        do {
            System.out.println(a);
            a++;
        }while (a <= 50);
    }
}
