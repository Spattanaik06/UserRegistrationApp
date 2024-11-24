package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet
{
 protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
 {
	 Cookie c[]=req.getCookies();
	 if(c==null)
	 {
		 req.setAttribute("msg", "inavalid Session....");
		 req.getRequestDispatcher("msg.jsp").forward(req, res);
	 }
	 else
	 {
		 ServletContext sct=req.getServletContext();
		 sct.removeAttribute("ubean");
		 c[0].setMaxAge(0);
		 res.addCookie(c[0]);
		 req.getRequestDispatcher("logout.jsp").forward(req, res);
	 }
 }
}
