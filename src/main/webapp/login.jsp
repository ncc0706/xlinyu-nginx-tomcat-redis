<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户登录</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/login">
	<label>username:</label><input type="text" name="username" placeholder="请输入用户名/Email"/><br/>
	<label>password:</label><input type="password" name="password" placeholder="密码"/><br/>
	<input type="submit" value="submit"/>&nbsp;&nbsp;
	<input type="reset" value="reset"/>
</form>
</body>
</html>