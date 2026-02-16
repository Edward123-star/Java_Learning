import java.util.Scanner;
class test1{
    public static void main (String args[])
    {
     Scanner text = new Scanner(System.in);
     String name = text.nextLine();
     int age = text.nextInt();
     text.nextLine();
     String address = text.nextLine();
     int a = text.nextInt();
     int b = text.nextInt();
     int c = text.nextInt();
     int d = text.nextInt();
     int e = a+b+c;
     int f = e/d;
     double score = text.nextDouble();
     text.nextLine();
     String department = text.nextLine();
     System.out.println("My name is "+name);
     System.out.println("My age in " +age);
     System.out.println("I am from "+address);
     System.out.println("a= "+a);
     System.out.println("b= "+b);
     System.out.println("c= "+c);
     System.out.println("d= "+d);
     System.out.println("a+b+c= "+e);
     System.out.println("the final value is  "+f);
     System.out.println("Student name: "+name);
     System.out.println("Student Score: "+score/10);
     System.out.println("Student department: "+department);
    }
} 