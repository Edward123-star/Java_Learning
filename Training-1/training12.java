// While loop
// If we know the starting and ending we can use the for loop
// If we don't know the end point we can use the while loop
// We can generate a random number by using the while loop
// For the random number we need to use the import java.util.Random
import java.util.Random;
import java.util.Scanner;
class training12{
    public static void main(String args [])
    {
        // For the random we need to use the following line
        Random num= new Random();
        int newnum=0;
        while (newnum!=5)
        {
        newnum= num.nextInt(18);
        System.out.println(newnum);
        }
    }
}