package test;

import java.sql.*;

public class RegisterDao 
{
	public int k=0;
	public int insert(UserBean ub)
	{
		try {
			Connection con=DBConnection.getCon();
			String query="insert into UseReg67 values(?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, ub.getUname());
			ps.setString(2, ub.getPassword());
			ps.setString(3, ub.getFname());
			ps.setString(4, ub.getLname());
			ps.setString(5, ub.getCity());
			ps.setString(6, ub.getMid());
			ps.setLong(7, ub.getPhno());
			k=ps.executeUpdate();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return k;
		
	}
	
}
