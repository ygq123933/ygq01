package File;

import java.io.File;

public class FileDmo01 {
    public static void main(String[] args) {
        File f1=new File("D://io//java.txt");
        File f2 = new File("D://io", "java.txt");
        System.out.println(f1);
        System.out.println(f2);
        File f3 = new File("D://io");
        File f4 = new File(f3, "java.txt");
        System.out.println(f4);
    }
    }

