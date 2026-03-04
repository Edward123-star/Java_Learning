// Enhanced for loop
// For-each loop
import java.util.Scanner;
class vid27{
    public static void main(String args[])
    {
        int num[] = {10,20,30,40};
        String var[]= {"one","two","three","four"};
        
       // This is a normal for loop.
       // To use this we need to write a instruction to get and store the array.
        for (int i = 0;i<4; i++)
        {
            System.out.println(num[i]);
        }
        
        // This is for-each loop. 
        // To use this we just to need to add a variable to get and store the array
        for(String v:var)
        {
            System.out.println(v);
        }
        for(int n: num)
        {
            System.out.println(n);
        }
    }
}