// Search an element in an array.

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i, flag = 0,search;
        System.out.println("Enter the array size:");
        int size = s.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the array elements:");
        for (i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("Array is : ");
        for (i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    
        System.out.println("Enter the element to search:");
        search = s.nextInt();
        
        for (i = 0; i < size; i++) {
            if (arr[i] == search) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Element found at position: " + (i + 1));
        } 
        else {
            System.out.println("Element not Found");
        }
    }

}
