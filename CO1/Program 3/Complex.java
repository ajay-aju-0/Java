//  Add complex numbers

public class Complex{
    int real;
    int img;

    Complex(int real,int img){
        this.real=real;
        this.img=img;
    }

    void add(Complex n1,Complex n2){
        System.out.println("Sum of complex number:"+(n1.real+n2.real)+"+"+(n1.img+n2.img)+"i");
    }

    public static void main(String[] args) {
        Complex c1=new Complex(2,3);
        Complex c2=new Complex(3,6);
        c2.add(c1,c2);  
    }
}
