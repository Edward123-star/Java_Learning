import java.util.Scanner;
class test4in1{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int s1 = scan.nextInt();
        int s2 = scan.nextInt();
        int s3 = scan.nextInt();
        int s4 = scan.nextInt();
        int s5 = scan.nextInt();

        int total = s1+s2+s3+s4+s5;
        int avg = total/5;

        System.out.print("Your average score is=");
        System.out.println(avg);

        if (avg<34)
        {
        System.out.print("need extra class");
        }
        else if (avg>34 && avg<60)
        {
            System.out.print("need to focus on studies");
        }
        else
        {
            System.out.print("No need extra class you can go");
        }

    }
}