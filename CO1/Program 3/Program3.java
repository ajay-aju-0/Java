//  Add complex numbers

class ComplexNumber{
    int real;
    int image;

    void addition(ComplexNumber num1,ComplexNumber num2){
        System.out.println("Addition of complex number:"+(num1.real+num2.real)+"+"+(num1.image+num2.image)+"i");
    }
    void SetValues(int real,int image){
        this.real=real;
        this.image=image;
    }
}
public class Program3 {
    public static void main(String[] args) {
        ComplexNumber num1=new ComplexNumber();
        ComplexNumber num2=new ComplexNumber();
        num1.SetValues(3,4);
        num2.SetValues(5,2);
        num2.addition(num1,num2);  
    }
}
