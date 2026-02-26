// Return Keyword
import java.util.Scanner;
class vid24
{
    // We can't use the void function to get return.
    // To use the return we can use the int instead of void, if the return is number.
    int soap(int money)
    // If we use the int in the function, we should give the return.
    {
        int soap_price = 18;
        int balance = money - soap_price;
        // return will give the remaining number from the input.
        return balance;
    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        vid24 soap_sale = new vid24();
        System.out.println("Soap price is 18rs. Please enter the given amount");
        int a = scan.nextInt();
        int balance_amount = soap_sale.soap(a);
        System.out.println("Soap is purchased");
        System.out.println("Please take a balance change amount " + balance_amount + "rs");

    }
}
// If we are returning the letters we need to use the String.
// Example: String name(String first_name)
//{
//  return first_name;
//}