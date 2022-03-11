package SimpleJavaProgram;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scanner.nextLine();
        System.out.println(StringUtils.containsAny(str,"@","#"));
    }
}
