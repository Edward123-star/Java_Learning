import java.util.Scanner;
class cls12{
    public static void main(String args[])
    {
       Scanner scan= new Scanner(System.in);
       int a1 = scan.nextInt();
       int a2 = scan.nextInt();
       String result=a1>a2? "a1 is grater than a2":"a1 is less than a2";
       System.out.print(result);
    }
}