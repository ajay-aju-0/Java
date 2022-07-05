/* Define 2 classes; one for generating multiplication table of 5 and other for displaying first 
N prime numbers. Implement using threads. (Thread class) */

import java.util.Scanner;
class Numbers{
	synchronized void multable(){
		int n=5;
		System.out.println("Multiplication table of 6:");
		for(int i=1;i<=10;i++){
			n=6*i;
			System.out.println(i+"*"+6+"="+n);
			try{
				Thread.sleep(500);
			}catch(Exception e){
					System.out.println(e);
				}
		}
	}
	synchronized void printprime(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit of prime number:");
		int n=sc.nextInt();
		System.out.println("The first "+n+" prime numbers are:");
		System.out.println(2);
		int num=3;
		int flag=1;
		for ( int i = 2 ; i <=n ;  )
      {
         for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
         {
            if ( num%j == 0 )
            {
               flag = 0;
               break;
            }
         }
         if ( flag != 0 )
         {
            System.out.println(num);
            i++;
            try{
				Thread.sleep(500);
			}catch(Exception e){
					System.out.println(e);
				}
         }
         flag = 1;
         num++;
      }         
	}

}

class Multiple extends Thread{
	Numbers num;
	Multiple(Numbers num){
		this.num=num;
	}
	public void run(){
		num.multable();
	}
}

class Prime extends Thread{
	Numbers num;
	Prime(Numbers num){
		this.num=num;
	}
	public void run(){
		num.printprime();
	}
}

public class thread{
	public static void main(String ar[]){
		Numbers n1=new Numbers();
		Multiple m1=new Multiple(n1);
		Prime p1=new Prime(n1);
		m1.start();
		p1.start();
	}
}
