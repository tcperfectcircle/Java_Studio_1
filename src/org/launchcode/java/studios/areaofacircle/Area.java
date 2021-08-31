package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius:");
        double area = Circle.getArea(input.nextDouble());
     //   double radius = input.nextDouble();
    //    double area = Math.PI * (radius * radius);
        System.out.println("The area of circle is: " + area);

    }
}
