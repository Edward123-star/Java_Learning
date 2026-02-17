import java.util.Scanner;
class vid20{
    public static void main(String args [])
    {
        Scanner scan = new Scanner(System.in);
        int count =0;

        do{
            System.out.println("Enter the number > 10");
            count = scan.nextInt();
            if(count<=10)
            {
            System.out.println("Entered number is not >10");
        }
        }while(count<=10);
        
         System.out.println("Number accecpted.");
        
    }
}