/* Define 2 classes; one for generating multiplication table of 5 and other for displaying first 
N prime numbers. Implement using threads. (Thread class) */

import java.util.Scanner;
class Numbers{
	synchronized void printmul(){
		int num=5;
		System.out.println("Multiplication table of 5:");
		for(int i=1;i<=10;i++){
			num=5*i;
			System.out.println(5+"*"+i+"="+num);
			try{
				Thread.sleep(500);
			}catch(Exception e){
					System.out.println(e);
				}
		}
	}
	synchronized void printprimes(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit of prime number:");
		int n=sc.nextInt();
		System.out.println("The first "+n+" prime numbers are:");
		System.out.println(2);
		int num=3;
		int status=1;
		for ( int i = 2 ; i <=n ;  )
      {
         for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
         {
            if ( num%j == 0 )
            {
               status = 0;
               break;
            }
         }
         if ( status != 0 )
         {
            System.out.println(num);
            i++;
         }
         status = 1;
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
		num.printmul();
	}
}
class Prime extends Thread{
	Numbers num;
	Prime(Numbers num){
		this.num=num;
	}
	public void run(){
		
		num.printprimes();
	}
}
public class thread{
	public static void main(String ar[]){
		Numbers ob=new Numbers();
		Multiple m1=new Multiple(ob);
		Prime p1=new Prime(ob);
		m1.start();
		p1.start();
	}
}
