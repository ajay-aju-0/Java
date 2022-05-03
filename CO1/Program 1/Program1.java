/* Define a class ‘product’ with data members pcode, pname and price. 
Create 3 objects of the class and find the product having the lowest price.*/

class Product{
    String pcode;
    String pname;
    double price;

    String lowestPrice(Product p1, Product p2, Product p3)
    {
        if(p1.price<p2.price && p1.price<p3.price){
            return p1.pname;
        }
        else if(p2.price<p1.price && p2.price<p3.price){
            return p2.pname;
        }
        else{
            return p3.pname;
        }
    }
    void SetValues(String pcode,String pname,double price){
            this.pcode=pcode;
            this.pname=pname;
            this.price=price;
    }
}
public class Program1 {
    public static void main(String[] args) {
        Product p1=new Product();
        Product p2=new Product();
        Product p3=new Product();
        p1.SetValues("p11", "Redmi", 20000);
        p2.SetValues("p12", "Iphone", 50000);
        p3.SetValues("p13", "Samsung", 25000);
        String lowest;
        lowest=p1.lowestPrice(p2,p3,p1);
        System.out.println(lowest+" has lowest price");
        
    }
}
