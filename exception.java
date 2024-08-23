import java.io.*;
class exception
{
	public static void main(String args[])throws IOException
	{
		int a,b,c;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		do
		{
			try
			{
				System.out.print("\nEnter 1st number: ");
				a=Integer.parseInt(br.readLine());
				System.out.print("Enter 2nd number: ");
				b=Integer.parseInt(br.readLine());
				c= a + b;
				System.out.print("The Sum of "+a+" + "+b+" is "+c+"\n");
				break;
			}
			catch (Exception e)
			{
				System.out.print("Illegal Value!!!\nPlease enter Integer Value\n");
			}
		}
		while(true);
	}
}
