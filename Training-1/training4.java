// else if 
// IF WE NEED TO WRITE A CODE OF A MULTIPLE CONDITION WE NEED TO USE ELSE IF
import java.util.Scanner;
class training4{
    public static void main (String [] args)
    {
         int score = 36;

         if(score > 35 && score <60)
         {
            System.out.println("Video Game");
         }
         // IF WE USE JUST A IF HERE THE CODE WILL CONTINUE ALL THE CONDITION EVEN THE FIRST CONDITION IS PPASSED
         else if(score > 60 && score <90)
         {
            System.out.println("Iphone");
         }
         // When we use the else if the code will stop when the condition become true
          else if(score >90)
         {
            System.out.println("Mac");
         }
    }
}