import java.util.Scanner;
class training2{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print ("Enter the user name ");
        String name = scan.nextLine();
        System.out.print ("Enter the user age ");
        int age = scan.nextInt();
        // If we are adding any string input line after the int input line we nee to add scan.nextLine()
        System.out.print("Enter the user's adderss ");
        scan.nextLine();
        String address = scan.nextLine();
        System.out.println("User names is " + name);
        System.out.println("User age is " + age);
        System.out.println("User adderss is  " + address);

    }
}