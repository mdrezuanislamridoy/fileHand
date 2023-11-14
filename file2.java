package fileHand;

import java.io.File;
import java.util.Scanner;

public class file2 {
    public static void main(String[] args) {
        
        try {
            File file= new File("D:\\Tutorial\\java\\code\\java Questions\\Apna college\\Lecture_2-5\\src\\person\\class.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNext()) {
                String id = sc.next();
                String name = sc.next();
                System.out.println();
                System.out.println(id);
                System.out.println(name);
            }
            sc.close();
        } catch (Exception e) {
            
        }
    }
}
