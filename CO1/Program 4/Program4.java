//  Read a matrix from the console and check whether it is symmetric or not. 

import java.util.Scanner;

class Matrix{
    int row;
    int column;
}

public class Program4{
    public static void main(String[] args) {
        Matrix m = new Matrix();
        Scanner s = new Scanner(System.in);
        int i,j,flag=1;

        System.out.println("Enter number of rows:");
        m.row=s.nextInt();
        System.out.println("Enter number of columns:");
        m.column=s.nextInt();
        int[][] matrix=new int[m.row][m.column];

        System.out.println("Enter the element of Matrix: ");
        for(i=0;i<m.row;i++){
            for(j=0;j<m.column;j++)
                matrix[i][j]=s.nextInt();
        }
        
        System.out.println("Matrix : ");
        for(i=0;i<m.row;i++){
            for(j=0;j<m.column;j++){
                System.out.print(matrix[i][j]+ "\t");
            }
         System.out.println();  
        } 
        System.out.println("Symmetric Matrix : ");
        for(i=0;i<m.row;i++){
            for(j=0;j<m.column;j++){                     
                System.out.print(matrix[j][i]+ "\t");
            }
         System.out.println();  
        } 
        for(i=0;i<m.row;i++){
            for(j=0;j<m.column;j++){
                if(matrix[i][j] != matrix[j][i]){
                  flag=0;
                  break;
            }
        }
    }
       if(flag==1){
            System.out.println("Matrix is Symmetric");
         }
       else{
            System.out.println("Matrix is Not Symmetric");
            }   
    }
}