package learn_java;
import java.util.Scanner;
public class vid29 {
	void test(int a)
	{
		System.out.println("The entered value is 20");
	}
	public static void main(String [] args) {
		System.out.println("Enter the value");
		Scanner scan = new Scanner(System.in);
		int b = scan.nextInt();
		vid29 obj = new vid29();
		if(b==20)
		{
			obj.test(b);
		}
		
		
	}

}
