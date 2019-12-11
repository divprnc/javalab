<%@ page import = "java.sql.*"%>

<%
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = null;
		con = DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
		ResultSet rs = null;
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		String query = null;
		query = "select uname,pwd from users where id = 1";
		Statement stmt = con.createStatement();
		rs = stmt.executeQuery(query);
		if(rs.next())
		{
			if(rs.getString("uname").equals(uname) && rs.getString("pwd").equals(pwd))
			{
				response.sendRedirect("Welcome.html");
			}
			else
			{
				out.println("Username and Passwords are Incorrect");
			}
		}
		
	}
	catch(Exception e)
	{
		out.println("Connection Failed");
	}
%>