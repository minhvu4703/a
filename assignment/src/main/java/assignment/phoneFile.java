package assignment;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class phoneFile {
    private static final String phoneFile = "filephone.txt";

    public void write(List<phone> phoneList){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(new File(phoneFile));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(phoneList);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (EOFException e){
            e.printStackTrace();
        } catch (IOException e ){
            e.printStackTrace();
        } finally {
            closeStream(fos);
            closeStream(oos);
        }
    }
    public List<phone> read(){
        List<phone> phoneList = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File(phoneFile));
            ois = new ObjectInputStream(fis);
            phoneList = (List<phone>) ois.readObject();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            closeStream(fis);
            closeStream(ois);
        }
        return phoneList;
    }
    private void closeStream(InputStream is ){
        if (is != null) {
            try {
                is.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    private void closeStream(OutputStream os){
        if (os != null){
            try {
                os.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
