/* Create a Graphics package that has classes and interfaces for figures Rectangle, Triangle, 
Square and Circle. Test the package by finding the area of these figures.*/

import Graphics.*;

public class Area{
    public static void main(String[] args) {
        Figures s = new Figures();

        System.out.println("Area of Rectangle:"+s.rectangleArea(5,4));
        System.out.println("Area of Triangle:"+s.triangleArea(7.0,3.0));
        System.out.println("Area of Square:"+s.squareArea(4));
        System.out.println("Area of Circle:"+s.circleArea(5.0));
    }
}