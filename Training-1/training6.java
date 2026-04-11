// Ternary operator
// This is the alternative option for the if and else.
import java.util.Scanner;
class training6
{
    public static void main(String [] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("is it raining outside");
        System.out.println("If it's raining type true");
        System.out.println("if not type false");
        Boolean climate=scan.nextBoolean();
        // instead of adding if and else, we can use
        // String object=boolean?"optionA":"optionB";
        // We can use this only for boolean
        String result=climate?"take an umbralla":"enjoy the sun";
        System.out.println(result);

    }
}