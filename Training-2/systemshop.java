
import java.util.Scanner;
public class systemshop{ 
// variables in the class, not in the main function
String graphic = "";
String processor = "";
String ram = "";
int price = 0;

// main function

public static void main(String aregs[]){
    // creating the object for the class
    // by using this objects we can access the variables out side the main function
// this is a first object
    systemshop hp =new systemshop();
    hp.graphic = "GTX 2060";
    hp.processor = "i5";
    hp.ram= "16gb";
    hp.price = 50000;
    

// this is the second object

systemshop acer =new systemshop();
    acer.graphic = "RX7700 XT";
    acer.processor = "5600G";
    acer.ram= "32gb";
    acer.price = 80000;
    

// we can create multiple objects inside the main function based on the calss.

// object 3

systemshop dell =new systemshop();
    dell.graphic = "RX7700 XT";
    dell.processor = "5600G";
    dell.ram= "32gb";
    dell.price = 80000;

    // This part of the code is for the user input and output
Scanner scan = new Scanner (System.in);
String a="hp";
String b="dell";
String c ="acer";
System.out.println("We have dell, hp and acer brand laptops");    
System.out.println("Which brand laptop do you want");
// Here we are taking the input from user
String laptop = "";
// we are using the infinite loop because we want to keep asking the user until they give the correct input
// For the infinite loop we are using the while loop


while(true)
    {    
    laptop = scan.nextLine();
    // We are using the in condition to check the user input is matches the available brands.
    if (laptop.equals(a) || laptop.equals(b) || laptop.equals(c))
    {
        System.out.println("You choose " + laptop);
        System.out.println("Are you sure you want to buy this laptop? yes or no");
        String confirm = scan.nextLine();
        if (confirm.equals("yes"))
        {
            System.out.println("Thank you for choosing, your order is processing");
            // to stop the loop we can use the break
        break;
        }
        else
        {
            System.out.println("Please enter the brand you want to buy");
        }
         
    }
    // if the user input is not match with the available brands then we will show the error message and ask the user to enter the correct input
    else{
        System.out.println("We don't have the brand you requested");
        System.out.println("Please enter the available brands");
    }
}
// The following code is used to show the details of the laptop user choose


// To show the detils we are using the if and else if conditions.
if(laptop.equals(a))
{
    System.out.println("Details of laptop you choose");
    System.out.println("Graphic card: " + hp.graphic);
    System.out.println("Processor: " + hp.processor);
    System.out.println("Ram: " + hp.ram );
    System.out.println("Price: " + hp.price);
}
else if(laptop.equals(b))
{
    System.out.println("Details of laptop you choose");
    System.out.println("Graphic card: " + dell.graphic);
    System.out.println("Processor: " + dell.processor);
    System.out.println("Ram: " + dell.ram );
    System.out.println("Price: " + dell.price);
}
else if(laptop.equals(c))
{
    System.out.println("Details of laptop you choose");
    System.out.println("Graphic card: " + acer.graphic);
    System.out.println("Processor: " + acer.processor);
    System.out.println("Ram: " + acer.ram );
    System.out.println("Price: " + acer.price);
}

System.out.println("");
System.out.println("Do you want to proceed to the billing? yes or no");
String billing = scan.nextLine();
if (billing.equals("yes"))
{
    System.out.println("Your order is processing, please wait for the confirmation");
}
else
{
    System.out.println("Thank you for visiting our shop, have a nice day");
    return;
}
System.out.println("");
System.out.println("---------------");
System.out.println("Please enter the billing details");
System.out.print("Please enter your name : ");
String name= scan.nextLine();
System.out.print("Please enter your Mobile number : ");
String mobileNumber=scan.nextLine();
System.out.print("Please enter your billing address : ");
String address= scan.nextLine();
System.out.print("Please enter your email address : ");
String email= scan.nextLine();
System.out.println("---------------");
System.out.println("Thank you for providing the billing details, your order is processing");

System.out.println("");
System.out.println("Thank you for choosing us, your order is confirmed, you will receive the delivery within 5-7 business days");
System.out.println("Bill will be send to the email and the mobile number you provided");
System.out.println("Have a nice day");
}
}