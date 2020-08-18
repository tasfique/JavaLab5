//Student's Full name: Tasfique Enam
//Student's ID: 5886429
//Task3

package labtask5;
import java.util.Scanner;

public class Task3 {
   private static Scanner read = new Scanner(System.in);
   
     public static void main(String[]args){ // main method 
        double lenth, breadth, area, perimeter;
        
        lenth = getLength();
        breadth = getBreadth();
        area = getArea(lenth, breadth);
        perimeter = getPerimeter(lenth, breadth);
        
        display(lenth, breadth, area, perimeter);
        
    }
    
   public static double getLength(){ //method for length
        //Scanner read = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle ");
        double length = read.nextDouble();
        return length;
    }
    
    public static double getBreadth(){ //method for breadth
         //Scanner read = new Scanner(System.in);
         System.out.println("Enter the breadth of the rectangle ");
         double breadth = read.nextDouble();
         return breadth;
    }
    
    public static double getArea(double length, double breadth){ //method for area
        double area = length * breadth;
        return area;
    }
    
    public static double getPerimeter (double length , double breadth ){ //method for perimeter
        double perimter = length + breadth;
       return perimter;
    }
    
    public static void display(double length, double breadth, double area, double perimeter){ //method to display results.
        System.out.println(" The length of a rectangle is \t" + length);
        System.out.println(" The width of a rectangle is \t" + breadth);
        System.out.println(" The area of a rectangle is \t" + area);
        System.out.println("The perimeter of a rectangle is \t"  + perimeter);
    }
    
  
}
