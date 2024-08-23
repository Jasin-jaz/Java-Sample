import java.io.*;
class file
{
	public static void main(String args[])throws IOException
	{
		int i,j;
		FileInputStream fin1;
		FileWriter fout;
		FileInputStream fin2;
		try
		{
			fin1 = new FileInputStream("test1");
			fout = new FileWriter("test3");
			fin2 = new FileInputStream("test2");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error...File Not Found!!!");
			return;
		}
		do
		{
			i=fin1.read();
			if(i!=-1)
			fout.write((char) i);
		}while(i!= -1);
		fin1.close();
		do
		{
			j=fin2.read();
			if(j!=-1)
			fout.write((char) j);
		}while(j!= -1);
		fin2.close();
		fout.close();
		System.out.printf("Success\n");
	}
}
