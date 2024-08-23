import java.io.*;
class student
{
	student(int rollno)
	{
		System.out.println("Rollno= "+rollno);
	}
}
public class people extends student
{
	people(int rollno,String name)
	{
		super(rollno);
		System.out.println("Name = "+name);
	}
	public static void main(String args[])throws IOException
	{
		String name;
		int rollno;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name: ");
		name=br.readLine();
		System.out.println("Enter Rollno: ");
		rollno=Integer.parseInt(br.readLine());
		people ob=new people(rollno,name);
	}
}
