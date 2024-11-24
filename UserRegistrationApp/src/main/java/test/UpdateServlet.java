package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateServlet  extends HttpServlet
{
 protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
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
		
		ServletContext sct = req.getServletContext();
		UserBean ub=(UserBean) sct.getAttribute("ubean");
		ub.setFname(req.getParameter("fname"));
		ub.setLname(req.getParameter("lname"));
		ub.setCity(req.getParameter("city"));
		ub.setMid(req.getParameter("mid"));
		ub.setPhno(Long.parseLong(req.getParameter("phno")));
		int k=new UpdateDao().update(ub);
		
		if(k>0)
		{
			System.out.println("sedrfgtyhjik");
			req.setAttribute("msg", "profile updated Succesfully...");
			req.getRequestDispatcher("updateProfile.jsp").forward(req, res);
		}
	}
	
 }
}
