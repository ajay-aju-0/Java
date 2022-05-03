/* Prepare bill with the given format using calculate method from interface. 
 Order No. 
Date : 
Product Id   Name  Quantity unit price Total     
--------------------------------------------
101            A       2      25      50     
102            B       1      100     100      
--------------------------------------------         
                       Net. Amount    150 
*/

import java.util.*;

interface Calculate{
    public int calculate(int NAmount);
}

class Bill implements Calculate{
    int PID,Quantity,UPrice,Total;
    String Name;
    Bill(Scanner read,int i){
        System.out.print("\nEnter the Product "+(1+i)+" Id: ");
        PID=read.nextInt();
        System.out.print("Enter the Product Name: ");
        Name=read.next();
        System.out.print("Enter the quantity: ");
        Quantity=read.nextInt();
        System.out.print("Enter the unit Price of Product: ");
        UPrice=read.nextInt();
    }
    public int calculate(int NetAmount){
        Total = Quantity*UPrice;
        NetAmount+=Total;
        return NetAmount;
    }
    void DisplayBill(int OrderNo, int NetAmount, Bill[] b){
        System.out.println("\nOrder No. "+ OrderNo);
        System.out.println("\nDate. "+ java.time.LocalDate.now());
        System.out.print("\nProduct Id\tName\tQuantity\tUnit price\t Total  \n");
        System.out.println("_____________________________________________________________________________________\n");
        for(int i=0;i<b.length;i++){
            System.out.println(b[i].PID+"\t\t"+b[i].Name+"\t  "+b[i].Quantity+"\t\t   "+b[i].UPrice+"\t\t  "+b[i].Total);
        }
        System.out.println("_____________________________________________________________________________________\n");
        System.out.println("\t\t\t\t\tNet. Amount :      "+ NetAmount);
    }
}

public class ProductBill {
    public static void main(String[] arg){
        Scanner read = new Scanner(System.in);
        int NetAmount=0,OrderNo,PNum;
        System.out.print("\nEnter the Order No: ");
        OrderNo = read.nextInt();
        System.out.print("Enter the number of Products: ");
        PNum=read.nextInt();
        Bill[] b=new Bill[PNum];
        for(int i=0; i<PNum;i++){
            b[i]= new Bill(read,i);
            NetAmount = b[i].calculate(NetAmount);
        }
        b[0].DisplayBill(OrderNo,NetAmount,b);
    }
}