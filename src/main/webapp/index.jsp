<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html>
<head>
	<meta charset="UTF-8">
	<title>tomcat+nginx+redis</title>
</head>
<body>
<h2>Hello World!</h2>
<p>服务器session:<%=session.getId() %>
<p><a href="${pageContext.request.contextPath }/logout">注销</a>
用户session:${sessionScope.u }
</body>
</html>
