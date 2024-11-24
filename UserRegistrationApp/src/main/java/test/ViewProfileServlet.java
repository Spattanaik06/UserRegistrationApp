package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/viewProfile")
public class ViewProfileServlet extends HttpServlet
{
  protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
  {
	  Cookie c[]=req.getCookies();
	if(c==null)
	{
		req.setAttribute("msg", "Invalid session.....");
		req.getRequestDispatcher("msg.jsp").forward(req, res);
	}
	else
	{
		String fn=c[0].getValue();
		req.setAttribute("fname",fn);
		req.getRequestDispatcher("ViewProfile.jsp").forward(req, res);
	}
  }
}
