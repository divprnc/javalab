

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SessionCount")
public class SessionCount extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter pr = response.getWriter();
		HttpSession session = request.getSession(true);
		String id = session.getId();
		pr.println("<html>");
		pr.println("<head>");
		pr.println("</head>");
		pr.println("<body>");
		pr.println("Session id =   " + id);
		pr.println("</br></br>Session name =  " + session);
		Integer count = (Integer) session.getAttribute("sessiontest.counter");
		if(count == null)
		{
			count = 1;
		}
		else
		{
			count += 1;
		}
		session.setAttribute("sessiontest.counter", count);
		pr.println("</br> You have visited this page  " + count + "  times");
		pr.println("</body>");
		pr.println("</html>");
		
	}

	

}
