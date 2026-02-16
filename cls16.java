import java.util.Scanner;
class cls16{
    public static void main(String args[])
    {
        int [] score= new int[5];
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the mark of Tamil : ");
        score[0] = scan.nextInt();
        System.out.print("Enter the mark of English : ");
        score[1] = scan.nextInt();
        System.out.print("Enter the mark of Match : ");
        score[02] = scan.nextInt();
        System.out.print("Enter the mark of Science : ");
        score[03] = scan.nextInt();
        System.out.print("Enter the mark of Social : ");
        score[4] = scan.nextInt();
        int i = score[0]+ score[1]+ score[2]+ score[3]+ score[4];

        System.out.println("Total mark out of 500 :" + i);


        if(i>=200)
        {
            System.out.println("Pass");
        
        }
        else
        {
            System.out.println("Fail");
        }
       
    }
}