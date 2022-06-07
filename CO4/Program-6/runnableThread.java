/* Define  2  classes;  one  for  generating  Fibonacci  numbers  and  other  for  displaying  even 
numbers in a given range.  Implement using threads. (Runnable Interface) */

import java.util.Scanner;
class FibEven{
	int count=0;
	synchronized void fibonacci(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range for fibonacci numbers:");
		int n=sc.nextInt();
		System.out.println("The First "+n+" terms of the fibonacci sequence is:");
		System.out.println(0);
		System.out.println(1);
		int a=0;
		int b=1;
		int c;
		while(count<(n-2)){
			c=a+b;
			System.out.println(c);
			count=count+1;
			a=b;
			b=c;
			try{
				Thread.sleep(500);
			}catch(Exception e){
					System.out.println(e);
				}
		}
	}
	synchronized void even(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range for even numbers:");
		int n=sc.nextInt();
		int count=0;
		System.out.println("The first "+n+" even numbers are:");
		for(int i=1;count<n;i++){
			if(i%2==0){
				count++;
				System.out.println(i);
			}
		}
		
	}
}
class Fibo implements Runnable{
	FibEven f;
	Fibo(FibEven f){
		this.f=f;
	}
	public void run(){
		f.fibonacci();
	}
}
class EvenNum implements Runnable{
	FibEven f;
	EvenNum(FibEven f){
		this.f=f;
	}
	public void run(){
		f.even();
	}
}
public class runnableThread{
	public static void main(String ar[]){
		FibEven ob=new FibEven();
		Fibo f=new Fibo(ob);
		EvenNum e=new EvenNum(ob);
		Thread t1=new Thread(f);
		Thread t2=new Thread(e);
		t1.start();
		t2.start();
	}
}