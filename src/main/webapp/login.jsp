<%@ page language="java" contentType="text/html; charset=utf-8"
	import="by.it.users.bean.User" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="./css/style.css">
<title>Insert title here</title>
</head>
<body>
	<div class="form-auth-block">
		<h1>Вход</h1>
		<form action="Controller" method="post">
			<input type="hidden" name="command" value="authorization" /><br />
			<input type="text" name="login" placeholder="Логин" value="" /><br />
			<input type="password" name="password" placeholder="Пароль" value="" /><br />
			<input type="submit" value="Отправить" /><br />
			<a href="index.jsp">На главную</a>
		</form>
	</div>
</body>
</html>