import java.util.Scanner;
class training3{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Is this is raining outside");
        String climate = scan.nextLine();
        if (climate==("yes"))
        {
            System.out.println("Take an umbarella");
        }
        else
        {
            System.out.println("Enjoy the sunlight");
        }
    }
}
// To check the two values we need to use ==.
// == will works perfectly on int.
// If we want to compare two strings we need to use .equals("")