// Perform String manipulations.

import java.util.Scanner;

public class Manipulation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name:");
        String str=sc.nextLine();
        System.out.println("String : "+str);
        System.out.println("Length of String : "+str.length());
        System.out.println("To Uppercase : "+str.toUpperCase());
        System.out.println("To Lowercase : "+str.toLowerCase());
        System.out.println();
        String str2=" welcome to java programming";
        System.out.println("New String : "+str2);
        System.out.println("String Concatination :hi "+str.concat(str2));
        System.out.println("Index of a word \"java\" in"+str2+" : "+str2.indexOf("java"));
        System.out.println("String replacement \"java to python\" : "+str2.replace("java", "python"));
    }
}