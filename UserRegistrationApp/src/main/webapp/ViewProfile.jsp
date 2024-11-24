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
request.getAttribute("fname");
UserBean ub=(UserBean)application.getAttribute("ubean");
out.println("Hii ,"+ub.getFname()+"<br> ");
out.println("Personal  Information");
%>
<table>
<tr>
<td>Your First Name :</td>
<td><%=ub.getFname() %>
</td>
</tr>
<tr>
<td>Your  Last Name :</td>
<td><%=ub.getLname() %>
</td>
</tr>
<tr>
<td>Your City :</td>
<td><%=ub.getCity() %>
</td>
</tr>
<tr>
<td>Your MailId :</td>
<td><%=ub.getMid() %>
</td>
</tr>
<tr>
<td>Your Phone No :</td>
<td><%=ub.getPhno() %></td>
</tr>
</table>
<a href="Edit">Edit</a>
<a href="logout">Logout</a>
</body>
</html>