import java.util.Scanner;
class test6{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] mark= new int[size];
        int i =0;
        for(i=0; i<size;i=i+1)
        {
            mark[i]=scan.nextInt();
        }
        for(i=0; i<=size-1;i=i+1)
        {
        System.out.println(mark[i]);
        }
       
    }
}