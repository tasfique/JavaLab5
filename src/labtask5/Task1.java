//Student's Full name: Tasfique Enam
//Student's ID: 5886429
//Task1

package labtask5;
import java.util.Scanner;


public class Task1 {

    public static void main(String[] args) {
        int lookup =1; //initialising lookup 
        int random [] = new int[20]; //creating array to store 20 random integers
        Scanner read = new Scanner(System.in);
        System.out.println("The 20 randomly generated numbers are. ");
        for (int i = 0; i<random.length; i++){  //generating 20 random numbers in arrays.
            random[i]=(int)(Math.random()*100);
            System.out.println(random[i]);
        }
        while (lookup!=0) //while loop to show if the user inputs a number.
        {
            System.out.println("Search for a number ");
            lookup = read.nextInt();
            if(LookupValue(lookup,random)==true)
            {
                System.out.println("The number has been found");
            }
            else
            {
                System.out.println("The number you are looking for was not found ");
            }
            System.out.print("Do you want to search again? '-1' to quit, or 1 to continue. ");
            int input = read.nextInt();
            if (input == -1) {
                 break;
                }
        }
 
    }
    public static boolean LookupValue(int lookup, int[] array)
    {
        int[] random=new int[20];
        for (int j=0; j<random.length; j++)
        {
            if (lookup == array[j])
            {
                return true;
            }
        }
        return false;
    }
    
}
