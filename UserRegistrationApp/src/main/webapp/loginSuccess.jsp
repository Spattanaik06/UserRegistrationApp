<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="test.UserBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
UserBean ub=(UserBean)application.getAttribute("ubean");
out.println("WelCome Back,"+ub.getFname()+"<br>"+"<a href='viewProfile'>View Profile</a>");
%>

<a href="logout">Logout</a> 


</body>
</html>