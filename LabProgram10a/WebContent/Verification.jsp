<%
	String username = request.getParameter("uname");
	String pwd = request.getParameter("pwd");
	
	if(username.equalsIgnoreCase("Prince") && pwd.equalsIgnoreCase("kmrprnc"))
	{
		response.sendRedirect("Welcome.html");
	}
	else
	{
		out.println("<h1>Username or Password are Incorrect</h1>");
	}
%>