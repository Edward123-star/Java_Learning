import java.util.Scanner;
class test4 {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        if (score<50)
        {
        System.out.println("Need to improve");
        }
        else if(score>49 && score<71)
        {
            System.out.print("Good Job");
        }
        else if (score>70)
        {
            System.out.print("Excellent work");
        }
    }
}