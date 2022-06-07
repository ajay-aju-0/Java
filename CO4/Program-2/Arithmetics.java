/* Create  an  Arithmetic  package  that  has  classes  and  interfaces  for  the  4  basic  arithmetic 
operations. Test the package by implementing all operations on two given numbers */

import Arithmetic.*;

import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter 2 numbers:");
        num1 = s.nextInt();
        num2 = s.nextInt();

        Functions f = new Functions();

        System.out.println(+num1+"+"+num2+"=" + f.Addition(num1, num2));
        System.out.println(+num1+"-"+num2+"=" + f.Substraction(num1, num2));
        System.out.println(+num1+"*"+num2+"=" + f.Multiplication(num1, num2));
        System.out.println(+num1+"/"+num2+"=" + f.Devision(num1, num2));

    }
}