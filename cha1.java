// This is for the codding test of the past tutorial videos. The video is #25
import java.util.Scanner;
class cha1{
    void oddoreven(int num)
    {
        if(num % 2 == 0)
        {
        System.out.println("The given number is even");
        }
        else
        {
            System.out.println("The given number is odd");
        }
    }

    public static void main(String args[])
        {
            Scanner scan = new Scanner(System.in);
            cha1 obj = new cha1();
            System.out.println("Enter the number to fint odd or even");
            int number = scan.nextInt();
            obj.oddoreven(number);
        }
    

} 