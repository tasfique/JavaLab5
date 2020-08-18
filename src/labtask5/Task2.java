//Student's Full name: Tasfique Enam
//Student's ID: 5886429
//Task2

package labtask5;
import java.util.Scanner;

public class Task2 
{
    public static void main(String[]args){
        int quantity; //declaring variables.
        double price, discount, total;
        
        Scanner read = new Scanner (System.in);
        
            //Task2 object  = new Task2(); //creating a new object. here 'object' is a name.
            
            System.out.println("Enter the Price :");
            price = read.nextDouble(); 
            
            System.out.println("Enter the quantity : ");
            quantity = read.nextInt();
            
            System.out.println("Enter the amount the discount received in percentage. ");
            discount = read.nextDouble();
            
            total = TotalCalculation(price, quantity, discount);
            
            displaySum(total); //this giving the object's their values
    }
    public static double TotalCalculation(double price, double quantity, double discount) //total calc method
    {
        double calc = (price*quantity)*(1-(discount/100));
        return calc;
    }
    public static void displaySum(double sum) //displaying the result
    {
        sum = (sum*10)/10;
        sum = Math.round(sum);
        
        System.out.println("\nThe total price is:" + " " + (sum));
            
    }
    
}
