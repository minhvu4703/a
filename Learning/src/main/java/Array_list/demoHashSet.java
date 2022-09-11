package Array_list;
import OOP.Session_4.Vi_du.*;
import java.util.HashSet;

public class demoHashSet {
    public static void main(String[] args) {
// Tạo set
        HashSet hashSet1 = new HashSet();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet hashSet3 = new HashSet();
        HashSet<String> hashSet4 = new HashSet();
//  Them du lieu
        hashSet2.add("PHP");
        hashSet2.add("Java");
        hashSet2.add("Python");
        hashSet2.add("JS");
//  Hien thi tat ca cac ptu trong set
        System.out.println(hashSet2);
        System.out.println("--------------------------------------");
//  Hien thi lan luot
        for (String alo : hashSet2) {
            System.out.println(alo);
        }
        System.out.println("----------------------------------------");
// xoa toan bo ptu
        hashSet2.clear();
        System.out.println("-----------------------------------------");     
    }
}
