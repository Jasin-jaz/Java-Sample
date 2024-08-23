import java.io.*;
import java.sql.*;
public class elec_bill
{
	public static void main(String args[])throws IOException
	{
		try
		{
			Class.forName("org.postgresql.Driver");
			System.out.println("Connection Succesfull");
		}
		catch(Exception e)
		{
			System.out.println("Connection Failed");
			e.printStackTrace(System.out);
		}
		Connection con;
		try
		{
			con=DriverManager.getConnection("jdbc:postgresql://localhost/bill_db","jasin",
"jasin123");
			Statement stmt=con.createStatement();
			ResultSet rs;
			int consumer_number=0;
			String consumer_name=null;
			String address=null;
			double unit=0;
			BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("\nEnter Consumer number: ");
			String s = kb.readLine();
			int no = Integer.parseInt(s);
			rs=stmt.executeQuery("select * from electricity where consumer_number='"+s+"'");
			while(rs.next())
			{
				consumer_number=rs.getInt("consumer_number");
				consumer_name=rs.getString("consumer_name");
				address=rs.getString("address");
				unit=rs.getDouble("unit");
				System.out.println("-------------------------------------------");
				System.out.println(consumer_number+"\t"+consumer_name+"\t"+address+"\t"+unit);
			}
			double bill_amount;
			if(unit<100)
			{
				bill_amount=unit*1.40;
				System.out.println("Bill amount : "+bill_amount);
			}
			else if(unit<301)
			{
				bill_amount=(100*1.40)+(unit-100)*2.20;
				System.out.println("Bill amount : "+bill_amount);
			}
			else
			{
				bill_amount=(100*1.40)+(200*2.20)+(unit-300)*3;
				System.out.println("Bill amount : "+bill_amount);
			}
			System.out.println("-------------------------------------------");
		}
		catch(Exception e)
		{
			System.out.println("Failed to load electricity bill");
			e.printStackTrace(System.out);
		}
	}
}
