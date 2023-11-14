package fileHand;

import java.io.File;

public class fileHand {
    public static void main(String[] args) {
        File dir = new File("D:\\Tutorial\\java\\code\\java Questions\\Apna college\\Lecture_2-5\\src\\person");
        dir.mkdir();
        String dirLoc = dir.getAbsolutePath();
        System.out.println(dirLoc);
        String dirNm = dir.getName();
        System.out.println(dirNm);

        // dir.delete();
        File file1 = new File("D:\\Tutorial\\java\\code\\java Questions\\Apna college\\Lecture_2-5\\src\\student.txt");
        try {

            file1.createNewFile();
            String pat = file1.getAbsolutePath();
            System.out.println(pat);
            System.out.println("Files are created");

        } catch (Exception e) {

            System.out.println(e);
        }

        if (file1.exists()) {
            System.out.println(file1.getName());
        }
    }
}
