<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Second Jsp</title>
</head>
<body>
	<h1>
		Your Information is below!
	</h1>
	<%
	
		out.println("<br>your id is:"+request.getParameter("a"));
		out.println("<br>your password is:"+request.getParameter("b"));
	%>
	<br><a href="loginpage.jsp">logingpage</a>
</body>
</html>