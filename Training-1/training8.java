import java.util.Scanner;
class training8{
    public static void main(String args [])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the starting number");
        int a = scan.nextInt();
        System.out.println("Enter the end number");
        int b = scan.nextInt();
        int i = a;

        for(i=a; i<=b; i=i+1)
        {
            if (i%2==0)
            {
                System.out.println("This is a even number"+i);
            }
            else
            {
                System.out.println("This is odd number"+ i);
            }
        }
    }
}