import java.util.Scanner;
class test3{
    public static void main(String args[])
    {
       Scanner scan = new Scanner (System.in);
       int income = scan.nextInt();
       if(income>7000)
      {
       System.out.println("You can avil the scholarship");
      }
      else
      {
        System.out.println("not eligible for scholarship");
      }
    }
}