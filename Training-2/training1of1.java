// Functions
public class training1of1 {
    // Here we are creating the function inside the class not in the main function.
    // We need to add the void infront of the function to create the function.
    void greeting(){
        System.out.println("Hello, welcome to my channel");
    hello();
    }
    // We can create the multiple function outside the main function.

    // This is the second function.
    void hello(){
        System.out.println("I am batman");
    }
    // Following line is the main function.
    // Wn need to add the static before the main function.
    public static void main(String args[]){
       //To call the function from outside to inside the main function we need to create the object
       //Example training1of1 obj = new training1of1();
       //training1of1 is class.
       //obj is created object to call the function.
         training1of1 obj1 = new training1of1();
         obj1.greeting();
         // There is two way to call the function into the main function.
         // Directly we can call the second function into the main function by creating the object.
         obj1.hello();
         // The second way is we can add the second function into the first finction.
         // void greeting(){
         // System.out.println("Hello, welcome to my channel");
         // hello();}
         // If we add this means we just need to call the first function and the second function will be called automatuically.

    }
}
