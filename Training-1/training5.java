// Nested if 
// if we need to write the code for a multiple condition we need to use the nested if
// Genderally here we need to write a if in side the another if
import java.util.Scanner;
class training5{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("Are we going to kfc");
        String kfc = scan.nextLine();
        System.out.println("Which food is available");
        String food = scan.nextLine();
        System.out.println("Which drink is available");
        String drink= scan.nextLine();
        if (kfc .equals("yes"))
        {
            System.out.println("I'll come to the kfc");
            
            if (food .equals("chicken"))
            {
                System.out.println("Lets eat the chicken");
                
                if(drink .equals("pepsi"))
                {
                    System.out.println("I'll drink");
                }
            }
        }
        else
        {
            System.out.println("I won't come");
        }

    }
}