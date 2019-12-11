import java.sql.*;
public class Mysqlcon {
public static void main(String args[]) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from student where id=1");
		while(rs.next())
			System.out.println(rs.getInt("id") + " " + rs.getString("uname") + " " + rs.getString("pwd"));
		   con.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
