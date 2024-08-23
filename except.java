import java.io.*;
class except
{
	public static void main(String args[])throws IOException
	{
		checkedex();
		uncheckedex();
	}
	static void checkedex() throws IOException
	{
		int a,b,c;
		System.out.println("\nChecked Exception Example\n");
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter first number: ");
			a = Integer.parseInt(br.readLine());
			System.out.println("Enter second number: ");
			b= Integer.parseInt(br.readLine());
			c= a/b;
			System.out.println("Remainder is :"+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by zero is not possible.\nPlease Input Non-Zero Value\n");
		}
	}
	static void uncheckedex() throws IOException
	{
		int x,y,z;
		System.out.println("\nUnChecked Exception Example\n");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first number: ");
		x = Integer.parseInt(br.readLine());
		System.out.println("Enter second number: ");
		y = Integer.parseInt(br.readLine());
		z=x/y;
		System.out.println("Remainder is: "+z);
	}
}
