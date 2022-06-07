/* Create  an  interface  having  prototypes  of  functions  area()  and  perimeter().  Create  two 
classes Circle and Rectangle which implements the above interface. Create a menu driven 
program to find area and perimeter of objects.*/

import java.util.*;

interface Shape {
    public void Area();
    public void Perimeter();
}

class Circle implements Shape {
    Double radius;

    Circle(Scanner sc) {
        System.out.print("\nEnter the Radius:");
        radius = sc.nextDouble();
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

    Rectangle(Scanner sc){
        System.out.print("\nEnter the length of Rectangle:");
        length = sc.nextDouble();
        System.out.print("\nEnter the breadth of Rectangle:");
        breadth = sc.nextDouble();
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
        int ch;
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle(sc);
        Circle c = new Circle(sc);
        do {
            System.out.print("\n_______________MAIN MENU_______________\n");
            System.out.println("\n1. Area of the circle\n2. Perimeter of the circle");
            System.out.println("3. Area of the rectangle\n4. Perimeter of the rectangle\n5. Exit");
            System.out.print("_____________________________________\n");
            System.out.print("\nPlease choose your option: ");
            ch = sc.nextInt();
            switch (ch) {
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
                System.out.print("\nExiting!!!");
                break;
            default:
                System.out.println("\nPlease enter a valid option!!!");
            }
            System.out.print("\n\n_____________________________________\n");
        }while (ch != 5);
    }
}