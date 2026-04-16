// Do While loop
// The condition is true or false doesen't matter.
// The loop will work once
// We can use this in very few places
// For example: we need to get the input from the user with some condition.
// Id we use the do while it will loop untill the user input match the condition
import java.util.Random;
import java.util.Scanner;
class training13{
    public static void main(String args[])
    {
        int num=0;
        Scanner scan= new Scanner(System.in);
        do{
            System.out.println("Enter the number greater than 10");
            num = scan.nextInt();
        }while(num<10);
    }
}