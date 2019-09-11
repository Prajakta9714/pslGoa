<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Login</h3>

<form action = "login.do" method = "post">


<p>Login <input type ="text" name = "login"></p>

<p>Password <input type ="password" name = "password"></p>


<p><input type ="submit" name = "next"></p>


</form>
<p>${error}</p>
</body>
</html>