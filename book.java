import java.io.*;
import java .sql.*;
public class book
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver is loaded Successfully");
		}
		catch(Exception e)
		{
			System.out.println("Invalid driver name!!!");
			e.printStackTrace(System.out);
		}
		Connection con=null;
		try
		{
			BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
			con=DriverManager.getConnection("jdbc:postgresql://localhost/books_details","jasin","jasin123");
			System.out.println("Connected to a database successfully");
			String book_name,book_author,search;
			int serial_no;
			CallableStatement cstmt=null;
			int ch;
			do
			{
				System.out.println("\nBOOK SHELF :\n1:ADD A NEW BOOK\n2:SEARCH AN EXISITING BOOK\n3:EXIT\n");
				System.out.println("Please enter your choice: ");
				ch=Integer.parseInt(kb.readLine());
				switch(ch)
				{
					case 1:
					System.out.println("Enter the book serial number: ");
					serial_no=Integer.parseInt(kb.readLine());
					System.out.println("Enter the book name: ");
					book_name=kb.readLine();
					System.out.println("Enter the author name: ");
					book_author=kb.readLine();
					cstmt = con.prepareCall("call add_book(?,?,?)");
					cstmt.setInt(1,serial_no);
					cstmt.setString(2,book_name);
					cstmt.setString(3,book_author);
					cstmt.execute();
					System.out.println("New book is added succesfully\n");
					break;
					case 2:
					System.out.println("Enter the book name to be searched: ");
					search=kb.readLine();
					cstmt = con.prepareCall("call search_book(?,?,?)");
					cstmt.registerOutParameter(1,Types.INTEGER);
					cstmt.registerOutParameter(2,Types.VARCHAR);
					cstmt.registerOutParameter(3,Types.VARCHAR);
					cstmt.setInt(1,0);
					cstmt.setString(2,search);
					cstmt.setString(3,null);
					cstmt.execute();
					System.out.println("\n-----------DETAILS OF THE BOOK YOU SEARCHED-----------\n"+cstmt.getInt(1)+"\t"+cstmt.getString(2)+"\t"+cstmt.getString(3));
					break;
					case 3:
					break;
				}
			}
			while(ch!=3);
		}
		catch(Exception e)
		{
			e.printStackTrace(System.out);
			System.out.println("error occured!!!");
		}
	}
}
