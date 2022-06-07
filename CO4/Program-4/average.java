/*   Find the average of N positive integers, raising a user defined exception for each negative 
input.*/

import java.util.Scanner;
class Neg_input_exception extends Exception{
	Neg_input_exception(){
		super();
	}
	Neg_input_exception(String s){
		super(s);
	}
}
class average{
	public static void main(String arg[]){
		int n;
		float sum=0;
		int num;
		float avg;
		int i=1;
		try{
			System.out.println("How many number you want to enter:");
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			
			while(i<=n){
				System.out.println("Enter "+i+"th number:");
				num=sc.nextInt();
				if(num<0)
					throw new Neg_input_exception();
				else
					sum+=num;
				i=i+1;
			}
			avg=sum/n;
			System.out.println("average:"+avg);

		}catch(Neg_input_exception e){
			System.out.println("Exception : "+e);
		}
	}
}