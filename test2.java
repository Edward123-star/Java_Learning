import java.util.Scanner;
class test2{
    public static void main (String args[])
    {
        Scanner climate = new Scanner(System.in);
        boolean rain = climate.nextBoolean();
        String a1 = "I am vengance";
        String a2 = "I am batman";
        if(rain)
        {
            System.out.println("Take an umbrella");
            
        }
        else
        {
            System.out.println("Enjoy the sunlight");
            
        }
        if(a1.equals(a2))
        {
            System.out.print("Yes I am batman");
        }
        else
        {
            System.out.print("No I am vengence");
        }
    }
}