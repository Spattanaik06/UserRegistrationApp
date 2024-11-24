package test;


import java.sql.*;

public class UpdateDao {
	int k = 0;

	public int update(UserBean ub)
	{
	Connection con=DBConnection.getCon();
	String Query="update usereg67 set fname=?,lname=?,city=?,mid=?,phno=? where uname=? and password=?";
	try 
	{
		PreparedStatement ps=con.prepareStatement(Query);
		ps.setString(1, ub.getFname());
		ps.setString(2, ub.getLname());
		ps.setString(3, ub.getCity());
		ps.setString(4, ub.getMid());
		ps.setLong(5,ub.getPhno());
		ps.setString(6, ub.getUname());
		ps.setString(7, ub.getPassword());
		 k=ps.executeUpdate();
	}
	
	catch (SQLException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return k;
	}
}
