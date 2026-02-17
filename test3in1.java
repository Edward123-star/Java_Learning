import java.util.Scanner;
class test3in1{
    public static void main (String args[])
    {
       int score = 61;
       boolean kfc = true;
       boolean chicken = true;
       boolean cardpay = false;
       if(kfc && chicken && cardpay)
       {
        System.out.println("enter into kfc");
        if (chicken)
       {
        System.out.println("I'll eat chicken");
       
       if(cardpay)
       {
        System.out.println("I'll pay");
       }
       }
       }
       else
       {
        System.out.print("I wont go");
       }
    }
}