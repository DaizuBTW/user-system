<%@ page language="java" contentType="text/html; charset=utf-8"
	import="by.it.users.bean.User" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/style.css">
<title>Insert title here</title>
</head>
<body>
	<div class="form-auth-block">
		<jsp:useBean id="user" class="by.it.users.bean.User" scope="request" />
		<p>Ваше имя: <jsp:getProperty property="name" name="user" /></p>
		<p>Логин: <jsp:getProperty property="login" name="user" /></p>
		<p>Пароль: <jsp:getProperty property="password" name="user" /></p>
		<a href="index.jsp">На главную</a>
	</div>

</body>
</html>