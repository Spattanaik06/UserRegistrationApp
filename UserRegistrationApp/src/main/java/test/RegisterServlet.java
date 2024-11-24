package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/reg")
public class RegisterServlet extends HttpServlet
{
 protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
 {
	 UserBean ub=new UserBean();
	 ub.setUname(req.getParameter("uname"));
	 ub.setPassword(req.getParameter("password"));
	 ub.setFname(req.getParameter("fname"));
	 ub.setLname(req.getParameter("lname"));
	 ub.setCity(req.getParameter("city"));
	 ub.setMid(req.getParameter("mid"));
	 ub.setPhno(Long.parseLong(req.getParameter("phno")));
	 
	 int k=new RegisterDao().insert(ub);
	 if(k>0)
	 {
		 req.setAttribute("msg","Registration Successfull....");
		 req.getRequestDispatcher("registersuccess.jsp").forward(req, res);
	 }
 }
}
