// Nested loop 
// If the one loop is runs inside the another loop is called the nested loop
import java.util.Scanner;
class training10{
    public static void main(String args[])
    {
        int i=1;
        int j = 1;
        for (i=1; i<=4; i=i+1)
        {
            // This for loop will continue till the first loop break
            for(j=1; j<=3; j=j+1)
            {
                System.out.println("I am batman");
            }
            System.out.println("I am vengence");
        }
    }
}