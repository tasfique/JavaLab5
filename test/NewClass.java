
package <default package>;
import java.util.Scanner;
import java.util.Random;

public class NewClass {
    
    public static void main(String[] args) {
        int search =1;
        int []array = new int[20];
        Scanner read =new Scanner(System.in);
        Random r = new Random();
        for (int x = 0;x<20;x++) 
        {
    array[x] = r.nextInt(100);
    System.out.println(array[x]);
  
       } 
          
        while (search!=0)
        {
            System.out.println("Search a number");
            search = read.nextInt();
            
            if(SearchValue(search,array) ==true)
            {
              System.out.println("The number you enter been found");
              
        }
            else
            {
                System.out.println("The number you enter did not found");
            }
            System.out.print("Search again ?  (-1 to quit),(any number to continue) ");
            int input = read.nextInt();
            if (input == -1) {
                 break;
                }
           
    }
    }
   
    public static boolean SearchValue(int search, int[] array) {
    for (int y = 0; y < 20; y++) {
        if (search == array[y]) {
            return true;
        }
    }
    return false;
}
   
}

