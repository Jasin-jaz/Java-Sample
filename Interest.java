import java.io.*;
class Interest
{
	public static void main(String args[])throws IOException
	{
		float p,t,r;
		double c,s;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter principal amount :\t");
		p=Float.parseFloat(br.readLine());
		System.out.print("enter the time in year :\t");
		t=Float.parseFloat(br.readLine());
		System.out.print("enter the rate in percentege :\t");
		r=Float.parseFloat(br.readLine());
		s=(p*t*r)/100;
		c=p*(Math.pow(1+r/100,t)-1);
		System.out.println("simple interest = "+s);
		System.out.println("compound Interest= "+c);
	}
}
