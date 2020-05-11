package practicinginheritance;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //cylinder object1 = new cylinder();
        
        System.out.print("Enter the x value of the center: ");
        double x = input.nextDouble();
        System.out.println();
        System.out.print("Enter the y value of the center: ");
        double y = input.nextDouble();
        System.out.println();
        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();
        System.out.println();
        System.out.print("Enter the height: ");
        double height = input.nextDouble();
        System.out.println();
        
        //object1.set(radius, x, y, height);
        cylinder object1 = new cylinder(radius, x, y, height);
        
        System.out.println(object1);
    }
    
}
