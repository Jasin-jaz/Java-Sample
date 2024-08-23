import java.io.*;
import java.lang.*;
interface area
{
	final static double pi=3.14;
	double calculate(float x);
}
class Circle implements area
{
	public double calculate(float x)
	{
		return(pi*x*x);
	}
}
class inter
{
	public static void main(String args[])throws IOException
	{
		float r;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Circle obj=new Circle();
		System.out.println("Enter radius");
		r=Float.parseFloat(br.readLine());
		System.out.println("Area of circle ="+obj.calculate(r));
	}
}
