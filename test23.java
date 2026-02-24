import java.util.Scanner;
class test23{
    void apple()
    {
        System.out.println("apple price is 100rs");
        Scanner scan1= new Scanner(System.in);
        System.out.print("Pay 100rs to get the apple");
        int applerate= scan1.nextInt();
        if(applerate==100)
        {
        System.out.println("Apple purchased");
        }
        else
        {
            System.out.println("Invalid amount");
        } 
    }
    void mango()
    {
        System.out.println("mango price is 65rs");
        Scanner scan2= new Scanner(System.in);
        System.out.println("Pay 65rs to get the mango");
        int mangorate= scan2.nextInt();
        if(mangorate==65)
        {
        System.out.println("Mango purchased");
        }
        else
        {
            System.out.println("Invalid amount");
        }
    }
    public static void main (String args[])
    {
        test23 obj1 = new test23();
        System.out.println("We have Apple and Mango");
        System.out.println("If you want apple type apple");
        System.out.println("If you want mango type mango");
        Scanner scan3= new Scanner(System.in);
        String product= scan3.nextLine();

        if(product.equals("apple"))
        {
            obj1.apple();
        }
        else if(product.equals("mango"))
        {
            obj1.mango();
        }
        else
        {
            System.out.println("invalid input");
            System.out.println("Please enter the valid product");
        }
    }
}