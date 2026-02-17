import java.util.Scanner;
class test4in2{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the salary:");
        int salary=scan.nextInt();
        System.out.println("Enter your age:");
        int age=scan.nextInt();

        if (salary>=20000 || age>22 && age<48)
        {
        System.out.println("Enter the required loan amount");
        int loan = scan.nextInt();
        if(loan<100000)
        {
            System.out.println("You are aligiable for the loan");
        }
        else
        {
            System.out.println("Maximux loam amount is 1L");
        }
        }
        else
        {
            System.out.println("you are not eligiable for the loan");
        }
    }
}