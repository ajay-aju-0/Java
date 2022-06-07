package Arithmetic;

interface Operations {
    public double Addition(int n1, int n2);

    public double Substraction(int n1, int n2);

    public double Multiplication(int n1, int n2);

    public double Devision(int n1, int n2);

}

public class Functions implements Operations {
    public double Addition(int n1,int n2){
        return (n1+n2);
    }

    public double Substraction(int n1,int n2){
            return (n1-n2);
    }

    public double Multiplication(int n1,int n2){
                return (n1*n2);
    }

    public double Devision(int n1, int n2) {
        return (n1 / n2);

    }
}
