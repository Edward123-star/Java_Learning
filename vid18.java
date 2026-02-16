import java.util.Scanner;
class vid18{
    public static void main(String args[]){
        //Example
       //for(int i = 1;i<=3;i=i+1)
       //{
       // for(int j=1;j<=3;j=j+1)
       // {
       //     System.out.println("training 1");
      //  }
      //  System.out.println("training 2");
      // } 
      for(int i=1; i<=3; i=i+1){
        for(int j=1; j<=i; j=j+1){
            System.out.print("*");
        }
        System.out.println();
        
      }

    }
}