// Test 2 of the tutoral video #25
import java.util.Scanner;
class cha2{
    String passorfail(int mark)
    {
        if(mark>=40)
        {
            System.out.println("Average mark = " + mark);
            // After the return we can't add any statement ot any line of instruction.
            return "Pass";
            
        }
        else
        {
            System.out.println("Average mark = " + mark);
            return "Faill";
            
        }
    }
   
public static void main(String args[])
{
    Scanner scan= new Scanner(System.in);
    System.out.println("Enter the marks here");
    System.out.print("Subject-1 = ");
    int sub1= scan.nextInt();
    System.out.print("Subject-2 = ");
    int sub2= scan.nextInt();
    System.out.print("Subject-3 = ");
    int sub3= scan.nextInt();
    System.out.print("Subject-4 = ");
    int sub4= scan.nextInt();
    System.out.print("Subject-5 = ");
    int sub5= scan.nextInt();
    int total= sub1+sub2+sub3+sub4+sub5;
    int total_mark = total/5;
    cha2 obj = new cha2();
    String result = obj.passorfail(total_mark);
    System.out.println(result);
}
}