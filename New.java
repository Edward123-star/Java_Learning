import java.util.Scanner;
class New {
    public static void main(String[] args) 
    {
        Scanner value1 = new Scanner(System.in);
        Scanner value2 = new Scanner(System.in);
        Scanner name = new Scanner(System.in);
        int a = value1.nextInt();
        int b = value2.nextInt();
        String iam = name.nextLine();
        System.out.print(iam);
        System.out.print(a+b);
        
    }
}

