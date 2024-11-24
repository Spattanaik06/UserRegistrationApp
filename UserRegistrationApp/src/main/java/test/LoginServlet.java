package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/log")
public class LoginServlet extends HttpServlet
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		String uname = req.getParameter("uname");
		String password=req.getParameter("password");
		UserBean ub = new LoginDao().login(uname, password);

		if(ub==null)
		{
			req.setAttribute("msg", "Invalid Credential.....");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
		}
		else
		{
			Cookie ck=new Cookie("fname", ub.getFname());
			ServletContext sc=req.getServletContext();
			sc.setAttribute("ubean", ub);
			res.addCookie(ck);
			req.getRequestDispatcher("loginSuccess.jsp").forward(req, res);
		}
	}
}
