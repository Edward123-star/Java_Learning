
import java.util.Scanner;
public class systemshop{ 
// variables in the class, not in the main function
String graphic = "";
String processer = "";
String ram = "";
int price = 0;

// main function

public static void main(String aregs[]){
    // creating the object for the class
    // by using this objects we can access the variables out side the main function
// this is a first object
    systemshop hp =new systemshop();
    hp.graphic = "GTX 2060";
    hp.processer = "i5";
    hp.ram= "16gb";
    hp.price = 50000;
    

// this is the second object

systemshop acer =new systemshop();
    acer.graphic = "RX7700 XT";
    acer.processer = "5600G";
    acer.ram= "32gb";
    acer.price = 80000;
    

// we can create multiple objects inside the main function based on the calss.

// object 3

systemshop dell =new systemshop();
    dell.graphic = "RX7700 XT";
    dell.processer = "5600G";
    dell.ram= "32gb";
    dell.price = 80000;

    // This part of the code is for the user input and output
Scanner scan = new Scanner (System.in);
String a="hp";
String b="dell";
String c ="acer";
System.out.println("We have dell, hp and acer brand laptops");    
System.out.println("Which brand laptop doyou want");
// Here we are taking the input from user
String laptop = "";
// we are using the infinite loop because we want to keep asking the user until they give the correct input
// For the infinite loop we are using the while loop
while(true)
    {    
    laptop = scan.nextLine();
    // We are using the in condition to check the user input is matchs the available brands.
    if (laptop.equals(a) || laptop.equals(b) || laptop.equals(c))
    {
        System.out.println("processing your request");
        // to stop the loop we can use the break
        break; 
    }
    // if the user input is not match with the available brands then we will show the error message and ask the user to enter the correct input
    else{
        System.out.println("We don't have the brand you requested");
        System.out.println("Please enter the available brands");
    }
}
// The following code is used to show thw details of the laptop user choose

System.out.println("You choose " + laptop);
// To show the detils we are using the if and else if conditions.
if(laptop.equals(a))
{
    System.out.println("Details of laptop you choose");
    System.out.println("Graphic card: " + hp.graphic);
    System.out.println("Processer: " + hp.processer);
    System.out.println("Ram: " + hp.ram );
    System.out.println("Price: " + hp.price);
}
else if(laptop.equals(b))
{
    System.out.println("Details of laptop you choose");
    System.out.println("Graphic card: " + dell.graphic);
    System.out.println("Processer: " + dell.processer);
    System.out.println("Ram: " + dell.ram );
    System.out.println("Price: " + dell.price);
}
else if(laptop.equals(c))
{
    System.out.println("Details of laptop you choose");
    System.out.println("Graphic card: " + acer.graphic);
    System.out.println("Processer: " + acer.processer);
    System.out.println("Ram: " + acer.ram );
    System.out.println("Price: " + acer.price);
}
    
    

}
}