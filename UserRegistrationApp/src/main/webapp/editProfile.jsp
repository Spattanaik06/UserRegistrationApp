<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="test.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
UserBean ub=(UserBean)application.getAttribute("ubean");
out.println("Edit Profile"+"<br>");
%>
<form action="update" method="post">
<input type="text" name="fname" value=<%=ub.getFname() %>><br>
<input type="text" name="lname" value=<%=ub.getLname() %>><br>
<input type="text" name="city" value=<%=ub.getCity() %>><br>
<input type="text" name="mid" value=<%=ub.getMid() %>><br>
<input type="text" name="phno" value=<%=ub.getPhno() %>><br>
<button type="submit">Update</button>



</form>
</body>
</html>