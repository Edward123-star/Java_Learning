// Method overloading
import java.util.Scanner;
// To use same function name we need to use the method overloading
// We can use the same function names, but can't use the same parameters.
class vid26
{
    void display()
    {
        System.out.println("First function");
    }
    // here int a is parameter 
    void display(int a)
    {
        System.out.println("Second function");
    }
    // Here the parameter is int a, int b
    void display(int a, int b)
    {
        System.out.println("third function");
    }

    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        vid26 obj = new vid26();
        obj. display();
        obj. display(57);
        obj. display(69,79);

    }


}