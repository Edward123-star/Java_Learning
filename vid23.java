//Function with Parameters

// To get input from the user
import java.util.Scanner;
// main class
class vid23{
    //function 1
    void chocolate(int money)
    {
        System.out.println("Chocolate purchased");
    }
    // function 2
    void powder(int money)
    {
        System.out.println("Powder purchased");
    }

    // Main function.
    public static void main(String args [])
    {
        // To get input from the user
        Scanner scan = new Scanner(System.in);

        // Object to call the functions into the main function
        vid23 rate1 = new vid23();
        // Getting the input from the user
        int a = scan.nextInt();
       // if the input is 20 select chocolate and print the chocolate function.
        if(a==20)
        {
        rate1. chocolate(a);
        }
        // if the input is 40 select powder and print the powder function.
        else if(a==40)
        {
            rate1. powder(a);
        }
        // if the input is not in either one of this.
        else
        {
            System.out.println("Invalid amount is entered");
        }
    }
}