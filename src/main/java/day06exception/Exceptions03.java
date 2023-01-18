package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions03 {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("src\\main\\java\\exception\\File.txt");
            try {
                int k = 0;
                while ((k=fis.read()) != -1){
                    System.out.print((char)k);
                }
            } catch (IOException e){
                System.out.println("Dosya okunamiyor");
            }
        } catch (FileNotFoundException e){
            System.out.println("Dosya silinmis veya dosya yolu hatali.");
        }




    }
}
