import java.util.Scanner;
class test5{
    public static void main(String args[])
    {
       // Scanner scan= new Scanner(System.in);
        //System.out.println("Enter the starting number");
        //int a = scan.nextInt();
        //System.out.println("Enter the end number");
        //int b = scan.nextInt();
        //int i=a;
        //int oddnumber=0;
        //for(i=a;i<=b;i=i+1)
        //{
        //if(i%2==0)
        //{
            //System.out.println("even number"+i);
        //}
        //else
        //{
          //  oddnumber = oddnumber+1;
           // System.out.println("odd number:"+i);
          // System.out.println("Total odd numbers:" +oddcount);
          Scanner scan= new Scanner(System.in);
          System.out.println("starting number");
          int a = scan.nextInt();
          System.out.println("enter ending number");
          int b = scan.nextInt();
          int i= a;
          int divnum=0;
          for(i=a;i<=b;i=i+1)
          {
            if(i%3==0 && i%5==0)
            {
                divnum = divnum+1;
                //System.out.println("total div numbers:"+i);
            }
          }
          System.out.println("Total divisible numbers:" +divnum);
    }
    
}
