package Graphics;

interface Area{
    public double rectangleArea(int l,int h);
    public double triangleArea(double l,double h);
    public double squareArea(int l);
    public double circleArea(double r);
}

public class Figures implements Area {
    public double rectangleArea(int l,int h){
        return (l*h);
    }
    public double triangleArea(double l,double h){
        return (0.5 * l * h);
    }
    public double squareArea(int l){
        return (l * l);
    }
    public double circleArea(double r){
        return (3.14 * r * r);
    }
}