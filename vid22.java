// this is for getting the input.
import java.util.Scanner;
// This is main class
class vid22{
    
    // This the function we created. Anything can be a function, but we need to write with the void.
    void greeting()
    {
        System.out.println("Vanakamm");
    }
    
    // we can add multiple function before the main function, and we can call that function in the main finction by creating the separate object for the each.
    void batman()
    {
        System.out.println("I am Batman");
    }
    
    // This is the main function.
    public static void main(String args[])
    // The code will always start running from the main function.
    {
        // Now we need to create the object to use the line-6 function.
        vid22 object1 = new vid22();
        object1.greeting();
        object1.batman();
    }

}

// we can't access the non static function from the statric function without creating the object.
// void greeting(); is non static function.
// main function is static function. 
//  public static void main(String args[])
// if we need to access the function from the main function without creating the object we can make a static function.
// static void greeting()