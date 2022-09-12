package assignment;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class phoneManager {
    public static Scanner input = new Scanner(System.in);
    private List<phone> phoneList;
    private phoneFile phonefile;
    public phoneManager() throws EOFException {
        phonefile = new phoneFile();
        phoneList = phonefile.read();
    }
    public String phoneName;
    public String IMEI;
    public double price;
    public String manufacturer;
    public String releaseDate;
    public double RAM;
    public double ROM;
    public String chip;
    public String screensize;
    public String phoneSize;

//  Add new
    public void add() throws FileNotFoundException {
        System.out.println("Add new phone: ");
        phoneName = input.nextLine();
        IMEI = input.nextLine();
        price = input.nextInt();
        input.nextLine();
        manufacturer = input.nextLine();
        releaseDate = input.nextLine();
        RAM = input.nextInt();
        ROM = input.nextInt();
        input.nextLine();
        chip = input.nextLine();
        screensize = input.nextLine();
        phoneSize = input.nextLine();
    }
    private String inputPhoneName(){
        System.out.println("Name: ");
        return input.nextLine();
    }
    private String inputIMEI(){
        System.out.println("IMEI: ");
        System.out.print("Input student id: ");
        while (true) {
            try {
                int id = Integer.parseInt((input.nextLine()));
                return IMEI;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input student id again: ");
            }
        }
    }
    private double inputPrice(){
        System.out.println("Price: ");
        return input.nextDouble();
    }
    private String inputManufacturer(){
        System.out.println("Manufacturer: ");
        return input.nextLine();
    }
    private String inputReleaseDate(){
        System.out.println("Release date: ");
        return input.nextLine();
    }
    private double inputRAM(){
        System.out.println("RAM: ");
        return input.nextDouble();
    }
    private double inputROM(){
        System.out.println("ROM: ");
        return input.nextDouble();
    }
    private String inputChip(){
        System.out.println("Chip: ");
        return input.nextLine();
    }
    private String inputScreenSize(){
        System.out.println("Screen size: ");
        return input.nextLine();
    }
    private String inputPhoneSize(){
        System.out.println("Phone size: ");
        return input.nextLine();
    }

//  Update
    public void update(String IMEI){
        boolean isExisted = false;
        int size = phoneList.size();
        for (int i = 0; i < size; i++) {
            if (phoneList.get(i).getIMEI() == IMEI){
                isExisted = true;
                phoneList.get(i).setPhoneName(inputPhoneName());
                phoneList.get(i).setIMEI(inputIMEI());
                phoneList.get(i).setPrice(inputPrice());
                phoneList.get(i).setManufacturer(inputManufacturer());
                phoneList.get(i).setReleaseDate(inputReleaseDate());
                phoneList.get(i).setRAM(inputRAM());
                phoneList.get(i).setROM(inputROM());
                phoneList.get(i).setChip(inputChip());
                phoneList.get(i).setScreensize(inputPhoneSize());
                phoneList.get(i).setPhoneSize(inputPhoneSize());
            }
        } if (!isExisted) {
            System.out.printf("id = %d not existed.\n", IMEI);
        } else {
            phonefile.write(phoneList);
        }
    }

// Delete
    public void delete(int id) {
        phone p1 = null;
        int size = phoneList.size();
        for (int i = 0; i < size; i++) {
            if (phoneList.get(i).getIMEI() == IMEI) {
                p1 = phoneList.get(i);
                break;
            }
        }
        if (p1 != null) {
            phoneList.remove(p1);
            phonefile.write(phoneList);
        } else {
            System.out.printf("id = %d not existed.\n", IMEI);
        }
    }
// Show
public void show() {
    for (phone student : phoneList) {
        System.out.format(" | ", student.getPhoneName());
        System.out.format(" | ", student.getIMEI());
        System.out.format(" | ", student.getPrice());
        System.out.format(" | ", student.getManufacturer());
        System.out.format(" | ", student.getReleaseDate());
        System.out.format(" | ", student.getRAM());
        System.out.format(" | ", student.getROM());
        System.out.format(" | ", student.getChip());
        System.out.format(" | ", student.getScreensize());
        System.out.format(" | ", student.getPhoneSize());
    }
}
    public List<phone> getStudentList() {
        return phoneList;
    }

    public void setPhoneList(List<phone> studentList) {
        this.phoneList = studentList;
    }
}
