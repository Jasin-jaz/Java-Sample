public class thread
{
	public static void main(String[] args)
	{
		Runnable e = new evenno();
		Thread t = new Thread(e);
		System.out.println("Even Numbers are :");
		t.start();
		Runnable o = new oddno();
		Thread t2 = new Thread(o);System.out.println("Odd Numbers are :");
		t2.start();
	}
}
class oddno implements Runnable
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			if(i%2 == 1)
			System.out.println(i);
		}
	}
}
class evenno implements Runnable
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			if(i%2 == 0)
			System.out.println(i);
		}
	}
}
