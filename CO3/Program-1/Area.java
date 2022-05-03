/* Area of different shapes using overloaded functions  */

class Shape{
	double x;
	Shape(double a){
		x=a;
	}
}
class Rectangle extends Shape{
	double y;
	Rectangle(double a,double b){
		super(a);
		y=b;
	}
	void area(double x,double y){
		System.out.println("Area of rectangle:"+(x*y));
	}
}
class Square extends Shape{
	Square(double a){
		super(a);
	}
	void area(double x){
		System.out.println("Area of square:"+(x*x));
	}
}
class Circle extends Shape{
	Circle(double a){
		super(a);
	}
	void area(double x){
		System.out.println("Area of circle:"+(3.14*x*x));
	}
}
class Area{
	public static void main(String ar[]){
		
		Rectangle r=new Rectangle(8,6);
		Square s=new Square(4);
		Circle c=new Circle(3);
		Shape ref;
		ref=r;
		r.area(4,5);
		ref=s;
		s.area(4);
		ref=c;
		c.area(2);
	}
}