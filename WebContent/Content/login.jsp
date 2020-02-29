<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="home" method ="post">
	Hãy nhập mật khẩu (pass: ahihi, ID:nào cũng đc): <br>
	Username: <input type="text" value="" name ="username"><br>
	Password: <input type ="text" value ="" name ="password"><br>
		<input type ="submit" value="Đăng nhập">
	</form>
	<%= request.getAttribute("loginInfo") %>
</body>
</html>