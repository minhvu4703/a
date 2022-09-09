package doc_ghi_file;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    private static String file;

    public static void main(String[] args) throws IOException{
        try {
            FileReader fileReader = new FileReader("C:\\Users\\Admin\\IdeaProjects\\a\\timthaydilamon.txt");
            int i;
            while ((i = fileReader.read()) != -1){
                System.out.print((char)i);
            }
            System.out.print(fileReader.read());
            fileReader.close();

            FileWriter fileWriter = new FileWriter(file,true);
            fileWriter.write("\nXin chao");
            fileWriter.write("Xin chao the gioi");
            fileWriter.close();
        }catch (FileNotFoundException fileNotFoundException){
            System.out.println("Khong tim thay");
        }
    }
}
