package assignment;

import java.util.Scanner;

public class base {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        int caseMain;
        int casePhone;
        int caseTool;
        phone p1 = new phone();
        System.out.println("=============== Phone manager program ===============");
        System.out.println("1. Phones manager");
        System.out.println("2. Editing Tools");
        System.out.println("3. Exit");
        System.out.print("Enter options: ");
        caseMain = input.nextInt();
        switch (caseMain) {
            case 1:
                System.out.println("=============== Phones manager ===============");
                System.out.println("1. Add new device");
                System.out.println("2. Update device information");
                System.out.println("3. Delete device");
                System.out.println("4. Show all devices");
                System.out.print("Enter options: ");
                casePhone = input.nextInt();
                switch (casePhone) {
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
                        System.out.println(p1.phoneDisplay());
                        break;
                }break;
            case 2:
                System.out.println("=============== Editing Tools ===============");
                System.out.println("1. Filter by manufacturer");
                System.out.println("2. Order by release date desc");
                System.out.println("3. Filter by price");
                System.out.println("4. Order by price desc");
                System.out.print("Enter options: ");
                caseTool = input.nextInt();
                switch (caseTool) {
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
                }break;
            case 3:
                System.out.println("Exited");
                break;
        }
    }
}
