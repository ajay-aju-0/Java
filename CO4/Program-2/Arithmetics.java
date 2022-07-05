/* Create  an  Arithmetic  package  that  has  classes  and  interfaces  for  the  4  basic  arithmetic 
operations. Test the package by implementing all operations on two given numbers */

import Arithmetic.*;

import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1, n2;
        System.out.println("Enter 2 numbers:");
        n1 = s.nextInt();
        n2 = s.nextInt();

        Functions f = new Functions();

        System.out.println(+n1+"+"+n2+"=" + f.Addition(n1, n2));
        System.out.println(+n1+"-"+n2+"=" + f.Substraction(n1, n2));
        System.out.println(+n1+"*"+n2+"=" + f.Multiplication(n1, n2));
        System.out.println(+n1+"/"+n2+"=" + f.Devision(n1, n2));

    }
}