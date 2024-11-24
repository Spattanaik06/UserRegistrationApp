package test;
import java.sql.*;
public class LoginDao 
{
	public UserBean ub=null;
	public UserBean login(String uname,String password)
	{
		try {
			Connection con=DBConnection.getCon();
			String query="select * from UseReg67 where uname=? and password=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, uname);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				ub=new UserBean();
				ub.setUname(rs.getString(1));
				ub.setPassword(rs.getString(2));
				ub.setFname(rs.getString(3));
				ub.setLname(rs.getString(4));
				ub.setCity(rs.getString(5));
				ub.setMid(rs.getString(6));
				ub.setPhno(rs.getLong(7));
				
				
			}
		}
		catch (Exception e) {

			e.printStackTrace();
		}
		return ub;
		
	}
}
