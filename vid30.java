package learn_java;
// Constructor overloading
// Parameterized Constructor

public class vid30 {
// We can create a multiple constructor just by adding the variable
	vid30 ()
	{
		System.out.println("Hello");
	}
	vid30 (int a)
	{
		System.out.println(a);
		System.out.println("This is the a variable constructor");
	}
	vid30(int a, int b)
	{
		System.out.println("Second Constructor");
	}
	vid30(String a)
	{
		System.out.println("This is String");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vid30 ob1 = new vid30(10);
		vid30 ob2 = new vid30();
		vid30 ob3 = new vid30(10,10);
		vid30 ob4 = new vid30("Hari");
	}

}
