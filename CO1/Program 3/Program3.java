//  Add complex numbers

class ComplexNumber{
    int real;
    int img;

    void addition(ComplexNumber n1,ComplexNumber n2){
        System.out.println("Sum of complex number:"+(n1.real+n2.real)+"+"+(n1.img+n2.img)+"i");
    }
    void SetValues(int real,int img){
        this.real=real;
        this.img=img;
    }
}
public class Program3 {
    public static void main(String[] args) {
        ComplexNumber n1=new ComplexNumber();
        ComplexNumber n2=new ComplexNumber();
        n1.SetValues(2,3);
        n2.SetValues(3,6);
        n2.addition(n1,n2);  
    }
}
