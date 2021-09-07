/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Filipe Frances
 */
import java.util.Scanner;
public class AreaRR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the length of the room in feet? ");
        double length = sc.nextDouble();
        System.out.println("What is the width of the room in feet? ");
        double width = sc.nextDouble();
        System.out.printf("You entered dimensions of %.0f feet by %.0f feet %n", length, width);
        double f2 = length*width;
        final double m2 = f2*0.09290304;
        System.out.println("The area is");
        System.out.printf("%.0f square feet %n",f2);
        System.out.printf("%.3f square meters",m2);
    }
}
