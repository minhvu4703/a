package assignment;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Menu extends phoneManager{
    public static String file;
    public static Scanner input = new Scanner(System.in);

    public Menu() throws EOFException {
    }

    public static void showMenu() throws FileNotFoundException, EOFException {
        int caseMain;
        int casePhone;
        int caseTool;
        phoneManager p1 = new phoneManager();
        System.out.println("=============== Phone manager program ===============");
        System.out.println("|               1. Phones manager                   |");
        System.out.println("|               2. Editing Tools                    |");
        System.out.println("|               3. Exit                             |");
        System.out.println("=====================================================");
        System.out.print("Enter options: ");
        caseMain = input.nextInt();
        switch (caseMain) {
            case 1:
                System.out.println("=============== Phones manager ===============");
                System.out.println("|               1. Add new device            |");
                System.out.println("|               2. Update device information |");
                System.out.println("|               3. Delete device             |");
                System.out.println("|               4. Show all devices          |");
                System.out.println("===============================================");
                System.out.print("Enter options: ");
                casePhone = input.nextInt();
                switch (casePhone) {
                    case 1:
                        System.out.println("1. Them thiet bi moi");
//                        p1.add();
                        break;
                    case 2:
                        System.out.println("2. Update device information");
                        break;
                    case 3:
                        System.out.println("3. Delete device");
                        break;
                    case 4:
                        System.out.println("4. Show all devices");
                        p1.show();
                        break;
                }
                break;
            case 2:
                System.out.println("=============== Editing Tools ===============");
                System.out.println("|           1. Filter by manufacturer       |");
                System.out.println("|           2. Order by release date desc   |");
                System.out.println("|           3. Filter by price              |");
                System.out.println("|           4. Order by price desc          |");
                System.out.println("=============================================");
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
                }
                break;
            case 3:
                System.out.println("Exited");
                break;

        }
    }
}
