import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ShowData")
public class ShowData extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pr = response.getWriter();
		String fname = request.getParameter("f1");
		File f = new File(fname);
		if(f.exists())
		{
			pr.println(fname);
			BufferedReader br = new BufferedReader(new FileReader(f));
			String buffer = "";
			while((buffer = br.readLine()) != null)
			{
				pr.write(buffer);
				pr.flush();
				pr.println("</br>");
			}
			pr.close();
		}
		else
		{
			pr.println("<h1>File Does Not Exists</h1>");
		}
		
	}

	

}
