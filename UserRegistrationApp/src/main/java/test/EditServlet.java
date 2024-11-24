package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/Edit")
public class EditServlet extends HttpServlet
{
 protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
 {
	Cookie c[]=req.getCookies();
	if(c==null)
	{
		req.setAttribute("msg", "Session Expired......");
		req.getRequestDispatcher("msg.jsp").forward(req, res);
	}
	else
	{
		String fn=c[0].getValue();
		req.setAttribute("fname", fn);
		req.getRequestDispatcher("editProfile.jsp").forward(req, res);
	}
 }
}
