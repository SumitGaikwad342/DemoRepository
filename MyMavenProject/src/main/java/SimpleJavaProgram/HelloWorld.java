package SimpleJavaProgram;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello Sumit");
        System.out.println("try to create merge conflict");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = s.nextLine();
        System.out.println(StringUtils.containsAny(str,"@","#"));
        System.out.println(StringUtils.containsNone(str,"@","#"));


    }
}
