/* Create classes Student and Sports. Create another class Result inherited from Student and 
Sports. Display the academic and sports score of a student
*/
import java.util.Scanner;

interface Student{
    public void Details(Scanner read);
    public void AcademicScore(Scanner read);
}

interface Sports{
    public void Score(Scanner read);
}

class Result implements Student,Sports{
    String SName;
    int RollNo,Max,Mark,Score;
    Result(Scanner read){
        Details(read);
        AcademicScore(read);
        Score(read);
    }
    public void Details(Scanner read){
        System.out.print("Enter Student Name : ");
        SName=read.nextLine();
        System.out.print("Roll number of the student : ");
        RollNo= Integer.parseInt(read.nextLine());
    }
    public void AcademicScore(Scanner read){
        System.out.print("Enter the Maximum mark : ");
        Max= read.nextInt();
        System.out.print("Enter the mark optained : ");
        Mark = read.nextInt();
    }
    public void Score(Scanner read){
        System.out.print("Enter the sports score : ");
        Score=read.nextInt();
    }
    void Display(){
        System.out.println("\n STUDENT INFORMATION");
        System.out.println("\nName of the Student : "+ SName);
        System.out.println("Roll number of the Student : "+ RollNo);
        System.out.println("Mark optained ("+Max+") : "+Mark);
        System.out.println("Mark optained Sports (100): "+ Score);
    }
}

public class MultilevelInheritance {
    public static void main(String arg[]){
        Scanner read = new Scanner(System.in);
        Result r = new Result(read);
        r.Display();
    }
}