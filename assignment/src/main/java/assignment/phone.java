package assignment;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class phone {
    // Khai bao bien
    public static Scanner input = new Scanner(System.in);
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

    public phone() throws IOException {
        super();
    }

    // something
    public phone(String phoneName, String IMEI, double price, String manufacturer, String releaseDate, double RAM, double ROM, String chip, String screensize, String phoneSize) throws IOException {
        this.phoneName = phoneName;
        this.IMEI = IMEI;
        this.price = price;
        this.manufacturer = manufacturer;
        this.releaseDate = releaseDate;
        this.RAM = RAM;
        this.ROM = ROM;
        this.chip = chip;
        this.screensize = screensize;
        this.phoneSize = phoneSize;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getRAM() {
        return RAM;
    }

    public void setRAM(double RAM) {
        this.RAM = RAM;
    }

    public double getROM() {
        return ROM;
    }

    public void setROM(double ROM) {
        this.ROM = ROM;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public String getScreensize() {
        return screensize;
    }

    public void setScreensize(String screensize) {
        this.screensize = screensize;
    }

    public String getPhoneSize() {
        return phoneSize;
    }

    public void setPhoneSize(String phoneSize) {
        this.phoneSize = phoneSize;
    }

    // Nhap
    public void phoneInsert() {
        System.out.print("Nhap ten dien thoai: ");
        phoneName = input.nextLine();
        System.out.print("Nhap IMEI: ");
        IMEI = input.nextLine();
        System.out.print("Nhap gia: ");
        price = input.nextInt();
        input.nextLine();
        System.out.print("Nhap nha phat hanh: ");
        manufacturer = input.nextLine();
        System.out.print("Nhap ngay ra mat: ");
        releaseDate = input.nextLine();
        System.out.print("Nhap RAM: ");
        RAM = input.nextInt();
        System.out.print("Nhap ROM: ");
        ROM = input.nextInt();
        input.nextLine();
        System.out.print("Nhap chip: ");
        chip = input.nextLine();
        System.out.print("Nhap size man hinh: ");
        screensize = input.nextLine();
        System.out.print("Nhap size dien thoai: ");
        phoneSize = input.nextLine();
    }

    //    hien thi
    public String phoneDisplay() {
        return "Phone" + "phoneName='" + phoneName + '\'' + ", IMEI='" + IMEI + '\'' + ", price=" + price + ", manufacturer='" + manufacturer + '\'' + ", releaseDate='" + releaseDate + '\'' + ", RAM=" + RAM + ", ROM=" + ROM + ", chip='" + chip + '\'' + ", screensize='" + screensize + '\'' + ", phoneSize='" + phoneSize + '\'' + '}';
    }
}
