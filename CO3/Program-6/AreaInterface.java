/* Create  an  interface  having  prototypes  of  functions  area()  and  perimeter().  Create  two 
classes Circle and Rectangle which implements the above interface. Create a menu driven 
program to find area and perimeter of objects.*/

import java.util.*;

import org.w3c.dom.css.Rect;

interface Shape {
    public void Area();
    public void Perimeter();
}

class Circle implements Shape {
    Double radius;

    Circle(Scanner read) {
        System.out.print("\nEnter the Radius:");
        radius = read.nextDouble();
    }

    public void Area() {
        System.out.print("\nArea of the Circle is: " + (3.14 * radius * radius));
    }

    public void Perimeter() {
        System.out.print("\nPerimeter of the Circle is: " + (2 * 3.14 * radius));
    }
}

class Rectangle implements Shape {
    Double length, breadth;

    Rectangle(Scanner read){
        System.out.print("\nEnter the length of Rectangle:");
        length = read.nextDouble();
        System.out.print("\nEnter the breadth of Rectangle:");
        breadth = read.nextDouble();
    }

    public void Area() {
        System.out.println("\nArea of the Rectangle is: " + (length * breadth));
    }

    public void Perimeter() {
        System.out.println("\nPerimeter of the Rectangle is: " + (2 * (length + breadth)));
    }
}

public class AreaInterface {
    public static void main(String[] args) {
        int i = 1, op;
        Scanner read = new Scanner(System.in);
        Rectangle r = new Rectangle(read);
        Circle c = new Circle(read);
        while (i != 0) {
            System.out.print("\n_______________OPTIONS_______________\n");
            System.out.println("\n1. Area of the circle\n2. Perimeter of the circle");
            System.out.println("3. Area of the rectangle\n4. Perimeter of the rectangle\n5. Exit");
            System.out.print("_____________________________________\n");
            System.out.print("\nPlease choose your option: ");
            op = read.nextInt();
            switch (op) {
            case 1:
                c.Area();
                break;
            case 2:
                c.Perimeter();
                break;
            case 3:
                r.Area();
                break;
            case 4:
                r.Perimeter();
                break;
            case 5:
                i = 0;
                System.out.print("\nExiting!!!");
                break;
            default:
                System.out.println("\nPlease enter a valid option!!!");
            }
            System.out.print("\n\n_____________________________________\n");
        }
    }
}