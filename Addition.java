// this is for tutorial vide 22's work
import java.util.Scanner;
class Addition{
    int a = 20;
    int b =15;
    int c = 45;

    void sum1()
    {
        System.out.println(a+b);
    }
    void sum2()
    {
        System.out.println(b+c);
    }
    void sum3()
    {
        System.out.println(c+a);
    }

    public static void main(String args[])
    {
        Addition obj1 = new Addition();
        Scanner scan= new Scanner(System.in);
        System.out.println("if you want a+b type sum1.");
        System.out.println("if you want b+c type sum2.");
        System.out.println("if you want a+c type sum3.");
        String select = scan.nextLine();

        // we can use == to compare the two numbers. If we want to compare two strings we need to use the "".equals"          
        if(select.equals("sum1"))
        {
            obj1.sum1();
        }
        else if(select.equals ("sum2"))
        {
            obj1.sum2();
        }
        else if (select.equals ("sum3"))
        {
            obj1.sum3();
        }


    }
}