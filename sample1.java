import java.io.*;
class cons
{
	cons()
	{
		System.out.println("This is a constructor");
	}
	public void finalize()
	{
		System.out.println("This is a destructor");
	}
}
class sample1
{
	public static void main(String args[])
	{
		cons c=new cons();
		c=null;
		System.gc();
	}
}
