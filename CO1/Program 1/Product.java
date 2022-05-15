/* Define a class ‘product’ with data members pcode, pname and price. 
Create 3 objects of the class and find the product having the lowest price.*/

class Product{
    String pcode;
    String pname;
    double price;

    Product(String pcode,String pname,double price)
    {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }

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

    public static void main(String[] args) 
    {
        Product P1=new Product("101", "Mobile", 20000);
        Product P2=new Product("132", "Laptop", 50000);
        Product P3=new Product("122", "Television", 25000);
        String lowest=P1.lowestPrice(P1,P2,P3);
        System.out.println(lowest+" has lowest price");
    }
}