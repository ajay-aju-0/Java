// Program to Sort strings

import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        String temp;
        System.out.println("How many string you want to enter:");
        int n = sc.nextInt();
        String[] str = new String[n];
        Scanner s = new Scanner(System.in);
        System.out.println("Enetr the Strings:");
        for (i = 0; i < n; i++) {
            str[i] = s.nextLine();
        }
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (str[i].compareTo(str[j]) > 0) {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println("Strings in Sorted Order:");
        for (i = 0; i <= n - 1; i++) {
            System.out.println(str[i]);
        }
    }

}
