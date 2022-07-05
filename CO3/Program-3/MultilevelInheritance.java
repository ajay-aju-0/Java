/* Create a class ‘Person’ with data members Name, Gender, Address, Age  and a constructor 
to initialize the data members and another class ‘Employee’ that inherits the properties of 
class  Person  and  also  contains  its  own  data  members  like  Empid,  Company_name, 
Qualification, Salary and its own constructor. Create another class ‘Teacher’ that inherits 
the  properties  of  class  Employee  and  contains  its  own  data  members  like  Subject, 
Department,  Teacherid  and  also  contain  constructors  and  methods  to  display  the  data 
members. Use array of objects to display details of N teachers.*/

import java.util.Scanner;

class Person{
	String Name;
	String Gender;
	String Address;
	int Age;

	Person(){
	Scanner sc=new Scanner(System.in);
    Scanner s=new Scanner(System.in);
	System.out.println("Enter the Name:");
	Name=sc.next();
	System.out.println("Enter the Gender:");
	Gender=sc.next();
	System.out.println("Enter the Address:");
	Address=s.nextLine();
	System.out.println("Enter the Age:");
	Age=sc.nextInt();
	}
}

class Employee extends Person{
	int EmpId;
	String Company_name;
	String Qualification;
	int Salary;

	Employee(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the EmpId:");
		EmpId=sc.nextInt();
		System.out.println("Enter the Company_name:");
		Company_name=sc.next();
		System.out.println("Enter the Qualification:");
		Qualification=sc.next();
		System.out.println("Enter the Salary:");
		Salary=sc.nextInt();
	}
}

class Teacher extends Employee{
	String Teacherid;
	String Subject;
	String Department;

	Teacher(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Subject:");
		Subject=sc.next();
		System.out.println("Enter the Department:");
		Department=sc.next();
		System.out.println("Enter the Teacherid:");
		Teacherid=sc.next();
		System.out.println();
	}
	void display(){
		System.out.println();
		System.out.println("Name:"+Name);
		System.out.println("Gender:"+Gender);
		System.out.println("Address:"+Address);
		System.out.println("Age:"+Age);
		System.out.println("EmpId:"+EmpId);
		System.out.println("Company_name:"+Company_name);
		System.out.println("Qualification:"+Qualification);
		System.out.println("Salary:"+Salary);
		System.out.println("Teacherid:"+Teacherid);
		System.out.println("Subject:"+Subject);
		System.out.println("Department:"+Department);
		System.out.println();
	}
}

class MultilevelInheritance{
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of teachers");
		int n=sc.nextInt();
		Teacher[] teacher=new Teacher[n];
		for(int i=0;i<n;i++)
		    teacher[i]=new Teacher();
		for(int i=0;i<n;i++){
			System.out.println("details of teachers:");
			teacher[i].display();
		}
	}
}