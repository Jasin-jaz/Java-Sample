import java.io.*;
class stud
{
	void display(int mark1,int mark2)
	{
		System.out.println("mark 1 : "+mark1);
		System.out.println("mark 2 : "+mark2);
		int sum=mark1+mark2;
		System.out.println("sum of marks = "+sum);
	}
}
class student
{
	public static void main(String arg[])
	{
		stud s1=new stud();
		s1.display(100,150);
	}
}
