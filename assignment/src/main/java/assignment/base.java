package assignment;

import java.util.Scanner;

public class base {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int case1;
        int case2;
        int case3;
        phone p1 = new phone();
        System.out.println("=============== Phone manager program ===============");
        System.out.println("1. Phones manager");
        System.out.println("2. Editing Tools");
        System.out.print("Enter options: ");
        case1 = input.nextInt();
        switch (case1) {
            case 1:
                System.out.println("=============== Phones manager ===============");
                System.out.println("1. Add new device");
                System.out.println("2. Update device information");
                System.out.println("3. Delete device");
                System.out.println("4. Show all devices");
                System.out.print("Enter options: ");
                case2 = input.nextInt();
                switch (case2) {
                    case 1:
                        System.out.println("1. Add new device");
                        p1.phoneInsert();
                        break;
                    case 2:
                        System.out.println("2. Update device information");
                        break;
                    case 3:
                        System.out.println("3. Delete device");
                        break;
                    case 4:
                        System.out.println("4. Show all devices");
                        p1.phoneDisplay();
                        break;
                }
            case 2:
                System.out.println("=============== Editing Tools ===============");
                System.out.println("1. Filter by manufacturer");
                System.out.println("2. Order by release date desc");
                System.out.println("3. Filter by price");
                System.out.println("4. Order by price desc");
                System.out.print("Enter options: ");
                case3 = input.nextInt();
                switch (case3) {
                    case 1:
                        System.out.println("1. Filter by manufacturer");
                        break;
                    case 2:
                        System.out.println("2. Order by release date desc");
                        break;
                    case 3:
                        System.out.println("3. Filter by price");
                        break;
                    case 4:
                        System.out.println("4. Order by price desc");
                        break;
                }
        }
    }
}
